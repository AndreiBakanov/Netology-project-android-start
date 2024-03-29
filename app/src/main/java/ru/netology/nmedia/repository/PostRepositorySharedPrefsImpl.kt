package ru.netology.nmedia.repository

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import ru.netology.nmedia.dto.Post
import ru.netology.nmedia.presentation.PostRepository

class PostRepositorySharedPrefsImpl(
    context: Context
) : PostRepository {

    private val gson = Gson()
    private val prefs = context.getSharedPreferences("prefs", Context.MODE_PRIVATE)
    private val key = "posts"
    private val typeToken = TypeToken.getParameterized(List::class.java, Post::class.java).type
    private var nextId = 1L
    private var posts = emptyList<Post>()
    set(value) {
        field = value
        sync()
    }

    private val data = MutableLiveData(posts)

    init {
        prefs.getString(key, null)?.let {
            posts = gson.fromJson(it, typeToken)
            nextId = (posts.maxOfOrNull { it.id } ?: 0) + 1
            data.value = posts
        }
    }

    override fun getAll(): LiveData<List<Post>> = data

    override fun save(post: Post) {
        if (post.id == 0L) {
            // TODO: remove hardcoded author & published
            posts = listOf(
                post.copy(
                    id = nextId++,
                    author = "Me",
                    likedByMe = false,
                    published = "now"
                )
            ) + posts
            data.value = posts
            return
        }

        posts = posts.map {
            if (it.id != post.id) it else it.copy(content = post.content)
        }
        data.value = posts
    }

    override fun removeById(id: Long) {
        posts = posts.filter { it.id != id }
        data.value = posts
    }

    override fun likeById(id: Long) {
        posts = posts.map {
//            if (it.id != id) it else it.copy(likedByMe = !it.likedByMe)
            when {
                it.id == id && it.likedByMe -> {
                    it.copy(likedByMe = !it.likedByMe, likes = (it.likes.toInt() - 1).toString())
                }
                it.id == id && !it.likedByMe -> {
                    it.copy(likedByMe = !it.likedByMe, likes = (it.likes.toInt() + 1).toString())
                }
                else -> it
            }
        }
        data.value = posts
    }

    override fun repostById(id: Long) {
        posts = posts.map {
            when {
                it.id == id && it.repostedByMe -> {
                    it.copy(repostedByMe = !it.repostedByMe, reposts = (it.reposts.toInt() - 1).toString())
                }
                it.id == id && !it.repostedByMe -> {
                    it.copy(repostedByMe = !it.repostedByMe, reposts = (it.reposts.toInt() + 1).toString())
                }
                else -> it
            }
        }
        data.value = posts
    }
    private fun sync() {
        prefs.edit().apply{
            putString(key, gson.toJson(posts))
            apply()
        }
    }
}


package ru.netology.nmedia.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.netology.nmedia.dto.Post
import ru.netology.nmedia.presentation.PostRepository

class PostRepositoryInMemoryImpl : PostRepository {
    private var post = Post(
        id = 1,
        author = "Нетология. Унмверситет интернет-профессий",
        published = "21 мая в 18:36",
        content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам: от новичков до уверенных профессионалов. Но самое важное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия — помочь встать на путь роста и начать цепочку перемен → http://netolo.gy/fyb",
        likedByMe = false,
        likes = "99999",
        repostedByMe = false,
        reposts = "999"
    )

    private val data = MutableLiveData(post)

    override fun get(): LiveData<Post> = data
    override fun like() {
        val newLikes = (if (post.likedByMe) post.likes.toInt() - 1 else post.likes.toInt() + 1).toString()
        post = post.copy(likedByMe = !post.likedByMe, likes = newLikes)
        data.value = post
    }
    override fun repost() {
        val newReposts = (if (post.repostedByMe) post.reposts.toInt() - 1 else post.reposts.toInt() + 1).toString()
        post = post.copy(repostedByMe = !post.repostedByMe, reposts = newReposts)
        data.value = post
    }
}
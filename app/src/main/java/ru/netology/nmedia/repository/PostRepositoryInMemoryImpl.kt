package ru.netology.nmedia.repository


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.netology.nmedia.dto.Post
import ru.netology.nmedia.presentation.PostRepository

class PostRepositoryInMemoryImpl : PostRepository {
    private var nextId = 1L
    private var posts = listOf(
        Post(
            id = nextId++,
            author = "Нетология. Унмверситет интернет-профессий",
            published = "21 мая в 19:36",
            content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам: от новичков до уверенных профессионалов. Но самое важное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия — помочь встать на путь роста и начать цепочку перемен → http://netolo.gy/fyb",
            likedByMe = false,
            likes = "99999",
            repostedByMe = false,
            reposts = "999",

        ),
        Post(
            id = nextId++,
            author = "Нетология. Унмверситет интернет-профессий",
            published = "23 мая в 17:20",
            content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу.",
            likedByMe = false,
            likes = "999",
            repostedByMe = false,
            reposts = "9999"
        ),
        Post(
            id = nextId++,
            author = "Нетология. Унмверситет интернет-профессий",
            published = "23 мая в 17:20",
            content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу.",
            likedByMe = false,
            likes = "999",
            repostedByMe = false,
            reposts = "9999"
        ),
        Post(
            id = nextId++,
            author = "Нетология. Унмверситет интернет-профессий",
            published = "23 мая в 17:20",
            content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу.",
            likedByMe = false,
            likes = "999",
            repostedByMe = false,
            reposts = "9999"
        ),
        Post(
            id = nextId++,
            author = "Нетология. Унмверситет интернет-профессий",
            published = "23 мая в 17:20",
            content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу.",
            likedByMe = false,
            likes = "999",
            repostedByMe = false,
            reposts = "9999"
        ),
        Post(
            id = nextId++,
            author = "Нетология. Унмверситет интернет-профессий",
            published = "23 мая в 17:20",
            content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам: от новичков до уверенных профессионалов. Но самое важное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия — помочь встать на путь роста и начать цепочку перемен → http://netolo.gy/fyb",
            likedByMe = false,
            likes = "999",
            repostedByMe = false,
            reposts = "9999"
        ),
        Post(
            id = nextId++,
            author = "Нетология. Унмверситет интернет-профессий",
            published = "23 мая в 17:20",
            content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу.",
            likedByMe = false,
            likes = "999",
            repostedByMe = false,
            reposts = "9999"
        ),Post(
            id = nextId++,
            author = "Нетология. Унмверситет интернет-профессий",
            published = "23 мая в 17:20",
            content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам: от новичков до уверенных профессионалов. Но самое важное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия — помочь встать на путь роста и начать цепочку перемен → http://netolo.gy/fyb",
            likedByMe = false,
            likes = "999",
            repostedByMe = false,
            reposts = "9999"
        ),Post(
            id = nextId++,
            author = "Нетология. Унмверситет интернет-профессий",
            published = "23 мая в 17:20",
            content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу.",
            likedByMe = false,
            likes = "999",
            repostedByMe = false,
            reposts = "9999"
        ),Post(
            id = nextId++,
            author = "Нетология. Унмверситет интернет-профессий",
            published = "23 мая в 17:20",
            content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу.",
            likedByMe = false,
            likes = "999",
            repostedByMe = false,
            reposts = "9999"
        ),Post(
            id = nextId++,
            author = "Нетология. Унмверситет интернет-профессий",
            published = "23 мая в 17:20",
            content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам: от новичков до уверенных профессионалов. Но самое важное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия — помочь встать на путь роста и начать цепочку перемен → http://netolo.gy/fyb",
            likedByMe = false,
            likes = "999",
            repostedByMe = false,
            reposts = "9999"
        ),Post(
            id = nextId++,
            author = "Нетология. Унмверситет интернет-профессий",
            published = "23 мая в 17:20",
            content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу.",
            likedByMe = false,
            likes = "999",
            repostedByMe = false,
            reposts = "9999"
        ),Post(
            id = nextId++,
            author = "Нетология. Унмверситет интернет-профессий",
            published = "23 мая в 17:20",
            content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу.",
            likedByMe = false,
            likes = "999",
            repostedByMe = false,
            reposts = "9999",
            video = "https://www.youtube.com/watch?v=WhWc3b3KhnY"
        ),
    ).reversed()

    private val data = MutableLiveData(posts)

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
}


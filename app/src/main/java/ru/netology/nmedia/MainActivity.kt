package ru.netology.nmedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.netology.nmedia.databinding.ActivityMainBinding
import ru.netology.nmedia.dto.Post

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val post = Post(
            id = 1,
            author = "Нетология. Унмверситет интернет-профессий",
            published = "21 мая в 18:36",
            content = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам: от новичков до уверенных профессионалов. Но самое важное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия — помочь встать на путь роста и начать цепочку перемен → http://netolo.gy/fyb",
            likedByMe = false,
            likes = 99999,
            repostedByMe = false,
            reposts = 999
        )

        with(binding){
            author.text = post.author
            published.text = post.published
            content.text = post.content
            textLike.text = post.likes.toString()
            textRepost.text = post.reposts.toString()
            shortNumber(textLike)
            shortNumber(textRepost)
            if (post.likedByMe){
                like.setImageResource(R.drawable.like)
            }
            if (post.repostedByMe){
                repost.setImageResource(R.drawable.repost)
            }

            repost.setOnClickListener{
                post.repostedByMe = !post.repostedByMe
                if (post.repostedByMe) post.reposts++ else post.reposts--
                repost.setImageResource(if(post.repostedByMe) R.drawable.reposted else R.drawable.repost)
                textRepost.text = post.reposts.toString()
                shortNumber(textRepost)

            }

            like.setOnClickListener{
                post.likedByMe = !post.likedByMe
                if (post.likedByMe) post.likes++ else post.likes--
                like.setImageResource(if(post.likedByMe) R.drawable.liked else R.drawable.like)
                textLike.text = post.likes.toString()
                shortNumber(textLike)

            }
        }
    }
}
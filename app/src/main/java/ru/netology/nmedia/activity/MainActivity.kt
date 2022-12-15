package ru.netology.nmedia.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import ru.netology.nmedia.R
import ru.netology.nmedia.databinding.ActivityMainBinding
import ru.netology.nmedia.presentation.PostViewModel

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val viewModel: PostViewModel by viewModels()
        viewModel.data.observe(this) { post ->
            with(binding) {
                author.text = post.author
                published.text = post.published
                content.text = post.content
                textLike.text = shortNumber(post.likes)
                textRepost.text = shortNumber(post.reposts)
                like.setImageResource(
                    if (post.likedByMe) R.drawable.liked else R.drawable.like
                )
                repost.setImageResource(
                    if(post.repostedByMe) R.drawable.reposted else R.drawable.repost
                )
            }
        }
        binding.like.setOnClickListener { viewModel.like() }
        binding.repost.setOnClickListener { viewModel.repost() }
    }
}
//Здравствуйте, можете пожалуйста подсказать почему код ниже компилируется, но приложение просто не запускается выходит сообщение netology project keeps stopping
//class MainActivity : AppCompatActivity() {
//
//    private val binding = ActivityMainBinding.inflate(layoutInflater)
//    private val viewModel: PostViewModel by viewModels()
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(binding.root)
//        subscribe()
//        setUpListeners()
//
//
//    }
//
//    private fun subscribe() {
//        viewModel.data.observe(this) { post ->
//            with(binding) {
//                author.text = post.author
//                published.text = post.published
//                content.text = post.content
//                like.setImageResource(
//                    if (post.likedByMe) R.drawable.liked else R.drawable.like
//                )
//            }
//        }
//    }
//
//    private fun setUpListeners() {
//        binding.like.setOnClickListener { viewModel.like() }
//    }
//}
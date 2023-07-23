package ru.netology.nmedia.activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import ru.netology.nmedia.R
import ru.netology.nmedia.adapter.OnInteractionListener
import ru.netology.nmedia.adapter.PostViewHolder
import ru.netology.nmedia.databinding.FragmentNewPostBinding
import ru.netology.nmedia.databinding.FragmentPostBinding
import ru.netology.nmedia.dto.Post
import ru.netology.nmedia.presentation.PostViewModel
import ru.netology.nmedia.util.AndroidUtils
import ru.netology.nmedia.util.LongArg
import ru.netology.nmedia.util.StringArg
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class PostFragment : Fragment() {

    companion object {
        var Bundle.postId by LongArg
    }


    private val viewModel: PostViewModel by viewModels(
        ownerProducer = ::requireParentFragment
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentPostBinding.inflate(
            inflater,
            container,
            false
        )
        val postViewHolder = PostViewHolder(binding.post, object : OnInteractionListener {
            override fun onEdit(post: Post) {
                viewModel.edit(post)
            }

            override fun onLike(post: Post) {
                viewModel.likeById(post.id)
            }

            override fun onRepost(post: Post) {
                viewModel.repostById(post.id)
                val intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    type = "text/plain"
                    putExtra(Intent.EXTRA_TEXT, post.content)
                }
                val chooser = Intent.createChooser(intent, getString(R.string.chooser_repost_post))
                startActivity(chooser)
            }

            override fun onWatch(post: Post) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(post.video))

                startActivity(intent)
            }

            override fun onRemove(post: Post) {
                viewModel.removeById(post.id)
            }


        })
        viewModel.data.observe(viewLifecycleOwner) { posts ->
            val post = posts.find {it.id == requireArguments().postId} ?: run {findNavController().navigateUp()
            return@observe}
            postViewHolder.bind(post)
        }


        return binding.root
    }







}
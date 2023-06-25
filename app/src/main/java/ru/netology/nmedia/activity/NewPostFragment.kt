package ru.netology.nmedia.activity

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContract
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import ru.netology.nmedia.databinding.FragmentNewPostBinding
import ru.netology.nmedia.presentation.PostViewModel
import ru.netology.nmedia.util.AndroidUtils

class NewPostFragment : Fragment() {

//    companion object {
//        var Bundle.textArg: String? by StringArg
//    }

    private val viewModel: PostViewModel by viewModels(
        ownerProducer = ::requireParentFragment
    )

    //Не понимаю почему функция не видет функцию edit, а также красным подсвечивается StringArg
    //Почему не могу добавить фрагмент fragment_new_post?
//    Также привел два варианта кода ниже, один из презентации, другой из гитхаба, почмеу они отличаются какого необходимо предерживаться?

//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        val binding = FragmentNewPostBinding.inflate(
//            inflater,
//            container,
//            false
//        )
//        binding.edit.requestFocus()
//        binding.ok.setOnClickListener {
//            val intent = Intent()
//            if (TextUtils.isEmpty(binding.edit.text)) {
//                activity?.setResult(Activity.RESULT_CANCELED, intent)
//            } else {
//                val content = binding.edit.text.toString()
//                intent.putExtra(Intent.EXTRA_TEXT, content)
//                activity?.setResult(Activity.RESULT_OK, intent)
//            }
//            findNavController().navigateUp()
//        }
//        return binding.root
//    }





//    View {
//        val binding = FragmentNewPostBinding.inflate(
//            inflater,
//            container,
//            false
//        )
//
//        arguments?.textArg
//            ?.let(binding.edit::setText)
//
//        binding.ok.setOnClickListener {
//            viewModel.changeContent(binding.edit.text.toString())
//            viewModel.save()
//            AndroidUtils.hideKeyboard(requireView())
//            findNavController().navigateUp()
//        }
//        return binding.root
//    }
}
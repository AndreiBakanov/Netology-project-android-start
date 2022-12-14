package ru.netology.nmedia

import android.widget.TextView

fun shortNumber (textNumber: TextView){
    when {
        textNumber.text.length > 3 && textNumber.text.length < 5 -> textNumber.text = textNumber.text[0] + "." + textNumber.text[1] + "К"
        textNumber.text.length > 4 && textNumber.text.length < 6 -> textNumber.text = textNumber.text[0] + "" + textNumber.text[1] + "К"
        textNumber.text.length > 5 && textNumber.text.length < 7 -> textNumber.text = textNumber.text[0] + "" + textNumber.text[1] + "" + textNumber.text[2] + "К"
        textNumber.text.length > 6 && textNumber.text.length < 8 -> textNumber.text = textNumber.text[0] + "." + textNumber.text[1] + "М"
        textNumber.text.length > 7 && textNumber.text.length < 9 -> textNumber.text = textNumber.text[0] + "" + textNumber.text[1] + "М"
        textNumber.text.length > 8 && textNumber.text.length < 10 -> textNumber.text = textNumber.text[0] + "" + textNumber.text[1] + "" + textNumber.text[2] + ""
    }
}
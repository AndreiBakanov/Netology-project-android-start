package ru.netology.nmedia.activity



fun shortNumber (value: String): String{
    when (value.length){
        4 -> return value[0] + "." + value[1] + "К"
        5 -> return value[0] + "" + value[1] + "К"
        6 -> return value[0] + "" + value[1] + "" + value[2] + "К"
        7 -> return value[0] + "." + value[1] + "М"
        8 -> return value[0] + "" + value[1] + "М"
        9 -> return value[0] + "" + value[1] + "" + value[2] + "М"
    }
    return value
}
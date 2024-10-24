package com.example.junitkotlin

class Helper {
    fun isPalindrome(input: String ): Boolean{
        var result = true
        for (index in input.indices){
            if (input[index] != input[input.lastIndex-index]){
                result = false
                break
            }
        }
        return result
    }
}
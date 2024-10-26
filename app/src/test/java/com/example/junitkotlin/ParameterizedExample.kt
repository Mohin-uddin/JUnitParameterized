package com.example.junitkotlin

import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class ParameterizedExample(val input:String, val expectation: Boolean) {

    @Test
    fun test(){
        val helper = Helper()
        val result = helper.isPalindrome(input)
        assertEquals(expectation,result)
    }
    companion object{
        @JvmStatic
        @Parameterized.Parameters(name = "{index} : {0} is palindrome - {1}")
        fun data(): List<Array<Any>>{
            return listOf(
                arrayOf("hello",false),
                arrayOf("AbbA", true),
                arrayOf("DAAd", true)
            )
        }
    }
}
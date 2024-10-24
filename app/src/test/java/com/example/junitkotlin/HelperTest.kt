package com.example.junitkotlin

import org.junit.Assert.*

import org.junit.Test

class HelperTest {

    @Test
    fun isPalindrome() {
        //Arrange
        val helper  = Helper()
        //Act
        val result = helper.isPalindrome("Mohin")
        //Assert
        assertEquals(false, result)
    }

    @Test
    fun isPalindrome_input_level_expectedTrue() {
        //Arrange
        val helper  = Helper()
        //Act
        val result = helper.isPalindrome("level")
        //Assert
        assertEquals(true, result)
    }
}
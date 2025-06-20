package com.example.testeableapp

import com.example.testeableapp.ui.Screens.calculateTip
import org.junit.Assert.assertEquals
import org.junit.Test

class TipAndRoundTest {
    @Test
    fun `calculate tip with 37 percent and roundUp true`() {
        val bill = 100.0
        val tipPercent = 37
        val roundUp = true

        val expected = 37.0
        val result = calculateTip(bill, tipPercent, roundUp)

        assertEquals(
            "Expected tip: $expected, but got: $result for bill=$bill, tipPercent=$tipPercent, roundUp=$roundUp",
            expected, result, 0.001
        )
    }
}
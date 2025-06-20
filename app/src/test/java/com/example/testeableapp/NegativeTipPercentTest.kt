
package com.example.testeableapp

import com.example.testeableapp.ui.Screens.calculateTip
import org.junit.Test
import kotlin.test.assertEquals

class NegativeTipPercentTest {
    @Test
    fun `calculate tip with negative tip percent should return 0`() {
        // Valores a introducir en la función
        val bill = 100.0
        val tipPercent = -10
        val roundUp = false
        // Llamamos a la función con un porcentaje de propina negativo
        val result = calculateTip(bill, tipPercent, roundUp)
        // Comprobamos que el resultado es 0
        println("Input: bill=$bill, tipPercent=$tipPercent, roundUp=$roundUp -> Result: $result (expected 0.0)")
        assertEquals(
            0.0,
            result,
            0.001,
            "Expected 0.0 but got $result for bill=$bill, tipPercent=$tipPercent, roundUp=$roundUp"
        )
    }
}
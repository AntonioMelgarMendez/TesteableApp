package com.example.testeableapp

import com.example.testeableapp.ui.Screens.calculateTip
import kotlin.test.Test
import kotlin.test.assertEquals

class NegativeInputValuesTest {
    @Test
    fun `calculate tip with negative amount should return 0`() {
        // Valores a introduccir en la función
        val bill = -100.0
        val tipPercent = 20
        val roundUp = false

        // Llamamos a la función con los valores negativos
        val result = calculateTip(bill, tipPercent, roundUp)

        // Comprobamos el resultado
        assertEquals(0.0, result,0.001)
        // El resultado debería ser 0, ya que no se puede calcular una propina con un monto negativo
    }
}
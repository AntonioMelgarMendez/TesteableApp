package com.example.testeableapp

import com.example.testeableapp.ui.Screens.calculateTip
import junit.framework.TestCase.assertEquals
import kotlin.div
import kotlin.test.Test

class BillZeroTest {
    @Test
    fun `tip and total per person are zero when bill is zero`() {
        // Definimos que la cuenta es 0 y colocamos un porcentaje de 20%
        val bill = 0.0
        val tipPercent = 20
        val roundUp = false
        val numberOfPeople = 2

        // Llamamos a la función de cálculo de propina y total por persona
        val tip = calculateTip(bill, tipPercent, roundUp)
        val totalPerPerson = if (numberOfPeople > 0) (bill + tip) / numberOfPeople else 0.0
        // Comprobamos que la propina y el total por persona son 0
        assertEquals(0.0, tip, 0.001)
        assertEquals(0.0, totalPerPerson, 0.001)
    }
}
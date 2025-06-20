package com.example.testeableapp

import com.example.testeableapp.ui.Screens.calculateTip
import kotlin.test.Test
import kotlin.test.assertEquals

class CalculateTotalPersonTest {
    @Test
    fun `calculate total per person with 3 people`() {
        // Valores a calcular en la funcion, ejemplo 3 personas
        val bill = 120.0
        val tipPercent = 10
        val roundUp = false
        val numberOfPeople = 3

        // Calculamos la propina y el total por persona
        val tip = calculateTip(bill, tipPercent, roundUp)
        val totalPerPerson = (bill + tip) / numberOfPeople

        // Comprobamos que el total por persona es correcto
        assertEquals(44.0, totalPerPerson)
    }

}
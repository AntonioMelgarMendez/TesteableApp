package com.example.testeableapp

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onNodeWithTag
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class VisibleUITest {
  @get:Rule
  val composeTestRule = createAndroidComposeRule<MainActivity>()

  @Test
  fun test_ui_elements_are_visible() {
    composeTestRule.onNodeWithText("Calculadora de Propinas").assertIsDisplayed()

    composeTestRule.onNodeWithText("Monto de la cuenta").assertIsDisplayed()

    composeTestRule.onNodeWithText("Porcentaje de propina: 15%").assertIsDisplayed()

    composeTestRule.onNodeWithTag("tipSlider").assertIsDisplayed()

    composeTestRule.onNodeWithText("Número de personas: 1").assertIsDisplayed()
    composeTestRule.onNodeWithText("-").assertIsDisplayed()
    composeTestRule.onNodeWithText("+").assertIsDisplayed()
    composeTestRule.onNodeWithText("1").assertIsDisplayed()

    composeTestRule.onNodeWithTag("roundTipCheckbox").assertIsDisplayed()
    composeTestRule.onNodeWithText("Redondear propina").assertIsDisplayed()

    composeTestRule.onNodeWithText("Propina: $0.00").assertIsDisplayed()
    composeTestRule.onNodeWithText("Total por persona: $0.00").assertIsDisplayed()
  }
}
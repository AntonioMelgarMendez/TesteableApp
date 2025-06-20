package com.example.testeableapp

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class InvalidAmountTest {
  @get:Rule
  val composeTestRule = createAndroidComposeRule<MainActivity>()

  @Test
  fun enable_rounding_and_verify_tip_changes() {
    composeTestRule.onNodeWithText("Monto de la cuenta").performTextInput("abc")

    composeTestRule.onNodeWithText("Propina: $0.00").assertExists()

    composeTestRule.onNodeWithText("Total por persona: $0.00").assertExists()
  }

}
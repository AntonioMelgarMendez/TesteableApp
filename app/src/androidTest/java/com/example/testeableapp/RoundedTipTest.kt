package com.example.testeableapp

import androidx.compose.ui.semantics.SemanticsActions
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performSemanticsAction
import androidx.compose.ui.test.performTextInput
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RoundedTipTest {
  @get:Rule
  val composeTestRule = createAndroidComposeRule<MainActivity>()

  @Test
  fun enable_rounding_and_verify_tip_changes() {
    composeTestRule.onNodeWithText("Monto de la cuenta").performTextInput("95.5")

    composeTestRule.onNodeWithText("Propina: $14.33").assertExists()

    composeTestRule.onNodeWithTag("roundTipCheckbox").performClick()

    composeTestRule.onNodeWithText("Propina: $15.00").assertExists()
  }

}
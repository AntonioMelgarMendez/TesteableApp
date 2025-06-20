package com.example.testeableapp

import androidx.compose.ui.semantics.SemanticsActions
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performSemanticsAction
import androidx.compose.ui.test.performTextInput
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TipSliderTest {
  @get:Rule
  val composeTestRule = createAndroidComposeRule<MainActivity>()

  @Test
  fun change_tip_percentage_slider_and_verify_tip() {
    composeTestRule.onNodeWithText("Monto de la cuenta").performTextInput("100")

    composeTestRule.onNodeWithTag("tipSlider")
      .performSemanticsAction(SemanticsActions.SetProgress) { it(20f) }


    composeTestRule.onNodeWithText("Porcentaje de propina: 20%").assertIsDisplayed()

    composeTestRule.onNodeWithText("Propina: $20.00").assertIsDisplayed()
  }
}
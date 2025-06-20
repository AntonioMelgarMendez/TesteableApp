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
class ChangeNumberOfPeopleTest {
  @get:Rule
  val composeTestRule = createAndroidComposeRule<MainActivity>()

  @Test
  fun changingNumberOfPeople_affectsTotalPerPerson() {
    composeTestRule.onNodeWithText("Monto de la cuenta").performTextInput("100")

    composeTestRule.onNodeWithText("Total por persona: $115.00").assertExists()

    composeTestRule.onNodeWithText("+").performClick()

    composeTestRule.onNodeWithText("Total por persona: $57.50").assertExists()
  }
}
package com.example.assignment1huddleup

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.assignment1huddleup.ui.theme.Assignment1HuddleUpTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        /* Declaring Variables
        val is constant that can not be changed
        Declaring these variables connects my code to the elements on the screen:
         EditText- this is where the user types in the time of the day
         TextView- this is where the user results will be displayed
         Button - actions. the user can click the button to check for their answer and reset to clear the text and input a different time of day.
         */
        val timeInput = findViewById<EditText>(R.id.editTime)
        val activityText = findViewById<TextView>(R.id.txtResult)
        val checkButton = findViewById<Button>(R.id.btnCheck)
        val resetButton = findViewById<Button>(R.id.btnReset)

        /* ButtonCheck and using IF ELSE Statements
        Here is where I have programed my program to give certain results according to different times of day
        using the if else statements(Decision making)
        This is the core logic of my app depending on what time the user enters and the app suggests an activity/message to send
        Pressing the button will display the results of the time the user has inputted at the EditText and reads what the user has typed
        the a uppercase() allows the user to to type in the time of day in Small caps or Big caps
        the data type used is String if the user inputs a different data type,
        the program will suggest that the user must input an answer according to the data type that meant for this app/program
         */


        checkButton.setOnClickListener {
            val time = timeInput.text.toString().uppercase()

            if (time == "MORNING") {
                activityText.text = "Send a Good Morning text to family member"
            }
            else if (time == "MID-MORNING") {
                activityText.text = "Reach out to a colleague with a quick Thank You"
            }
            else if (time == "AFTERNOON") {
                activityText.text = "Share a funny meme or interesting link with a friend"
            }
            else if (time == "AFTERNOON SNACK TIME") {
                activityText.text = "Send a quick thinking of you text message"
            }
            else if (time == "DINNER") {
                activityText.text = "Call a friend or relative for 5 minute catch-up"
            }
            else if (time == "AFTER DINNER") {
                activityText.text = "Leave a thoughtful comment on a friend's post"
            }
            else {
                activityText.text =
                    "Please Enter one of the following : morning,afternoon, mid-morning,afternoon snack time,dinner,after dinner"
            }

            /*ResetButton
            I have made the reset button work in a way where it clears up and refreshes the app
            so that after clearing the user can input a different time of the day.
             */

            //Reset Button
            resetButton.setOnClickListener {
                timeInput.text.clear()
                activityText.text = "Activity will appear here"


            }

        }
    }
}




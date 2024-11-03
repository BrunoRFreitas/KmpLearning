package com.brfdev.helloworld

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    var name by remember { mutableStateOf(TextFieldValue("")) }
    var lastName by remember { mutableStateOf(TextFieldValue("")) }
    var birthdayDate by remember { mutableStateOf(TextFieldValue("")) }
    var hourOfBirth by remember { mutableStateOf(TextFieldValue("")) }
    var placeOfBirth by remember { mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var cellphone by remember { mutableStateOf(TextFieldValue("")) }

    MaterialTheme {
        Box(
            modifier = Modifier.fillMaxSize().background(deepSpaceGradient).padding(16.dp),
            contentAlignment = Alignment.Center,
        ) {
            Column(
                modifier = Modifier
                    .wrapContentWidth()
                    .padding(16.dp)
                    .background(
                        color = Color(0xFFFFFFFF).copy(alpha = 0.15f), // Soft semi-transparent color
                        shape = RoundedCornerShape(16.dp)
                    )
//                    .graphicsLayer {
//                        shadowElevation = 8.dp.toPx()
//                        shape = RoundedCornerShape(16.dp)
//                        clip = true
//                    }
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Astrology",
                    style = MaterialTheme.typography.h2,
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Input field with complementary style
                TextField(
                    value = name,
                    onValueChange = {},
                    label = { Text("Nome", color = Color.White.copy(alpha = 0.8f)) },
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = Color.White,
                        backgroundColor = Color.Transparent,
                        cursorColor = Color.White,
                        unfocusedIndicatorColor = Color.White.copy(alpha = 0.5f),
                        focusedIndicatorColor = Color.White
                    ),
                    modifier = Modifier.wrapContentWidth()
                )

                Spacer(modifier = Modifier.height(16.dp))

                TextField(
                    value = lastName,
                    onValueChange = {},
                    label = { Text("Sobrenome", color = Color.White.copy(alpha = 0.8f)) },
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = Color.White,
                        backgroundColor = Color.Transparent,
                        cursorColor = Color.White,
                        unfocusedIndicatorColor = Color.White.copy(alpha = 0.5f),
                        focusedIndicatorColor = Color.White
                    ),
                    modifier = Modifier.wrapContentWidth()
                )

                Spacer(modifier = Modifier.height(16.dp))

                TextField(
                    value = birthdayDate,
                    onValueChange = {},
                    label = { Text("Data nascimento", color = Color.White.copy(alpha = 0.8f)) },
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = Color.White,
                        backgroundColor = Color.Transparent,
                        cursorColor = Color.White,
                        unfocusedIndicatorColor = Color.White.copy(alpha = 0.5f),
                        focusedIndicatorColor = Color.White
                    ),
                    modifier = Modifier.wrapContentWidth()
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Another input field for the form
                TextField(
                    value = hourOfBirth,
                    onValueChange = {},
                    label = { Text("Hora nascimento", color = Color.White.copy(alpha = 0.8f)) },
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = Color.White,
                        backgroundColor = Color.Transparent,
                        cursorColor = Color.White,
                        unfocusedIndicatorColor = Color.White.copy(alpha = 0.5f),
                        focusedIndicatorColor = Color.White
                    ),
                    modifier = Modifier.wrapContentWidth()
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Another input field for the form
                TextField(
                    value = placeOfBirth,
                    onValueChange = {},
                    label = { Text("Local de nascimento", color = Color.White.copy(alpha = 0.8f)) },
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = Color.White,
                        backgroundColor = Color.Transparent,
                        cursorColor = Color.White,
                        unfocusedIndicatorColor = Color.White.copy(alpha = 0.5f),
                        focusedIndicatorColor = Color.White
                    ),
                    modifier = Modifier.wrapContentWidth()
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Another input field for the form
                TextField(
                    value = email,
                    onValueChange = {},
                    label = { Text("Email", color = Color.White.copy(alpha = 0.8f)) },
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = Color.White,
                        backgroundColor = Color.Transparent,
                        cursorColor = Color.White,
                        unfocusedIndicatorColor = Color.White.copy(alpha = 0.5f),
                        focusedIndicatorColor = Color.White
                    ),
                    modifier = Modifier.wrapContentWidth()
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Another input field for the form
                TextField(
                    value = cellphone,
                    onValueChange = {},
                    label = { Text("Celular", color = Color.White.copy(alpha = 0.8f)) },
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = Color.White,
                        backgroundColor = Color.Transparent,
                        cursorColor = Color.White,
                        unfocusedIndicatorColor = Color.White.copy(alpha = 0.5f),
                        focusedIndicatorColor = Color.White
                    ),
                    modifier = Modifier.wrapContentWidth()
                )


                Spacer(modifier = Modifier.height(16.dp)) // Spacing between the TextField and Button

                // Submit button
                Button(
                    onClick = {
                    },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = MaterialTheme.colors.primary, // Background color
                        contentColor = Color.White // Text color
                    ),
                    modifier = Modifier.wrapContentWidth() // Full width
                ) {
                    Text(text = "Meu mapa") // Button text
                }
            }
        }
    }
}

val deepSpaceGradient = Brush.radialGradient(
    colors = listOf(
        Color(0xFF0B0033), // Dark Blue
        Color(0xFF2E1A47), // Deep Purple
        Color(0xFF1A005F)  // Midnight Indigo
    ),
    radius = 800f
)

val galaxyGlowGradient = Brush.linearGradient(
    colors = listOf(
        Color(0xFF000000), // Black
        Color(0xFF3D0075), // Violet
        Color(0xFF0093D6), // Turquoise
        Color(0xFFFF007F)  // Magenta
    ),
    start = Offset.Zero,
    end = Offset.Infinite,
)

val stardustBackground = Brush.linearGradient(
    colors = listOf(
        Color(0xFF1A1A40), // Dark Indigo
        Color(0xFF000033)  // Midnight Blue
    )
)

// To create the stardust effect, you can overlay soft radial spots
val stardustSpot = Brush.radialGradient(
    colors = listOf(
        Color(0xFFFFFFFF).copy(alpha = 0.15f), // Soft White, low opacity
        Color.Transparent
    ),
    radius = 50f
)
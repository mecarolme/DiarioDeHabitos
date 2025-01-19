package com.dev.diariodehabitos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.dev.diariodehabitos.ui.theme.DiarioDeHabitosTheme
import androidx.navigation.compose.*
import com.dev.diariodehabitos.ui.screens.HomeScreen
import com.dev.diariodehabitos.ui.screens.LoginScreen
import com.dev.diariodehabitos.ui.screens.RegisterScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiarioDeHabitosTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "login") {
                    composable("login") { LoginScreen(navController) }
                    composable("register") { RegisterScreen(navController) }
                    composable("home") { HomeScreen() }
                }
            }
        }
    }
}
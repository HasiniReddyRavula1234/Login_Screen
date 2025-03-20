package com.example.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent


import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import androidx.navigation.compose.NavHost

class MainActivity : ComponentActivity()
     {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        setContent{
            val navController= rememberNavController()
                NavHost(navController = navController, startDestination = "ScreenA", builder = {
                    composable("screenA")
                    {
                        ScreenA(navController)
                    }
                    composable("screenB/{username}") { backStackEntry ->
                        val username = backStackEntry.arguments?.getString("username")

                        ScreenB(navController,username)
                    }

            })



        }
    }
}



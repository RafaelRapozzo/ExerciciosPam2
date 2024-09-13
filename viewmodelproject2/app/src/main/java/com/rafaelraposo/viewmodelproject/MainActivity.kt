package com.rafaelraposo.viewmodelproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rafaelraposo.viewmodelproject.ui.theme.ViewmodelprojectTheme
import com.rafaelraposo.viewmodelproject.view.MainView
import com.rafaelraposo.viewmodelproject.view.MainViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel: MainViewModel = MainViewModel()

        setContent {
            ViewmodelprojectTheme {

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainView( modifier = Modifier.padding(innerPadding), viewModel = viewModel)
                }

            }
        }
    }
}


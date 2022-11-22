package android.realproject.converter

import android.os.Bundle
import android.realproject.converter.data.view_model.InputValueUserViewModel
import android.realproject.converter.data.view_model.ResultViewModel
import android.realproject.converter.data.view_model.factory.InputValueViewModelFactory
import android.realproject.converter.model.navigation.ApplicationNavHost
import android.realproject.converter.ui.theme.BgColor
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import android.realproject.converter.ui.theme.ConverterTheme
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val systemUiController = rememberSystemUiController()
            DisposableEffect(systemUiController) {
                systemUiController.setSystemBarsColor(
                    color = Color.Black,
                    darkIcons = false
                )

                onDispose {  }
            }
            
            ConverterTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    val navController = rememberNavController()
                    val inputValueUserViewModel: InputValueUserViewModel by viewModels(
                        factoryProducer = {
                            InputValueViewModelFactory(navController = navController)
                        }
                    )
                    val resultViewModel: ResultViewModel by viewModels()

                    ApplicationNavHost(
                        navController = navController,
                        inputValueUserViewModel = inputValueUserViewModel,
                        resultViewModel = resultViewModel
                    )
                }
            }
        }
    }
}


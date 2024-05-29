package parag.ui.rentalappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import parag.ui.rentalappui.ui.theme.RentalAppUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RentalAppUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = Color.Black
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    Column (modifier = Modifier.fillMaxSize()){
        TopBarView()
        RentDisplayView()
    }
}

@Preview
@Composable
fun Preview(){
    MainScreen()
}


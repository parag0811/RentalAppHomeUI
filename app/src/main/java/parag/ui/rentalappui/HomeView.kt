package parag.ui.rentalappui

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.NotificationsNone
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import parag.ui.rentalappui.ui.theme.GreenCyan
import parag.ui.rentalappui.ui.theme.RentalAppUITheme
import parag.ui.rentalappui.ui.theme.sofiaFontFamily

@Preview
@Composable
fun TopAppBarPreview() {
    RentalAppUITheme{
        TopBarView()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun TopBarView() {

    val context = LocalContext.current.applicationContext

   TopAppBar(title = { Text(
       text = "Rent App",
       fontFamily = sofiaFontFamily,
       fontWeight = FontWeight.SemiBold,
       fontSize = 24.sp
       ) },
       navigationIcon = {
            IconButton(onClick = { Toast.makeText(context, "Home Screen", Toast.LENGTH_SHORT).show()}) {
                Icon(
                    painter = painterResource(id = R.drawable.hamburger_icon),
                    contentDescription = null,
                    tint = Color.Black
                )
            }
       },
       colors = TopAppBarDefaults.topAppBarColors(
           containerColor = GreenCyan,
           titleContentColor = Color.Black
       ), actions = {
           Box(modifier = Modifier.height(36.dp).width(100.dp).clip(RoundedCornerShape(30.dp)).shadow(12.dp).background(Color.White)){
           IconButton(onClick = {  }) {
               Icon(imageVector = Icons.Filled.Search, contentDescription = null, tint = Color.Black)
           } }
           IconButton(onClick = {  }) {
               Icon(imageVector = Icons.Filled.NotificationsNone, contentDescription = null, tint = Color.Black, modifier = Modifier.size(28.dp))
           }
       },
       modifier = Modifier.shadow(12.dp) //Looks elevated instead of using elevation
   )
}


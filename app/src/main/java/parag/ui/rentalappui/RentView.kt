package parag.ui.rentalappui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import parag.ui.rentalappui.ui.theme.GreenCyan
import parag.ui.rentalappui.ui.theme.poppinsFontFamily

@Preview
@Composable
fun RentDisplayView() {
    Column {
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .height(40.dp)
            .clip(RoundedCornerShape(16.dp))
            .shadow(12.dp)
            .background(color = Color.White)
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 8.dp)
            ){
                IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Filled.LocationOn, contentDescription = null, tint = Color.Black)
                }
                Text(
                    text = "Location",
                    fontSize = 18.sp,
                    color = Color.Black,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
        }
        Box(modifier = Modifier
            .padding(start = 8.dp, end = 8.dp)
            .fillMaxWidth()
            .aspectRatio(1.5f)
            .clip(RoundedCornerShape(16.dp))
        ){
            Image(painter = painterResource(
                id = R.drawable.rentimage4),
                contentDescription = null,
                alignment = Alignment.TopCenter,
                modifier = Modifier
                    .fillMaxSize()
                    .shadow(6.dp),
                contentScale = ContentScale.Crop
            )
        }
        Row (
            modifier = Modifier.padding(top = 16.dp, bottom = 8.dp, end = 8.dp, start = 8.dp)
        ) {
            Box(
                modifier = Modifier
                    .height(36.dp)
                    .width(115.dp)
                    .clip(RoundedCornerShape(18.dp))
                    .shadow(12.dp)
                    .background(GreenCyan)
                    .clickable { }
            ){
                Text(
                    text = "Rent Flat",
                    fontSize = 16.sp,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black,
                    modifier = Modifier.align(Alignment.Center)
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Box(
                modifier = Modifier
                    .height(36.dp)
                    .width(115.dp)
                    .clip(RoundedCornerShape(18.dp))
                    .shadow(12.dp)
                    .background(GreenCyan)
                    .clickable { }
            ){
                Text(
                    text = "PG/Hostel",
                    fontSize = 16.sp,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black,
                    modifier = Modifier.align(Alignment.Center)
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Box(
                modifier = Modifier
                    .height(36.dp)
                    .width(115.dp)
                    .clip(RoundedCornerShape(18.dp))
                    .shadow(12.dp)
                    .background(GreenCyan)
                    .clickable { }
            ){
                Text(
                    text = "Flatmates",
                    fontSize = 16.sp,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black,
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
        RentList(rentData = rentDatas)
    }
}
@Composable
fun RentList(rentData: List<RentData>) {
    LazyColumn {
        items(rentData) { item ->
            RentViewDetails(item)
            Divider(modifier = Modifier.padding(horizontal = 16.dp))
        }
    }
}

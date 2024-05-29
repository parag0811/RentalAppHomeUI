package parag.ui.rentalappui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import parag.ui.rentalappui.ui.theme.nanugothic
import parag.ui.rentalappui.ui.theme.poppinsFontFamily


val rentDatas = listOf(
    RentData(R.drawable.rentimage1, "2BHK Apartment", "123 Main Street, New Delhi, India", "₹5000"),
    RentData(R.drawable.rentimage2, "Hostel Apartment", "E-504, Civil Lines, Jaipur, India", "₹4000")
)


//Displaying Rent Data in the composable

@Composable
fun RentViewDetails(data : RentData) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, end = 8.dp, start = 8.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(color = Color.White)
    ){
        Column{
            Image(
                painter = painterResource(id = data.rentImg),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(16.dp)),
                contentScale = ContentScale.Crop
            )
            Text(
                text = data.rentTitle,
                fontFamily = nanugothic,
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 12.dp, end = 8.dp, bottom = 4.dp, top = 4.dp)
            )
            Row (
                modifier = Modifier.padding(start = 12.dp, end = 8.dp, bottom = 12.dp)
            ){
                Text(
                    text = "Address: " + data.rentAddress,
                    fontFamily = nanugothic,
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.weight(1f).padding(end = 4.dp)
                )
                Box(
                    modifier = Modifier
                        .height(30.dp)
                        .width(90.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .shadow(12.dp)
                        .background(GreenCyan)
                        .clickable { }
                        .align(Alignment.CenterVertically)
                ){
                    Text(
                        text = "Rent: " + data.rentPay,
                        fontSize = 12.sp,
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Black,
                        modifier = Modifier
                            .align(Alignment.Center)
                    )
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewRentViewDetails() {

    val rentDatas = (
        RentData(R.drawable.rentimage1, "2BHK Apartment", "123 Main Street, New Delhi, India", "₹5000")
    )

    RentViewDetails(data = rentDatas)
}

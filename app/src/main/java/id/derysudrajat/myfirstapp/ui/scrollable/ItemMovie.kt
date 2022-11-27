package id.derysudrajat.myfirstapp.ui.scrollable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.derysudrajat.myfirstapp.R

@Composable
fun ItemMovie(imageResId: Int) {
    Image(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .clip(RoundedCornerShape(8.dp)),
        painter = painterResource(id = imageResId), contentDescription = "",
        contentScale = ContentScale.Crop
    )
}

@Preview
@Composable
private fun PreviewItemMovie() {
    ItemMovie(imageResId = R.drawable.backdrop_2)
}
package id.derysudrajat.myfirstapp.ui.scrollable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ListBanner() {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item { Text(text = "Ini Pertama") }
        items(MovieDatasource.getAllMovie()) {
            ItemMovie(imageResId = it)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewListBanner() {
    ListBanner()
}


package id.derysudrajat.myfirstapp.ui.scrollable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SampleGridList() {
    Column {
        Text(text = "Hello")
        LazyVerticalGrid(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            columns = GridCells.Fixed(2)
        ) {
            items(MovieDatasource.getAllMovie()) {
                ItemMovie(imageResId = it)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewSampleGridList() {
    SampleGridList()
}
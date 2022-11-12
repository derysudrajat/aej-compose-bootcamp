package id.derysudrajat.myfirstapp.ui.lemonade

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.derysudrajat.myfirstapp.R

@Preview(showBackground = true)
@Composable
fun LemonadeApp() {
    var currentStep by remember { mutableStateOf(1) }
    var countSqueeze by remember { mutableStateOf(2) }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        when (currentStep) {
            1 -> {
                TextAndImageLemonade(
                    "Tap the lemon tree to select a lemon",
                    R.drawable.lemon_tree
                ) {
                    currentStep = 2
                    countSqueeze = (2..4).random()
                }
            }
            2 -> {
                TextAndImageLemonade(
                    "Keep tapping the lemon to squeeze it",
                    R.drawable.lemon_squeeze
                ) {
                    countSqueeze--
                    if (countSqueeze == 0) currentStep = 3
                }
            }
            3 -> {
                TextAndImageLemonade(
                    "Tap the lemonade to drink it",
                    R.drawable.lemon_drink
                ) {
                    currentStep = 4
                }
            }
            4 -> {
                TextAndImageLemonade(
                    "Tap the empty glass to start again",
                    R.drawable.lemon_restart
                ) {
                    currentStep = 1
                }
            }
        }
    }
}

@Composable
fun TextAndImageLemonade(
    label: String,
    image: Int,
    onImageClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = label)
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            painter = painterResource(id = image),
            contentDescription = "",
            modifier = Modifier
                .wrapContentSize()
                .clickable(onClick = onImageClick)
        )
    }
}
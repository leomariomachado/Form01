package com.andios.form01

import android.os.Bundle
import android.widget.Space
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.foundation.TextField
import androidx.ui.layout.Column
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.andios.form01.ui.Form01Theme


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Form01Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    loadUI()
                }
            }
        }
    }
}

@Composable
fun loadUI(){
    Column {
        Text("Bem vindo a Andios")
        Text("Digite seu email")
    }

}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Form01Theme {
        loadUI()
    }
}
package kr.ac.kumoh.ce.s20180474.copyintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat.startActivity
import kr.ac.kumoh.ce.s20180474.copyintent.ui.theme.CopyIntentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CopyIntentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("hello")
                }
            }
        }
    }
}

@Composable
fun Greeting(name:String,modifier:Modifier=Modifier){
    val context=LocalContext.current
    Column(
        modifier=modifier
    ){
        Button(
            modifier=modifier,
            onClick={
                val intent=Intent(context,SecondActivity::class.java)
                startActivity(context,intent,null)
            }
        ){
            Text("Activity")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CopyIntentTheme {
        Greeting("Android")
    }
}
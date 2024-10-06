package tn.esprit.androidbodyjpc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tn.esprit.androidbodyjpc.R
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            android()

        }
    }


    @Composable
    fun head() {
        Image(
            painter = painterResource(id = R.drawable.head),
            contentDescription = "head"
        )
    }

    @Composable
    fun body() {

        Image(
            painter = painterResource(id = R.drawable.body),
            contentDescription = "body"
        )
    }

    @Composable
    fun leg(){
        Image(
            painter = painterResource(id = R.drawable.leg),
            contentDescription = "leg"

        )
    }

    @Composable
    fun hand(){
        Image(
            painter = painterResource(id = R.drawable.hand),
            contentDescription = "hand"

        )
    }

    @Preview
    @Composable
    fun android (){
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize() // Fill entire screen
                     ) {

            head()
            Spacer(modifier = Modifier.height(1.dp))
            Row (
                horizontalArrangement = Arrangement.SpaceBetween,

            ){ hand()
                Spacer(modifier = Modifier.width(1.dp))
            body()
                Spacer(modifier = Modifier.width(1.dp))
            hand()

            }
            Spacer(modifier = Modifier.height(1.dp))
            Row {
                leg()
                Spacer(modifier = Modifier.width(16.dp))
                leg()
            }
        }
    }


}

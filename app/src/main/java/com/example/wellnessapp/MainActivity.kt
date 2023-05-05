package com.example.wellnessapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wellnessapp.data.Wellness
import com.example.wellnessapp.ui.theme.Grey50
import com.example.wellnessapp.ui.theme.WellnessAppTheme
import com.example.wellnessapp.model.Datasource.wellness


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WellnessAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    wellnessApp()
                }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun wellnessApp(){

    Scaffold(
        topBar = {wellnessTopBar()}
    ){
        LazyColumn(modifier = Modifier
            .padding(it)
            .background(Color.White)){

            items(wellness){
                wellnessItem -> wellnessCard(wellnessItem)
            }

        }

    }

}


@Composable
fun wellnessTopBar(modifier:Modifier=Modifier){

    Row(modifier= modifier
        .fillMaxWidth()
        .background(MaterialTheme.colorScheme.background)
        .height(70.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center){

            Text(text = "7 days Wellness", style = MaterialTheme.typography.displayLarge)
            }

}

@Composable
fun wellnessCard(wellness2: Wellness,modifier: Modifier = Modifier){

    var expend by remember { mutableStateOf(false) }

    Card(modifier = Modifier
        .padding(5.dp)
        .border(2.dp, color = Color.LightGray),
         colors = CardDefaults.cardColors(Color.White),
         elevation = CardDefaults.cardElevation(5.dp)){

        Column {
            wellnessTitle(day = wellness2.day, title = wellness2.day_title)
            wellessClick(image = wellness2.day_image, onClick = {expend = true})

            if(expend) {
                wellnessInformation(content = wellness2.day_content)
                expend = !expend
            }

    }


    }

}

@Composable
fun wellnessTitle(@StringRes day:Int, @StringRes title:Int){
    Column(){

        Text(stringResource(id = day),style = MaterialTheme.typography.displayMedium, color = Grey50)
        Text(stringResource(id = title),style = MaterialTheme.typography.displaySmall, color = Color.Black)


    }

}

@Composable
fun wellessClick(@DrawableRes image:Int,onClick:()->Unit){

    Image(painterResource(id = image),contentDescription = null,  modifier= Modifier
        .clickable { onClick }
        .size(60.dp))

}


@Composable
fun wellnessInformation(@StringRes content: Int, modifier: Modifier = Modifier){

    Text(stringResource(id = content), style = MaterialTheme.typography.bodyMedium)

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WellnessAppTheme {
        wellnessApp()
    }
}
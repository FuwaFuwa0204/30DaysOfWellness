package com.example.wellnessapp.model

import com.example.wellnessapp.R
import com.example.wellnessapp.data.Wellness

class Datasource {

    val wellness = listOf<Wellness>(
        Wellness(R.string.day1,R.string.day1_title, R.string.day1_content, R.drawable.image1),
        Wellness(R.string.day2,R.string.day2_title, R.string.day2_content, R.drawable.image2),
        Wellness(R.string.day3,R.string.day3_title, R.string.day3_content, R.drawable.image3),
        Wellness(R.string.day4,R.string.day4_title, R.string.day4_content, R.drawable.image4),
        Wellness(R.string.day5,R.string.day5_title, R.string.day5_content, R.drawable.image5),
        Wellness(R.string.day6,R.string.day6_title, R.string.day6_content, R.drawable.image6),
        Wellness(R.string.day7,R.string.day7_title, R.string.day7_content, R.drawable.image7),
    )
}
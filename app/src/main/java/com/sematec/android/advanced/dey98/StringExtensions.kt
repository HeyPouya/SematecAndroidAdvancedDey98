package com.sematec.android.advanced.dey98

import android.widget.ImageView

//top level function
fun String.isValidMobileNumber() =
    length == 11 && startsWith("09")

fun ImageView.load(url: String) {
    //Picasso
}

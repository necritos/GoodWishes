package com.manumanu.goodwishes.util

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
/**
 * Created by manu on 08/04/17.
 */

fun ViewGroup.inflate(layout: Int): View {
    return LayoutInflater.from(context).inflate(layout, this, false)
}




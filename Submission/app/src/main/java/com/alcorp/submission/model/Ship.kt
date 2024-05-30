package com.alcorp.submission.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Ship(
    var shipName: String,
    var shipClass: String,
    var shipCountry: String,
    var shipDesc: String,
    var shipPhoto: Int
) : Parcelable
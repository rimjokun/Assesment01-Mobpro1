package org.d3if3032.assessment01.model

import androidx.annotation.DrawableRes
import org.d3if3032.assessment01.R

data class Developer(
    @DrawableRes val imageResId: Int
)
fun getData(): Developer{
    return Developer(R.drawable.developer)
}

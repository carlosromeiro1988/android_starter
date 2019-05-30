package com.vw.nano.data.carconfiguration

/**
 * Entity for Car Configuration
 */
data class CarConfiguration(
    val brandId: String,
    val familyId: String,
    val modelId: String,
    val colorId: String,
    val imageUrl: String,
    val notes: String
)
package com.alexteddy.unsplash.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.alexteddy.unsplash.util.Constants.UNSPLASH_IMAGE_TABLE
import kotlinx.serialization.Serializable

@Entity(tableName = UNSPLASH_IMAGE_TABLE)
@Serializable
data class UnsplashImage(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    @Embedded
    val urls: Urls,
    val likes: Int,
    @Embedded
    val user: User
)

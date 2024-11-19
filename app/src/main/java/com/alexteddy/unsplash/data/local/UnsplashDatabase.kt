package com.alexteddy.unsplash.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alexteddy.unsplash.data.local.dao.UnsplashImageDao
import com.alexteddy.unsplash.data.local.dao.UnsplashRemoteKeysDao
import com.alexteddy.unsplash.model.UnsplashImage
import com.alexteddy.unsplash.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase: RoomDatabase() {
    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao
}
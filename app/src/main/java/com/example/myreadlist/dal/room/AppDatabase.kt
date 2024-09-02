package com.example.myreadlist.dal.room

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myreadlist.models.ReadingList

@Database(entities = [ReadingList::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun readingListDao(): ReadingListDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance
                instance
            }
        }
    }
}
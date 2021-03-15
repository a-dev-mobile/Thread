package a.dev.mobile_thread.database

import a.dev.mobile_thread.models.Tr
import a.dev.mobile_thread.models.UN
import android.content.Context
import androidx.room.Database
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase


//@Database(entities = [UN::class, Tr::class], version = 1)
@Database(entities = [UN::class], version = 1)
abstract class ThreadDB : RoomDatabase() {


    abstract fun getUNDao(): DaoUN


    companion object {
        private const val DB_NAME = "Thread.db"
        private const val DB_PATH = "database/$DB_NAME"

        var INSTANCE: ThreadDB? = null


        fun getThreadDataBase(context: Context): ThreadDB? {
            if (INSTANCE == null) {
                INSTANCE = databaseBuilder(
                    context.applicationContext,
                    ThreadDB::class.java,
                    DB_NAME
                ).createFromAsset(DB_PATH)


                    .build()
            }
            return INSTANCE
        }

        fun cleanDbObject() {
            INSTANCE = null
        }

        fun closeDb() {
            if (INSTANCE != null) {
                INSTANCE!!.close()
            }
        }
    }


}
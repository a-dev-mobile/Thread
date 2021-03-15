package a.dev.mobile_thread.database


import a.dev.mobile_thread.models.UN
import androidx.room.Dao
import androidx.room.Query

@Dao
interface DaoUN {


    @Query("SELECT * FROM UN")
    fun loadAll(): List<UN>

}


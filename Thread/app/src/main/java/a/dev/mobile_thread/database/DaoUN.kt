package a.dev.mobile_thread.database


import a.dev.mobile_thread.models.UN
import androidx.room.Dao
import androidx.room.Query

@Dao
interface DaoUN {


    @Query("SELECT * FROM UN")
    fun loadAll(): List<UN>

    @Query("SELECT * FROM un where nominal_diameter_1 = :nominal_diameter_1")
    fun load(nominal_diameter_1: String): List<UN>


}


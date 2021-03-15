package a.dev.mobile_thread.database

import a.dev.mobile_thread.models.Tr
import androidx.room.Dao
import androidx.room.Query

@Dao
interface DaoTr {


    @Query("SELECT * FROM Tr")
    fun loadAll():List<Tr>



}

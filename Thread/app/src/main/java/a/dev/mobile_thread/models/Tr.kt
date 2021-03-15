package a.dev.mobile_thread.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Tr")
data class Tr(
    @PrimaryKey
    @ColumnInfo(name = "_id") val _id: Int,
    )

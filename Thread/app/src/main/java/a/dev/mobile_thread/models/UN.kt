package a.dev.mobile_thread.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "UN")
data class UN(
    @PrimaryKey @ColumnInfo(name = "_id") val _id: Int,
    @ColumnInfo(name = "nominal_diameter_1") val nominal_diameter_1: String?,
    @ColumnInfo(name = "nominal_diameter_2") val nominal_diameter_2: String?,
    @ColumnInfo(name = "thread_per_inch") val thread_per_inch: String?,
    @ColumnInfo(name = "series_designation") val series_designation: String?,
    @ColumnInfo(name = "e_class") val e_class: String?,
    @ColumnInfo(name = "e_allowance") val e_allowance: String?,
    @ColumnInfo(name = "e_major_diam_max") val e_major_diam_max: String?,
    @ColumnInfo(name = "e_1_major_diam_min") val e_1_major_diam_min: String?,
    @ColumnInfo(name = "e_2_major_diam_min") val e_2_major_diam_min: String?,
    @ColumnInfo(name = "e_pitch_diameter_max") val e_pitch_diameter_max: String?,
    @ColumnInfo(name = "e_pitch_diameter_min") val e_pitch_diameter_min: String?,
    @ColumnInfo(name = "e_pitch_diameter_tolerance") val e_pitch_diameter_tolerance: String?,
    @ColumnInfo(name = "e_unr_minor_diameter_max") val e_unr_minor_diameter_max: String?,
    @ColumnInfo(name = "i_class") val i_class: String?,
    @ColumnInfo(name = "i_minor_diameter_min") val i_minor_diameter_min: String?,
    @ColumnInfo(name = "i_minor_diameter_max") val i_minor_diameter_max: String?,
    @ColumnInfo(name = "i_pitch_diameter_min") val i_pitch_diameter_min: String?,
    @ColumnInfo(name = "i_pitch_diameter_max") val i_pitch_diameter_max: String?,
    @ColumnInfo(name = "i_pitch_diameter_tolerance") val i_pitch_diameter_tolerance: String?,
    @ColumnInfo(name = "i_major_diameter_min") val i_major_diameter_min: String?,


    )
/*






 */
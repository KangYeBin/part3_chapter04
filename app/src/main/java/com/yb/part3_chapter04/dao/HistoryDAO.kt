package com.yb.part3_chapter04.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.yb.part3_chapter04.model.History

@Dao
interface HistoryDAO {

    @Query("SELECT * FROM History")
    fun getAll(): List<History>

    @Insert
    fun insertHistory(history: History)

    @Query("DELETE FROM History WHERE keyword == :keyword")
    fun deleteOne(keyword: String)

}
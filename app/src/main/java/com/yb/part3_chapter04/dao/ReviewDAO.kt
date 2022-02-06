package com.yb.part3_chapter04.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.yb.part3_chapter04.model.Review

@Dao
interface ReviewDAO {

    @Query("SELECT * FROM Review WHERE id = :id")
    fun getOneReview(id: Int): Review?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveReview(review: Review)


}
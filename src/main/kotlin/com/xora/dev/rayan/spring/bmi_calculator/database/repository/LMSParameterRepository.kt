package com.xora.dev.rayan.spring.bmi_calculator.database.repository

import com.xora.dev.rayan.spring.bmi_calculator.database.model.LMSParameter
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface LMSParameterRepository : MongoRepository<LMSParameter, ObjectId>{
    fun findBySexAndAgemos(sex: Int, agemos: Float): LMSParameter?
}
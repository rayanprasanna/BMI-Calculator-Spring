package com.xora.dev.rayan.spring.bmi_calculator.database.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("lms_parameters")
data class LMSParameter(
    @Id val id: ObjectId = ObjectId.get(),
    val sex: Int,
    val agemos: Float,
    val l: Float,
    val m: Float,
    val s: Float,
    val p3: Float,
    val p5: Float,
    val p10: Float,
    val p25: Float,
    val p50: Float,
    val p75: Float,
    val p85: Float,
    val p90: Float,
    val p95: Float,
    val p97: Float,
)
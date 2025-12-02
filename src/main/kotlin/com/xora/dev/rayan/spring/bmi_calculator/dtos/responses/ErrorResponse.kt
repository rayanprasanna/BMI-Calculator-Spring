package com.xora.dev.rayan.spring.bmi_calculator.dtos.responses

data class ErrorResponse(
    val status: Int,
    val message: String,
    val errors: List<String>? = null
)
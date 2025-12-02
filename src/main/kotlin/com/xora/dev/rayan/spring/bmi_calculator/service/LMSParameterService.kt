package com.xora.dev.rayan.spring.bmi_calculator.service

import com.xora.dev.rayan.spring.bmi_calculator.dtos.requests.LMSParameterRequest
import com.xora.dev.rayan.spring.bmi_calculator.dtos.responses.LMSParameterResponse

interface LMSParameterService {
    fun upsert(lmsParameter: LMSParameterRequest)
    fun insertMultiple(lmsParameters: List<LMSParameterRequest>)
    fun getByAgemosAndSex(sex: Int, agemos: Float): LMSParameterResponse?
}
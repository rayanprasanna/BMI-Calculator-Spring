package com.xora.dev.rayan.spring.bmi_calculator.dtos.mappers

import com.xora.dev.rayan.spring.bmi_calculator.database.model.LMSParameter
import com.xora.dev.rayan.spring.bmi_calculator.dtos.requests.LMSParameterRequest
import com.xora.dev.rayan.spring.bmi_calculator.dtos.responses.LMSParameterResponse
import org.bson.types.ObjectId

fun LMSParameter.toResponse() = LMSParameterResponse(
    id = id.toHexString(),
    sex =  sex,
    agemos = agemos,
    l = l,
    m = m,
    s = s,
    p3 = p3,
    p5 = p5,
    p10 = p10,
    p25 = p25,
    p50 = p50,
    p75 = p75,
    p85 = p85,
    p90 = p90,
    p95 = p95,
    p97 = p97
)

fun LMSParameterRequest.toEntity() = LMSParameter(
    id = id?.let { ObjectId(it) } ?: ObjectId.get(),
    sex  = sex,
    agemos = agemos,
    l = l,
    m = m,
    s = s,
    p3 = p3,
    p5 = p5,
    p10 = p10,
    p25 = p25,
    p50 = p50,
    p75 = p75,
    p85 = p85,
    p90 = p90,
    p95 = p95,
    p97 = p97
)
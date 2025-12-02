package com.xora.dev.rayan.spring.bmi_calculator.service

import com.xora.dev.rayan.spring.bmi_calculator.database.repository.LMSParameterRepository
import com.xora.dev.rayan.spring.bmi_calculator.dtos.mappers.toEntity
import com.xora.dev.rayan.spring.bmi_calculator.dtos.mappers.toResponse
import com.xora.dev.rayan.spring.bmi_calculator.dtos.requests.LMSParameterRequest
import com.xora.dev.rayan.spring.bmi_calculator.dtos.responses.LMSParameterResponse
import org.springframework.stereotype.Service

@Service
class LMSParameterServiceImpl(
    private val lmsParameterRepository: LMSParameterRepository
) : LMSParameterService {
    override fun upsert(lmsParameter: LMSParameterRequest) {
        lmsParameterRepository.save(lmsParameter.toEntity())
    }

    override fun insertMultiple(lmsParameters: List<LMSParameterRequest>) {
        val entities = lmsParameters.map { it.toEntity() }
        lmsParameterRepository.saveAll(entities)
    }

    override fun getByAgemosAndSex(
        sex: Int,
        agemos: Float,
    ): LMSParameterResponse? {
        val lmsParameter = lmsParameterRepository.findBySexAndAgemos(sex, agemos)
        return lmsParameter?.toResponse()
    }
}
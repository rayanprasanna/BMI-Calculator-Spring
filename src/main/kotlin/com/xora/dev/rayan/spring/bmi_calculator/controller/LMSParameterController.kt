package com.xora.dev.rayan.spring.bmi_calculator.controller

import com.xora.dev.rayan.spring.bmi_calculator.dtos.requests.LMSParameterRequest
import com.xora.dev.rayan.spring.bmi_calculator.service.LMSParameterService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cdc/lms")
class LMSParameterController(
    private val lmsParameterService: LMSParameterService
) {
    @PostMapping
    fun upsert(
        @Valid @RequestBody body: LMSParameterRequest
    ): ResponseEntity<Any> {
        lmsParameterService.upsert(body)
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(mapOf("message" to "CDC LMS parameter saved successfully"))
    }

    @PostMapping("/batch")
    fun insertMultiple(
        @Valid @RequestBody body: List<@Valid LMSParameterRequest>
    ): ResponseEntity<Any> {
        lmsParameterService.insertMultiple(body)
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(mapOf("message" to "Batch insert successfully"))
    }

    @GetMapping(path = ["/{sex}/{agemos}"])
    fun getBySexAndAgemos(
        @PathVariable sex: Int,
        @PathVariable agemos: Float
    ): ResponseEntity<Any> {
        val lmsParameter = lmsParameterService.getByAgemosAndSex(sex, agemos)
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(lmsParameter)
    }
}
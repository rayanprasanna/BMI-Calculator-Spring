package com.xora.dev.rayan.spring.bmi_calculator.dtos.requests

import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull

data class LMSParameterRequest(
    val id: String? = null,

    @field:Min(value = 1, message = "Sex must be 1 or 2")
    @field:Max(value = 2, message = "Sex must be 1 or 2")
    val sex: Int,

    @field:Min(value = 0, message = "Age in months cannot be negative")
    val agemos: Float,

    @field:NotNull(message = "L parameter cannot be null")
    val l: Float,

    @field:NotNull(message = "M parameter cannot be null")
    @field:Min(value = 0, message = "M parameter must be non-negative")
    val m: Float,

    @field:NotNull(message = "S parameter cannot be null")
    @field:Min(value = 0, message = "S parameter must be non-negative")
    val s: Float,

    // Percentile validations
    @field:Min(value = 0, message = "P3 percentile cannot be negative")
    val p3: Float,

    @field:Min(value = 0, message = "P5 percentile cannot be negative")
    val p5: Float,

    @field:Min(value = 0, message = "P10 percentile cannot be negative")
    val p10: Float,

    @field:Min(value = 0, message = "P25 percentile cannot be negative")
    val p25: Float,

    @field:Min(value = 0, message = "P50 percentile cannot be negative")
    val p50: Float,

    @field:Min(value = 0, message = "P75 percentile cannot be negative")
    val p75: Float,

    @field:Min(value = 0, message = "P85 percentile cannot be negative")
    val p85: Float,

    @field:Min(value = 0, message = "P90 percentile cannot be negative")
    val p90: Float,

    @field:Min(value = 0, message = "P95 percentile cannot be negative")
    val p95: Float,

    @field:Min(value = 0, message = "P97 percentile cannot be negative")
    val p97: Float,
)

package com.ggo.multi_module_coverage.controller

import com.ggo.multi_module_coverage.CountryTime
import com.ggo.multi_module_coverage.domain.Country
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CountryTimeController(
    private val countryTime: CountryTime
) {

    @GetMapping("/time")
    fun getTimeFromCountry(@RequestParam name: String): String {
        return try {
            val country = Country.valueOf(name)
            "Time in $name is ${countryTime.getTimeFrom(country)}"
        } catch (e: Exception) {
           "Time not found for $name"
        }
    }
}

package com.ggo.multi_module_coverage

import com.ggo.multi_module_coverage.domain.Country
import java.time.LocalTime

interface CountryTime {

    fun getTimeFrom(country: Country): LocalTime
}

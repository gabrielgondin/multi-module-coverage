package com.ggo.multi_module_coverage

import com.ggo.multi_module_coverage.domain.Country
import org.springframework.stereotype.Service
import java.time.LocalTime
import java.time.ZoneId

@Service
class CountryTimeImpl : CountryTime {

    override fun getTimeFrom(country: Country): LocalTime {
        return when (country) {
            Country.CANADA -> {
                LocalTime.now(ZoneId.of(Country.CANADA.name))
            }
            else -> {
                LocalTime.now()
            }
        }
    }
}

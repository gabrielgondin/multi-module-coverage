package com.ggo.multi_module_coverage

import com.ggo.multi_module_coverage.domain.Country
import org.springframework.stereotype.Service
import java.time.LocalTime
import java.time.ZoneId


@Service
class CountryTimeImpl : CountryTime {

    override fun getTimeFrom(country: Country): LocalTime {
        val zoneId = ZoneId.getAvailableZoneIds().firstOrNull { zone ->
            zone.startsWith(country.name, ignoreCase = true)
        }
        return LocalTime.now(ZoneId.of(zoneId))
    }
}

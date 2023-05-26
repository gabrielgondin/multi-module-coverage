package com.ggo.multi_module_coverage

import com.ggo.multi_module_coverage.domain.Country
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CountryTimeImplTest {

    private val countryTime = CountryTimeImpl()

    @Test
    fun `should return a time when a country that is mapped`() {
        val time = countryTime.getTimeFrom(Country.BRAZIL)
        Assertions.assertNotNull(time)
    }
}

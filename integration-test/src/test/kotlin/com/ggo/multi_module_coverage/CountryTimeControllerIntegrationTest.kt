package com.ggo.multi_module_coverage

import com.ggo.multi_module_coverage.controller.CountryTimeController
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class CountryTimeControllerIntegrationTest {

    @Autowired
    private lateinit var countryTimeController: CountryTimeController

    @Test
    fun `should return a valid time when send Canada as country`() {
        // arrange
        val country = "CANADA"

        // act
        val response = countryTimeController.getTimeFromCountry("CANADA")

        // assert
        Assertions.assertNotNull(response)
        Assertions.assertTrue(response.contains("Time in $country"))
    }
}

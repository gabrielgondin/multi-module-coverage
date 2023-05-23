package com.ggo.multi_module_coverage.controller

import jakarta.servlet.RequestDispatcher
import jakarta.servlet.http.HttpServletRequest
import org.springframework.boot.web.servlet.error.ErrorController
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping("/")
    fun handleError(request: HttpServletRequest): String {
        val platform = request.getHeader("sec-ch-ua-platform")
        return platform?.let { "Hello $it user, welcome" } ?: "Hello, welcome"
    }
}


@RestController
class CoverageErrorController : ErrorController {

    @GetMapping("/error")
    fun handleError(request: HttpServletRequest): String {
        val statusCode = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE) as? Int ?: 500
        return if (statusCode == HttpStatus.NOT_FOUND.value()) "page not found"
        else "error $statusCode"
    }
}

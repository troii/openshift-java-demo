package com.troii.openshiftjavademo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
class HomeController {

    @RequestMapping("/")
    fun home(request: HttpServletRequest): String {
        return "Welcome to the OpenShift Java Demo App on ${request.serverName}"
    }

}
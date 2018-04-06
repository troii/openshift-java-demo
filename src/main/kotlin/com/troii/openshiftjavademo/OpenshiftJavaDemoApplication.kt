package com.troii.openshiftjavademo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OpenshiftJavaDemoApplication

fun main(args: Array<String>) {
    runApplication<OpenshiftJavaDemoApplication>(*args)
}

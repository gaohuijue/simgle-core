package com.simgle.core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimgleApplication

fun main(args: Array<String>) {
    runApplication<SimgleApplication>(*args)
}

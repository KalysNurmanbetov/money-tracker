package com.kalys.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BackendOfMoneyTrackerApplication

fun main(args: Array<String>) {
    runApplication<BackendOfMoneyTrackerApplication>(*args)
}

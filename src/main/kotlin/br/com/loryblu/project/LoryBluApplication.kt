package main.kotlin.br.com.loryblu.project

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["main.kotlin.br.com.loryblu.project"])
//@EnableJpaRepositories(basePackages = ["main.kotlin.br.com.loryblu.project"])
//@EntityScan(basePackages = ["main.kotlin.br.com.loryblu.project"])
class LoryBluApplication

fun main(args: Array<String>) {
	runApplication<LoryBluApplication>(*args)
}

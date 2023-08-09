package com.example.blog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class BlogApplication {

  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      runApplication<BlogApplication>(*args)
    }
  }
}

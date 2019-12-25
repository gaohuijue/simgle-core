package com.simgle.core.mvc

import org.springframework.context.annotation.Configuration
import org.springframework.core.Ordered
import org.springframework.core.annotation.Order
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
@EnableWebMvc
@Order(Ordered.HIGHEST_PRECEDENCE)
open class WebConfig(
        private val rbacInterceptor: RbacInterceptor?
) : WebMvcConfigurer {
    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(ThreadBindingInterceptor())

        if (rbacInterceptor != null) {
            registry.addInterceptor(rbacInterceptor)
        }
    }
}
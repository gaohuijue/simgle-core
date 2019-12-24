package com.simgle.core.mvc

import com.simgle.core.Constant
import com.simgle.core.tool.ThreadBinds
import org.springframework.web.servlet.HandlerInterceptor
import org.springframework.web.servlet.ModelAndView
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class ThreadBindingInterceptor : HandlerInterceptor {
    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        val session = request.session ?: return true

        val value = session.getAttribute(Constant.RBAC_SESSION) ?: return true

        ThreadBinds.put(Constant.RBAC_SESSION, value)
        return true
    }

    override fun postHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any, modelAndView: ModelAndView?) {
        return
    }

    override fun afterCompletion(request: HttpServletRequest, response: HttpServletResponse, handler: Any, ex: Exception?) {
        ThreadBinds.destroy()
    }
}
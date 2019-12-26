package com.simgle.core.tool

import java.util.concurrent.ConcurrentHashMap

object ThreadBinds {
    private val threadLocal = ThreadLocal<ConcurrentHashMap<String, Any?>>()

    fun put(k: String, v: Any) {
        val map = threadLocal.get()
        if (map == null) {
            threadLocal.set(ConcurrentHashMap())
        }
        threadLocal.get()[k] = v
    }

    fun get(k: String): Any? {
        val map = threadLocal.get()
        return if (map == null) null else map[k]
    }

    fun remove(k: String) {
        threadLocal.get().remove(k)
    }

    fun destroyThreadBind() {
        threadLocal.remove()
    }
}
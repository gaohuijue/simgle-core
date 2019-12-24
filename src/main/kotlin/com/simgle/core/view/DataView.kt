package com.simgle.core.view

open class DataView {
    open var success: Boolean? = null
    open var message: String? = null
    open var code: String? = null
    open var data: Any? = null

    companion object {
        fun build(block: DataView.() -> Unit): DataView = DataView().apply(block)
    }
}
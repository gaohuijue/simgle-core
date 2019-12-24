package com.simgle.core.rbac

/**
 * 权限组
 */
interface RbacRole {
    fun getId(): String
    fun getPermissions(): List<RbacPermission>
}
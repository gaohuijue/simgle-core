package com.simgle.core.rbac

/**
 * Role-Based-Access-Control
 */
interface RbacUser {
    fun getId(): String

    fun canAccess(permission: RbacPermission): Boolean
}
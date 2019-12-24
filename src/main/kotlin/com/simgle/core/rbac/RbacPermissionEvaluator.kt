package com.simgle.core.rbac

interface RbacPermissionEvaluator {
    fun evaluate(permissions: List<RbacPermission>): Boolean
}
package com.simgle.core.rbac

interface RbacPermissionEvaluator {
    fun evaluate(rbacUser: RbacUser, permissions: List<RbacPermission>): Boolean
}
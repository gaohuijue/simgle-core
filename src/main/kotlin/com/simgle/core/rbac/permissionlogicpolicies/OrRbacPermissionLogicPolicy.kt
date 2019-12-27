package com.simgle.core.rbac.permissionlogicpolicies

import com.simgle.core.rbac.RbacPermission
import com.simgle.core.rbac.RbacPermissionEvaluator
import com.simgle.core.rbac.RbacUser

class OrRbacPermissionLogicPolicy : RbacPermissionEvaluator {
    override fun evaluate(rbacUser: RbacUser, permissions: List<RbacPermission>): Boolean {
        for (permission in permissions) {
            if (rbacUser.canAccess(permission)) {
                return true
            }
        }

        return false
    }
}
package com.simgle.core.rbac.permissionlogicpolicies

import com.simgle.core.Constant
import com.simgle.core.rbac.RbacPermission
import com.simgle.core.rbac.RbacPermissionEvaluator
import com.simgle.core.rbac.RbacSession
import com.simgle.core.tool.ThreadBinds

class OrRbacPermissionLogicPolicy : RbacPermissionEvaluator {
    override fun evaluate(permissions: List<RbacPermission>): Boolean {
        val session = ThreadBinds.get(Constant.RBAC_SESSION) as RbacSession?

        if (session == null) {
            return false
        }

        val rbacUser = session.getRbacUser()
        for (permission in permissions) {
            if (rbacUser.canAccess(permission)) {
                return true
            }
        }

        return false
    }
}
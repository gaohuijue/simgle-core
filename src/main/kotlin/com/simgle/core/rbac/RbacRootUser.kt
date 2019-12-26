package com.simgle.core.rbac

import com.simgle.core.Constant

abstract class RbacRootUser : RbacUser {
    override fun getId(): String {
        return Constant.RBAC_ROOT_USER_ID
    }

    override fun canAccess(permission: RbacPermission): Boolean {
        return true
    }
}
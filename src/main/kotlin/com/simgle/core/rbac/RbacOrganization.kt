package com.simgle.core.rbac

/**
 * 公司是组织，基金会是组织，部门是组织，岗位也是组织，
 * 只要是包含多个用户的节点，就是组织。
 */
interface RbacOrganization {
    fun getId(): String
    fun getParent(): RbacOrganization?
}
package com.simgle.core.rbac;

import com.simgle.core.rbac.permissionlogicpolicies.AndRbacPermissionLogicPolicy;

import java.lang.annotation.*;

/**
 * 标识类的所有方法或某个方法需要权限才能执行。
 * 如果类有此注解且方法也有此注解，那么必须符合类和方法的权限规则，
 * 才会执行方法。
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface RequiredPermissions {
    String value() default "";

    String[] permissions() default {};

    Class<? extends RbacPermissionEvaluator> logicPolicy() default AndRbacPermissionLogicPolicy.class;
}

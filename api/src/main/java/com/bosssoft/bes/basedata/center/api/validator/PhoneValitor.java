package com.bosssoft.bes.basedata.center.api.validator;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * PhoneValitor
 * 手机号表单验证注解
 *
 * @author fishkk
 * @since 2019/8/23
 * @version 1.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER,ElementType.FIELD}) // 仅能用在参数
@Constraint(validatedBy = PhoneValitorClass.class)
public @interface PhoneValitor {

    String message() default "手机号格式不正确";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}

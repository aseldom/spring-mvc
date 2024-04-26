package com.zaurtregulov.spring.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {

    String value() default "xyz.com";
    String message() default "email must be ends with xyz.com";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}

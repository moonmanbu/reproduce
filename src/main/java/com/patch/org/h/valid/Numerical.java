package com.patch.org.h.valid;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

/**
 * 验证数字的值是否合乎要求
 */
@Constraint(validatedBy = NumericalValidator.class)
@Target({FIELD, METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Numerical {

    Op[] ops();

    double target();

    String message() default "{javax.validation.constraints.Unique.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}

package com.patch.org.h.valid;

import org.osgl.$;
import org.osgl.util.N;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Administrator
 */
public class NumericalValidator implements ConstraintValidator<Numerical, Number> {

    private Numerical annotation;

    @Override
    public void initialize(Numerical constraintAnnotation) {
        this.annotation = constraintAnnotation;
    }

    @Override
    public boolean isValid(Number value, ConstraintValidatorContext context) {
        if ($.isNull(value)) {
            return false;
        }
        double target = annotation.target();
        for (Op op : annotation.ops()) {
            boolean result;
            switch (op) {
                case EQ:
                    result = N.eq(value, target);
                    break;
                case NE:
                    result = N.neq(value, target);
                    break;
                case GT:
                    result = N.gt(value, target);
                    break;
                case LT:
                    result = N.lt(value, target);
                    break;
                default:
                    result = false;
            }
            if (!result) {
                return false;
            }
        }
        return true;
    }
}

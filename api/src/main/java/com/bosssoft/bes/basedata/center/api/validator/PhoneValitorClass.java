package com.bosssoft.bes.basedata.center.api.validator;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * PhoneValitorClass
 * 实现手机号验证注解
 *
 * @author fishkk
 * @version 1.0
 * @since 2019/8/23
 */
public class PhoneValitorClass implements ConstraintValidator<PhoneValitor, String> {

    @Override
    public void initialize(PhoneValitor constraintAnnotation) { }

    @Override
    public boolean isValid(String str, ConstraintValidatorContext constraintValidatorContext) {
            return isMobile(str);

    }

    public static boolean isMobile(String src) {
        String regex = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";
        if (src.length() != 11) {
            return false;
        } else {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(src);
            return m.matches();
        }
    }

}

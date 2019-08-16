package string_operation.validation_string;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.List;
/**
 * validator返回信息工具类
 *
 * @Author: 谢良希
 * @Date: 2019/8/12
 * @Version: 1.0
 * @Maintenance Records:
 */
public class ValidatorString {

    public static String getMessage(BindingResult bindingResult) {
        StringBuffer stringBuffer = new StringBuffer();
        List<ObjectError> list = bindingResult.getAllErrors();
        for (ObjectError objectError : list) {
            stringBuffer.append(objectError.getDefaultMessage());
            stringBuffer.append("; \n");
        }
        return stringBuffer != null ? stringBuffer.toString() : "";
    }

}

package org.jeecg.enhance;

import com.alibaba.fastjson.JSONObject;

import org.jeecg.modules.online.cgform.enhance.CgformEnhanceJavaInter;
import org.jeecg.modules.online.config.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author zhangqisheng
 * @Date 2020-07-27 14:19
 * 医生添加时的增强
 */
@Component(value = "doctorAddEnhance")
public class DoctorAddEnhance implements CgformEnhanceJavaInter {
    @Override
    public int execute(String s, Map<String, Object> map) throws BusinessException {
        return 0;
    }

    @Override
    public int execute(String s, JSONObject jsonObject) throws BusinessException {
        System.out.println(s + "-----" + jsonObject.toJSONString());
        return 0;
    }
}

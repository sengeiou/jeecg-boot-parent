package org.jeecg.enhance;

import com.alibaba.fastjson.JSONObject;


import org.jeecg.common.handler.IFillRuleHandler;

import java.security.SecureRandom;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * @Author zhangqisheng
 * @Date 2020-07-28 15:13
 */
public class ReservationSnEnhance implements IFillRuleHandler {

    /**shop_order_num
     * 生成16位不重复的随机数，含数字+大小写
     * @return
     */
    private static String getReservationSn() {
        StringBuilder sb = new StringBuilder();
        //产生16位的强随机数
        Random rd = new SecureRandom();
        for (int i = 0; i < 16; i++) {
            //产生0-2的3位随机数
            int type = rd.nextInt(3);
            switch (type){
                case 0:
                    //0-9的随机数
                    sb.append(rd.nextInt(10));
                    break;
                case 1:
                    //ASCII在65-90之间为大写,获取大写随机
                    sb.append((char)(rd.nextInt(25)+65));
                    break;
                case 2:
                    //ASCII在97-122之间为小写，获取小写随机
                    sb.append((char)(rd.nextInt(25)+97));
                    break;
                default:
                    break;
            }
        }
        return sb.toString();
    }

    @Override
    public Object execute(JSONObject params, JSONObject formData) {
        return "SN_"+getReservationSn();
    }
}

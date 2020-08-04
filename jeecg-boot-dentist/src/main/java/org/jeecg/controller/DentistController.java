package org.jeecg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zhangqisheng
 * @Date 2020-07-31 17:07
 * 用于本地请求
 */
@RestController
class DentistController extends Controller {

    /*@PostMapping
    public void noticeDoctor(String ){

    }*/

    /*
     * 预约通知医生
     * */
    public void noticeDoctor(
            @RequestParam String patient,
            @RequestParam String name,
            @RequestParam String sex,
            @RequestParam String mobilePhone,
            @RequestParam Integer timeType
    ) {
        /*sysBaseAPI.sendSysAnnouncement(
                formUsername,
                toUsername,
                "同步用户到工作流引擎完成", "同步用户到工作流引擎完成");*/
    }

}

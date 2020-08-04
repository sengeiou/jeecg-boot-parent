package org.jeecg.modules;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author zhangqisheng
 * @Date 2020-07-25 11:29
 */
@RestController
@RequestMapping(value = "/test/jeecgDemo")
@Slf4j
@Api(tags="测试接口")
public class ZqsController {

    /**
     * hello world
     *
     * @param
     * @return
     */
    @ApiOperation(value = "获取Demo数据列表", notes = "获取所有Demo数据列表")
    @GetMapping(value = "/path")
    public String test(){
        return "测试";
    }

}

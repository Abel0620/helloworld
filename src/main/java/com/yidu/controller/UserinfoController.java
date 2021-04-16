package com.yidu.controller;

import com.yidu.entity.Userinfo;
import com.yidu.service.UserinfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
/**
 * (Userinfo)表控制层  ·
 *
 * @author makejava
 * @since 2021-04-12 10:30:40
 */
@RestController
@RequestMapping("userinfo")
public class UserinfoController {
    /**
     * 服务对象
     */
    @Resource
    private UserinfoService userinfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Userinfo selectOne(Integer id) {
        return this.userinfoService.queryById(id);
    }


}
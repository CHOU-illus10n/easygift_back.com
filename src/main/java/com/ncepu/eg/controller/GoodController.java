package com.ncepu.eg.controller;

import com.ncepu.eg.pojo.GoodInfo;
import com.ncepu.eg.pojo.PageBean;
import com.ncepu.eg.pojo.Result;
import com.ncepu.eg.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zwy
 * @version 1.0
 * @description: TODO
 * @date 2023/12/14 20:55
 */
@RestController
@RequestMapping("/good")
public class GoodController {

    @Autowired
    private GoodService goodService;

    @GetMapping
    public Result<PageBean<GoodInfo>> list(
            Integer pageNum,
            Integer pageSize,
            @RequestParam(required = false) String goodName
    ) {
        PageBean<GoodInfo> pb =  goodService.list(pageNum,pageSize,goodName);
        return Result.success(pb);
    }

    @GetMapping("/getInfo")
    public Result<List<GoodInfo>> getGoodInfo() {
        List<GoodInfo> goodInfoList = goodService.getGoodInfo();
        return Result.success(goodInfoList);
    }

    @PostMapping
    public Result add(@RequestBody GoodInfo goodInfo) {
        goodService.add(goodInfo);
        return Result.success();
    }
}

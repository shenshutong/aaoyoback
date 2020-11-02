package com.bgs.aoyoback.controller;

import com.bgs.aoyoback.pojo.AoyoCommodity;
import com.bgs.aoyoback.pojo.AoyoGroupComment;
import com.bgs.aoyoback.pojo.SysGroup;
import com.bgs.aoyoback.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("shop")
public class ShopController {
    @Autowired
    private ShopService ss;

    //门店首页
    @RequestMapping("getStoreList")
    @ResponseBody
    public List<SysGroup> getStoreList(){
        List<SysGroup> list=ss.getStoreList();
        for(SysGroup li:list){
            List<AoyoGroupComment> agc=li.getAoyoGroupComment();
            Integer a=0;
            Integer b=0;
            for(AoyoGroupComment cc:agc){
                Integer pingfen= cc.getPingfen();
                a+=pingfen;
                b+=1;
            }
            Integer newpingfen=Math.round(a/2/b);//总评分
            li.setPingfen(newpingfen);
            li.setZongdingdan(b);
        }
        return list;
    }

    //门店详情
    @RequestMapping("queryGroupDetail")
    @ResponseBody
    public SysGroup queryGroupDetail(Integer groupId){
        SysGroup sysGroup=ss.queryGroupDetail(groupId);
        return sysGroup;
    }

    //门店商品
    @RequestMapping("queryCommodityApi")
    @ResponseBody
    public List<AoyoCommodity> queryCommodityApi(Integer groupId){
        System.out.println(groupId);
        List<AoyoCommodity> list=ss.queryCommodityApi(groupId);
        for (AoyoCommodity a:list){
            System.out.println(a);
        }
        return list;
    }
}

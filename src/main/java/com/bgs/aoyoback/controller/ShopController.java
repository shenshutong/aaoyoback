package com.bgs.aoyoback.controller;

import com.bgs.aoyoback.pojo.*;
import com.bgs.aoyoback.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

import java.util.List;

@Controller
@RequestMapping("shop")
public class ShopController {
    @Autowired
    private ShopService ss;

    Jedis jedis = new Jedis("127.0.0.1");

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
    public List<AoyoCommodity> queryCommodityApi(Integer groupId,Integer commodity_id,Integer type_id){
        System.out.println(groupId);
        System.out.println(commodity_id);
        System.out.println(type_id);
        List<AoyoCommodity> list=ss.queryCommodityApi(groupId,commodity_id,type_id);
        return list;
    }

    //商品评论
    @RequestMapping("getCommentByCommoditId")
    @ResponseBody
    public List<AoyoGroupCommodity> getCommentByCommoditId(Integer commoditId){
        List<AoyoGroupCommodity> list=ss.getCommentByCommoditId(commoditId);
        return list;
    }

    //商品筛选
    @RequestMapping("queryCommodityClassByGroupId")
    @ResponseBody
    public List<AoyoCommodityClass> queryCommodityClassByGroupId(Integer groupId){
        List<AoyoCommodityClass> list=ss.queryCommodityClassByGroupId(groupId);
        return list;
    }

    @RequestMapping("addShoppingCar")
    @ResponseBody
    public boolean addShoppingCar(Integer commodityId){
        System.out.println("addShoppingCar--------------"+commodityId);
        System.out.println("addShoppingCar--------------"+jedis.get("token"));
        return true;
    }
}

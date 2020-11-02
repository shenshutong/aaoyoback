package com.bgs.aoyoback.service.impl;

import com.bgs.aoyoback.dao.ShopMapper;
import com.bgs.aoyoback.pojo.*;
import com.bgs.aoyoback.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopMapper sm;

    //门店首页
    @Override
    public List<SysGroup> getStoreList() {
        List<SysGroup> list=sm.getStoreList();
        return list;
    }

    //门店详情
    @Override
    @Transactional
    public SysGroup queryGroupDetail(Integer groupId) {
        SysGroup sg=sm.queryGroupDetail(groupId);
        List<AoyoGroupComment> agc=sm.getPingfen(groupId);
        List<AoyoGroupFeaturedServices> agfs=sm.getFuwu(groupId);
        List<AoyoGroupTechnician> agt=sm.getJishi(groupId);
        Integer a=0;
        Integer b=0;
        List list1=new ArrayList();
        List list2=new ArrayList();
        for(AoyoGroupTechnician aa:agt){
            list2.add(aa);
        }
        sg.setJishiList(list2);
        for(AoyoGroupFeaturedServices aa:agfs){
            list1.add(aa.getFeaturedServicesName());
        }
        sg.setFuwuList(list1);
        for(AoyoGroupComment cc:agc){
            Integer pingfen= cc.getPingfen();
            a+=pingfen;
            b+=1;
        }
        Integer newpingfen=Math.round(a/2/b);//总评分
        sg.setPingfen(newpingfen);
        sg.setZongdingdan(b);
        return sg;
    }

    //门店商品
    @Override
    public List<AoyoCommodity> queryCommodityApi(Integer groupId) {
        return sm.queryCommodityApi(groupId);
    }
}

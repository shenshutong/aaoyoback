package com.bgs.aoyoback.service.impl;

import com.bgs.aoyoback.dao.ShopMapper;
import com.bgs.aoyoback.pojo.AoyoGroupComment;
import com.bgs.aoyoback.pojo.AoyoGroupFeaturedServices;
import com.bgs.aoyoback.pojo.AoyoGroupTechnician;
import com.bgs.aoyoback.pojo.SysGroup;
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

    @Override
    public List<SysGroup> getStoreList() {
        return sm.getStoreList();
    }

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
        System.out.println(sg.getJishiList().toString());
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
}

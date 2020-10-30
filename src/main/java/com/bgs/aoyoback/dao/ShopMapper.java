package com.bgs.aoyoback.dao;

import com.bgs.aoyoback.pojo.AoyoGroupComment;
import com.bgs.aoyoback.pojo.AoyoGroupFeaturedServices;
import com.bgs.aoyoback.pojo.AoyoGroupTechnician;
import com.bgs.aoyoback.pojo.SysGroup;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopMapper {
    List<SysGroup> getStoreList();

    SysGroup queryGroupDetail(@Param("groupId") Integer groupId);

    List<AoyoGroupComment> getPingfen(@Param("groupId") Integer groupId);

    List<AoyoGroupFeaturedServices> getFuwu(@Param("groupId") Integer groupId);

    List<AoyoGroupTechnician> getJishi(@Param("groupId") Integer groupId);
}

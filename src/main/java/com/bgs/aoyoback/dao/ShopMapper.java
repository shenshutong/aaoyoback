package com.bgs.aoyoback.dao;

import com.bgs.aoyoback.pojo.*;
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

    List<AoyoCommodity> queryCommodityApi(@Param("groupId") Integer groupId,@Param("commodityId") Integer commodity_id,@Param("typeId") Integer type_id);

    List<AoyoGroupCommodity> getAoyoGroupCommodity(@Param("commodityId") Integer commodity_id);

    List<AoyoCommodityNorms> getAoyoCommodityNorms(@Param("commodityId") Integer commodity_id);

    List<AoyoCommodityClass> queryCommodityClassByGroupId(@Param("groupId") Integer groupId);
}

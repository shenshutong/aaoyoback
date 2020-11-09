package com.bgs.aoyoback.dao;

import com.bgs.aoyoback.pojo.*;
import com.bgs.aoyoback.response.BaseResponse;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    //AoyoUser userlogin(@Param("phone") String phone, @Param("password")String password);
    //验证手机号与密码
    AoyoUser selectUserInfo(String phone);

    //查询用户信息
    AoyoUser showUserInfo(Integer id);

    //修改头像
    int uploadPhoto(@Param("platformImage") AoyoPlatformImage platformImage);

    //查看订单
    List<AoyoOrder> showOrderList();

    //展示优惠券
    List<AoyoCoupon> showMyDiscount();

    //删除订单
    int deleteOrder(Integer orderId);

    //订单详情
    List<AoyoOrder> showOrderDetail(Integer id);

    //优惠券数量
    int discountCount();

    //关注商品
    List<AoyoCommodityCollection> commodityCollection();

    //关注商品数量
    int collectionCount();

    //取消关注
    int deleteCollection(Integer collectionId);
}

package com.bgs.aoyoback.service;

import com.bgs.aoyoback.pojo.*;
import com.bgs.aoyoback.response.BaseResponse;

import java.util.List;


public interface UserService {
   // AoyoUser userlogin(String phone, String password);

    //验证手机号与密码
    AoyoUser verifyUser(String phone, String password);

    //查询用户信息
    AoyoUser showUserInfo(Integer id);

    int uploadPhoto(AoyoGallery aoyoGallery);

    //查看订单信息
    List<AoyoOrder> showOrderList();

    List<AoyoCoupon> showMyDiscount();

    //删除订单
    int deleteOrder(Integer orderId);

    //查看订单详情
    List<AoyoOrder> showOrderDetail(Integer id);

    //优惠券数量
    int discountCount();

    //关注商品
    List<AoyoCommodityCollection> commodityCollection();
    //关注商品数量
    int collectionCount();

    //取消关注
    int deleteCollection(Integer collectionId);

    //收货地址
    List<AoyoAddress> showAddressList();

    //收货地址标签
    List<AoyoAddressLabel> addressLabel();

    List<AoyoProvince> showProvince();
    List<AoyoCity> showCitys(Integer code);
    List<AoyoArea> showAreas(Integer code);
    List<AoyoStreet> showStreet(Integer code);

    //添加收货地址
    int initAddress(AoyoAddress aoyoAddress);
}

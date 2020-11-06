package com.bgs.aoyoback.pojo;


import lombok.Data;

import java.util.Date;
@Data
public class AoyoOrder {

  private Integer orderId;
  private Integer groupId;
  private String orderCode;
  private Integer commodityId;
  private Integer customId;
  private Integer sendOrderStatus;//订单状态 0-全部 1-待支付 2-进行中 3-待评价 4-已完成
  private Integer payChannel;
  private double orderAmount; //订单金额
  private Integer couponId;
  private double discountAmount;
  private double freightAmount;
  private double orderPracticalAmount;//实际支付金额
  private Date orderInputTime;//下单时间
  private Date orderSettlementTime;//支付时间
  private Date orderDeliveryTime;//发货时间
  private Date orderReceivingTime;//收货时间
  private Integer invoiceState;//是否开发票
  private String orderPayNumber;//订单号
  private Integer addressId;
  private String trackingNumber;
  private Integer groupEnjoy;
  private Integer groupOrderReceiving;
  private Integer recordDateId;
  private Integer deleteFlag;

  //商店名称
  private String groupName;
  //优惠券名称
  private String couponName;
  //商品名称
  private String commodityName;

  //商品描述
  private String commodityDesc;
  //商品销售价格
  private double commoditySellingPrice;
  //购买数量
  private Integer commoditySort;
  private String commodityImgUrl;

  
}

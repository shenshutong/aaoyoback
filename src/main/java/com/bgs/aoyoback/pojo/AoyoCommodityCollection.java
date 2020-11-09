package com.bgs.aoyoback.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class AoyoCommodityCollection {
    private Integer commodityCollectionId;
    private Integer customId;
    private Integer isEffective;
    private Integer commodityId;
    private Date commodityCollectionTime;
    private Integer deleteFlag;
    private Integer collectionCount;

    private String commodityName;
    private double commoditySellingPrice;
    private String commodityImgUrl;

}

package com.bgs.aoyoback.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.List;
@Data
@ToString
public class GwcUtils {
    private List<AoyoShoppingCart> shoppList;
    private List<AoyoCommodity> commoditys;
    private List<AoyoCommodityImg> imgs;
}

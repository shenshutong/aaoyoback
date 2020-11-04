package com.bgs.aoyoback.utils;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OssProPerties implements InitializingBean {

    @Value("${aliyun.endpoint}")
    private String oss_endpoint;//服务器地址

    @Value("${aliyun.bucketll}")
    private String oss_bucketname;//bucket名称

    @Value("${aliyun.dir}")
    private String oss_dir;//文件路径

    @Value("${aliyun.access-id}")
    private String oss_access_id;

    @Value("${aliyun.access-key}")
    private String oss_access_key;


    public static String ALIYUN_END_POINT;
    public static String ALIYUN_ACCESS_ID;
    public static String ALIYUN_ACCESS_KEY;
    public static String ALIYUN_BUCKET_NAME;
    public static String ALIYUN_DIR;

    @Override
    public void afterPropertiesSet() throws Exception {
        ALIYUN_END_POINT = oss_endpoint;
        ALIYUN_ACCESS_ID = oss_access_id;
        ALIYUN_ACCESS_KEY = oss_access_key;
        ALIYUN_DIR = oss_dir;
        ALIYUN_BUCKET_NAME = oss_bucketname;
    }
}
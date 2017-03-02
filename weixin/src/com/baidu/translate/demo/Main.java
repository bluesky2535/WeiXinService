package com.baidu.translate.demo;
import org.codehaus.jackson.map.ObjectMapper;

import jdk.nashorn.internal.parser.JSONParser;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;

import com.baidu.translate.demo.TransApi;
import com.twx.po.BaiduTranslate;

public class Main {

    // 在平台申请的APP_ID 详见 http://api.fanyi.baidu.com/api/trans/product/desktop?req=developer
    private static final String APP_ID = "20170302000040227";
    private static final String SECURITY_KEY = "Y_HdfXr_3gsgJAa6jxWt";

    public static void main(String[] args) throws Exception {
       TransApi api = new TransApi(APP_ID, SECURITY_KEY);
        String query = "hello";
       System.out.println(api.getTransResult(query, "auto", "auto"));
    
     ObjectMapper o=new ObjectMapper();
     BaiduTranslate b=   o.readValue(api.getTransResult(query, "auto", "auto"), BaiduTranslate.class);
    System.out.println(b.getTrans_result()[0].getSrc()+ b.getTrans_result()[0].getDst());
        
    }

}

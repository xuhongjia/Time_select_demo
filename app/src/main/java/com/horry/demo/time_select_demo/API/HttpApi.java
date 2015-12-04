package com.horry.demo.time_select_demo.API;

import org.kymjs.kjframe.http.HttpCallBack;
import org.kymjs.kjframe.http.Request;

/**
 * Created by Administrator on 2015/12/2.
 */
public class HttpApi extends  API {
    public static void getData(String url,HttpCallBack httpCallBack){
        kjBulider.url(url).httpMethod(Request.HttpMethod.GET).callback(httpCallBack).useCache(true).request();
    }
}

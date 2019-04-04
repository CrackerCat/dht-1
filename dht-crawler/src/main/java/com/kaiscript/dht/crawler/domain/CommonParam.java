package com.kaiscript.dht.crawler.domain;

/**
 * 通用请求参数
 * Created by chenkai on 2019/4/2.
 */
public class CommonParam {

    /**
     * transaction ID
     */
    public String t;

    /**
     * 一个字节,表明消息体类型<br/>
     * q 表示请求(请求Queries)<br/>
     * r 表示回复(回复 Responses)<br/>
     * e 表示错误(错误 Errors)<br/>
     */
    public String y;


}

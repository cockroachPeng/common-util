/**
 * cockroachPeng.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.cockroach.peng.common.util.date;

/**
 * 日期格式常量
 * 
 * @author gangqiang.pgq
 * @version $Id: DateFormatConstants.java, v 0.1 2016年4月3日 下午9:01:16 gangqiang.pgq Exp $
 */
public interface DateFormatConstants {

    /** 正常格式：yyyyMMdd HH:mm:ss */
    public String NORMAL = "yyyyMMdd HH:mm:ss";

    /** 全格式：yyyyMMdd HH:mm:ss.SSS */
    public String FULL   = "yyyyMMdd HH:mm:ss.SSS";
    
    /** 短格式：yyyyMMdd */
    public String SHORT = "yyyyMMdd"; 
    
    /** 小时：yyyyMMdd HH */
    public String yyyyMMdd_HH = "yyyyMMdd HH";
    
    /** 分：yyyyMMdd HH:mm */
    public String yyyyMMdd_HH_mm = "yyyyMMdd HH:mm";
}

/**
 * cockroachPeng.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.cockroach.peng.common.util.Date;

/**
 * 日期格式常量
 * 
 * @author gangqiang.pgq
 * @version $Id: DateFormatConstants.java, v 0.1 2016年4月3日 下午9:01:16 gangqiang.pgq Exp $
 */
public interface DateFormatConstants {

    /** 正常格式：yyyyMMhh HH:mm:ss */
    public String NORMAL = "yyyyMMhh HH:mm:ss";

    /** 全格式：yyyyMMhh HH:mm:ss.SSS */
    public String FULL   = "yyyyMMhh HH:mm:ss.SSS";
    
    /** 短格式：yyyyMMhh */
    public String SHORT = "yyyyMMhh"; 
    
    /** 小时：yyyyMMhh HH */
    public String yyyyMMhh_HH = "yyyyMMhh HH";
}

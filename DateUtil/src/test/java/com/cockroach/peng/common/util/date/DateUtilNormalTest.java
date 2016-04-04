/**
 * cockroachPeng.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.cockroach.peng.common.util.date;

import java.util.Date;

import junit.framework.TestCase;

import com.cockroach.peng.common.util.string.StringUtil;

/**
 * 日期工具类正常测试
 * 
 * @author gangqiang.pgq
 * @version $Id: DateUtilTest.java, v 0.1 2016年4月4日 上午10:51:34 gangqiang.pgq Exp $
 */
public class DateUtilNormalTest extends TestCase {

    /**
     * 测试日期字符串转换为日期{@link Date}
     */
    public void testStr2Date() {

        String errMsg = "日期字符串转换为日期错误";
        assertNotNull(errMsg, DateUtil.str2Date("20160404 15:16:52"));
        assertNotNull(errMsg, DateUtil.str2Date("20160404 15:16:52", DateFormatConstants.NORMAL));
        assertNotNull(errMsg, DateUtil.str2Date("20160404 15:16:52.212", DateFormatConstants.FULL));
        assertNotNull(errMsg, DateUtil.str2Date("20160404", DateFormatConstants.SHORT));
        assertNotNull(errMsg, DateUtil.str2Date("20160404 15", DateFormatConstants.yyyyMMdd_HH));
        assertNotNull(errMsg,
            DateUtil.str2Date("20160404 15:16", DateFormatConstants.yyyyMMdd_HH_mm));
        assertNotNull(errMsg, DateUtil.str2Date(null, DateFormatConstants.yyyyMMdd_HH_mm));
        assertNotNull(errMsg, DateUtil.str2Date("", DateFormatConstants.yyyyMMdd_HH_mm));
        assertNotNull(errMsg, DateUtil.str2Date(" ", DateFormatConstants.yyyyMMdd_HH_mm));
        assertNotNull(errMsg, DateUtil.str2Date(null));
        assertNotNull(errMsg, DateUtil.str2Date(""));
        assertNotNull(errMsg, DateUtil.str2Date("  "));
        assertNotNull(errMsg, DateUtil.str2Date("20160404 15:16:52", null));
        assertNotNull(errMsg, DateUtil.str2Date("20160404 15:16:52", ""));
        assertNotNull(errMsg, DateUtil.str2Date("20160404 15:16:52", "  "));
    }

    /**
     * 测试日期{@link Date}转换为日期字符串
     */
    public void testDate2Str() {

        String errMsg = "日期转换为日期字符串错误";
        assertTrue(errMsg, !StringUtil.isBlank(DateUtil.date2Str(new Date())));
        assertTrue(errMsg,
            !StringUtil.isBlank(DateUtil.date2Str(new Date(), DateFormatConstants.NORMAL)));
        assertTrue(errMsg,
            !StringUtil.isBlank(DateUtil.date2Str(new Date(), DateFormatConstants.FULL)));
        assertTrue(errMsg,
            !StringUtil.isBlank(DateUtil.date2Str(new Date(), DateFormatConstants.SHORT)));
        assertTrue(errMsg,
            !StringUtil.isBlank(DateUtil.date2Str(new Date(), DateFormatConstants.yyyyMMdd_HH)));
        assertTrue(errMsg,
            !StringUtil.isBlank(DateUtil.date2Str(new Date(), DateFormatConstants.yyyyMMdd_HH_mm)));
        assertTrue(errMsg,
            !StringUtil.isBlank(DateUtil.date2Str(null, DateFormatConstants.yyyyMMdd_HH_mm)));
        assertTrue(errMsg, !StringUtil.isBlank(DateUtil.date2Str(null, null)));
        assertTrue(errMsg, !StringUtil.isBlank(DateUtil.date2Str(null, "")));
        assertTrue(errMsg, !StringUtil.isBlank(DateUtil.date2Str(null, "  ")));

        System.err.println(DateUtil.date2Str(null, DateFormatConstants.yyyyMMdd_HH_mm));
    }
}

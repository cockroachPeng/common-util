/**
 * cockroachPeng.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.cockroach.peng.common.util.date;

import java.util.Date;

import junit.framework.TestCase;

import com.cockroach.peng.common.util.string.StringUtil;

/**
 * 日期工具类异常测试
 * 
 * @author gangqiang.pgq
 * @version $Id: DateUtilTest.java, v 0.1 2016年4月4日 上午10:51:34 gangqiang.pgq Exp $
 */
public class DateUtilExceptionTest extends TestCase {

    /**
     * 测试日期字符串转换为日期{@link Date}
     */
    public void testStr2Date() {

        try {
            DateUtil.str2Date("20160404\15:16:52");
            assertTrue(false); //正常不会走到这里
        } catch (Exception e) {
            assertFalse(false);
        }

        //        String errMsg = "日期字符串转换为日期错误";
        //        assertNotNull(errMsg, );
        //        assertNotNull(errMsg, DateUtil.str2Date("20160404 15:16:52", DateFormatConstants.NORMAL));
        //        assertNotNull(errMsg, DateUtil.str2Date("20160404 15:16:52.212", DateFormatConstants.FULL));
        //        assertNotNull(errMsg, DateUtil.str2Date("20160404", DateFormatConstants.SHORT));
        //        assertNotNull(errMsg, DateUtil.str2Date("20160404 15", DateFormatConstants.yyyyMMdd_HH));
        //        assertNotNull(errMsg,
        //            DateUtil.str2Date("20160404 15:16", DateFormatConstants.yyyyMMdd_HH_mm));
    }
}

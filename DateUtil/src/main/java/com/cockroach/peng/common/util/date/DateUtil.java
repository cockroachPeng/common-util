/**
 * cockroachPeng.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.cockroach.peng.common.util.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

import com.cockroach.peng.common.util.exception.MyException;
import com.cockroach.peng.common.util.string.StringUtil;

/**
 * <p>日期（{@link Date}）工具类，扩展自{@code DateUtils}</p>
 * <p>
 *  <br><b>新增常用的方法</b>：
 *  <br>
 *  <li>日期比较，按日、按时、按秒
 *  <li>日期转换，格式：'yyyyMMhh'，'yyyyMMdd HH:mm:ss'等，具体格式参考：{@link DateFormatConstants}
 * </p>
 * 
 * @author gangqiang.pgq
 * @version $Id: DateUtil.java, v 0.1 2016年3月19日 下午3:05:00 gangqiang.pgq Exp $
 */
public class DateUtil extends DateUtils {

    /**
     * <p>
     *  按默认格式（{@link DateFormatConstants#NORMAL}）将日期字符串转换成日期{@link Date}
     * </p>
     * 
     * @param date  日期字符串,如果字符串为空（<code>blank</code>）则返回当前时间
     * @return  转换后日期{@link Date}
     */
    public static Date str2Date(String date) {
        return str2Date(date, DateFormatConstants.NORMAL);
    }

    /**
     * <p>按指定格式将日期字符串转换成日期{@link Date}</p>
     * <p>
     *  <li>日期格式参考：{@link DateFormatConstants}
     * </p>
     * 
     * @param date      日期字符串，如果字符串为空（<code>blank</code>）则返回当前时间
     * @param format    转换格式，如果该字段为空（<code>blank</code>）则使用默认格式（{@link DateFormatConstants#NORMAL}）
     *                  转换，格式类型参考：{@link DateFormatConstants}
     * @return 转换后日期{@link Date}
     */
    public static Date str2Date(String date, String format) {

        try {
            if (StringUtil.isBlank(date)) {
                return new Date();
            }

            String formatTmp = StringUtil.defaultString(format, DateFormatConstants.NORMAL);

            DateFormat dateFormat = new SimpleDateFormat(formatTmp);

            return dateFormat.parse(date);
        } catch (Exception e) {
            throw MyException.getIllegalArgumentException(e,
                "parse date string exception,arg is [date:%s,format:%s]", date, format);
        }
    }

    /**
     * <p>
     *  将日期{@link Date}转换成默认格式（{@link DateFormatConstants#NORMAL}）的日期字符串
     * </p>
     * 
     * @param date  待转换的日期，<font color='red'>如果该参数为<code>null</code>则使用当前时间转换</font>
     * @return  转换后的日期字符串{@link String}
     */
    public static String date2Str(Date date) {
        return date2Str(date, DateFormatConstants.NORMAL);
    }

    /**
     * <p>将日期转换成指定格式的日期字符串</p>
     * <p>
     *  <li>日期格式参考：{@link DateFormatConstants}
     * </p>
     * 
     * @param date      待转换的日期，如果该参数为<code>null</code>则使用当前时间转换
     * @param format    转换格式，如果该字段为空（<code>blank</code>）则使用默认格式（{@link DateFormatConstants#NORMAL}）
     *                  转换，格式类型参考：{@link DateFormatConstants}
     * @return  转换后的日期字符串{@link String}
     */
    public static String date2Str(Date date, String format) {

        try {
            Date dateTmp = (date == null ? new Date() : date);

            String formatTmp = StringUtil.defaultString(format, DateFormatConstants.NORMAL);

            DateFormat dateFormat = new SimpleDateFormat(formatTmp);
            return dateFormat.format(dateTmp);
        } catch (Exception e) {
            throw MyException.getIllegalArgumentException(e,
                "format date exception,arg is [date:%s,format:%s]", date, format);
        }
    }
}

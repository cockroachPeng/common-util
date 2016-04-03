/**
 * cockroachPeng.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.cockroach.peng.common.util.String;

import org.apache.commons.lang3.StringUtils;

/**
 * <p>字符串工具扩展，扩展自{@link StringUtils}</p>
 * 
 * @author gangqiang.pgq
 * @version $Id: StringUtils.java, v 0.1 2016年4月4日 上午12:46:12 gangqiang.pgq Exp $
 */
public class StringUtil extends StringUtils {

    /**
     *
     * @param str
     * @param defaultStr
     * @return
     */
    public static String defaultString(final String str, final String defaultStr) {

        return isBlank(str) ? defaultStr : str;
    }
}

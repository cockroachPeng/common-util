/**
 * cockroachPeng.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.cockroach.peng.common.util.Exception;

/**
 * <p>异常</p>
 * 
 * @author gangqiang.pgq
 * @version $Id: MyException.java, v 0.1 2016年4月3日 下午10:04:43 gangqiang.pgq Exp $
 */
public class MyException {

    /**
     * 根据错误信息，获取一个{@link IllegalArgumentException}，errMsg支持可变参数
     * 
     * @param errMsg    错误信息，支持可变参数；格式见：{@link String#format(String, Object...)}
     * @param obj       可变参数
     * @return  新创建的{@link IllegalArgumentException}
     */
    public static IllegalArgumentException getIllegalArgumentException(String errMsg, Object... obj) {
        return getIllegalArgumentException(null, errMsg, obj);
    }

    /**
     * 根据原异常错误信息，获取一个{@link IllegalArgumentException}，errMsg支持可变参数
     * 
     * @param e         原异常
     * @param errMsg    错误信息，支持可变参数；格式见：{@link String#format(String, Object...)}
     * @param obj       可变参数
     * @return          新创建的{@link IllegalArgumentException}
     */
    public static IllegalArgumentException getIllegalArgumentException(Throwable e, String errMsg,
                                                                       Object... obj) {
        String msg = String.format(errMsg, obj);
        return new IllegalArgumentException(msg, e);
    }
}

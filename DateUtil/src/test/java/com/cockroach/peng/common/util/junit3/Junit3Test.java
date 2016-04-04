/**
 * cockroachPeng.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.cockroach.peng.common.util.junit3;

import junit.framework.TestCase;

/**
 * <p>junit 3 方法测试</p>
 * <p>
 *  <li>测试junit 3各种自带方法的作用；
 *  <li>junit测试范例；
 * </p>
 * 
 * @author gangqiang.pgq
 * @version $Id: Junit3Test.java, v 0.1 2016年4月4日 上午10:58:40 gangqiang.pgq Exp $
 */
public class Junit3Test extends TestCase {

    /**
     * @param name
     */
    public Junit3Test(String name) {
        super(name); // 这个方法调用必须在构造函数的第一行，虽然ide会提示报错，但是还得知道一下
        System.out.println("1.构造函数");
    }

    /**
     * <p>
     *  该方法在执行测试方法（如：testA）之前执行，一般用于测试准备工作；如：打开一个网络连接
     * </p>
     * 
     * @see junit.framework.TestCase#setUp()
     */
    @Override
    protected void setUp() throws Exception {
        System.out.println("2.方法setUp开始执行");
        super.setUp();
        System.out.println("2.打开一个网络连接");
        System.out.println("2.方法setUp执行完毕");
    }

    /**
     * <p>
     *  该方法在执行测试方法（如：testA）之后执行，一般用于测试清理工作；如：关闭一个网络连接
     * </p>
     * 
     * @see junit.framework.TestCase#tearDown()
     */
    @Override
    protected void tearDown() throws Exception {
        System.out.println("4.方法tearDown开始执行");
        super.tearDown();
        System.out.println("4.关闭网络连接");
        System.out.println("4.方法tearDown开始执行");
    }

    /**
     * <p>测试方法</p>
     * <p>执行真正的测试任务</p>
     */
    public void testA() {
        System.out.println("3.执行测试方法...");
    }
}

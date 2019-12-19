package com.api.testcase;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Base {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void afeterClass() {
        System.out.println("AfterClass");
    }

    @Before
    public void before() {
        System.out.println("before");
    }

    @Test
    public  void test0() {
        System.out.println("test0");
    }

    @Test
    public  void test1() {
        System.out.println("test1");
    }

    @Test
    public  void test2() {
        System.out.println("test2");
    }
}

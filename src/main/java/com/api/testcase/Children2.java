package com.api.testcase;

import org.junit.*;
import org.junit.runners.MethodSorters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Children2 extends Base {

    @BeforeClass
    public static void beforeClassChildren2() {
        System.out.println("BeforeClass Children2");
    }

    @AfterClass
    public static void afeterClassChildren2() {
        System.out.println("AfterClass Children2");
    }

    @Before
    public void beforeChildren2() {
        System.out.println("before Children2");
    }

    @Test
    public  void test0Children2() {
        System.out.println("test0 Children2");
        assertThat(1, equalTo(2));
    }

    @Test
    public  void test1Children2() {
        System.out.println("test1 Children2");
    }

    @Test
    public  void test2Children2() {
        System.out.println("test2 Children2");
    }
}

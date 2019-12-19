package com.api.testcase;

import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Children extends Base {

    @BeforeClass
    public static void beforeClassChildren() {
        System.out.println("BeforeClass Children");
    }

    @AfterClass
    public static void afeterClassChildren() {
        System.out.println("AfterClass Children");
    }

    @Before
    public void beforeChildren() {
        System.out.println("before Children");
    }

    @Test
    @Category(Stage.class)
    public  void test0Children() {
        System.out.println("test0 Children");
    }

    @Test
    @Ignore("just for show")
    public  void test1Children() {
        System.out.println("test1 Children");
    }

    @Test
//    @Category(Prod.class)
    public  void test2Children() {
        System.out.println("test2 Children");
    }
}

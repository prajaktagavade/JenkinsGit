package com.framework.tests;

import org.testng.annotations.DataProvider;

import java.util.*;

public class AltroDataProvider {

    @DataProvider(name = "altroDP")
    public static Object[][] getAccountBalance() {
        Map<String,String> map1 = new HashMap<>();
        map1.put("username","jsmith");
        map1.put("password", "demo1234");
        map1.put("account","800002 Savings");
        map1.put("expectedBalance","-$1999");

        Map<String,String> map2 = new HashMap<>();
        map2.put("username","jsmith");
        map2.put("password", "demo1234");
        map2.put("account","800003 Checking");
        map2.put("expectedBalance","2");

        return new Object[][] {{map1},{map2}};
    }
/*
    @DataProvider(name = "altroDPExcel")
    public static Object[][] getAccountBalanceFromExcel() {

    }*/
}

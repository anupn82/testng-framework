package com.mycompany.demo;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "userInfo")
    public Object[][] loginInfo(){
//     Object[][] data = new Object[][]{
//             {"John", "john123"},
//             {"Mary", "mary123"},
//             {"David", "david123"}
//     };
//     return data;
      return new Object[][]{
              {"John", "john123"},
              {"Mary", "mary123"},
              {"David", "david123"}
      };
    }

    @DataProvider(name = "accInfo")
    public Object[][] accInfo(){
        return new Object[][]{
                {"John", "Doe", "120 King St"},
                {"Mary", "Doe", "120 King St" },
                {"David", "Doe", "120 King St"}
        };
    }
}



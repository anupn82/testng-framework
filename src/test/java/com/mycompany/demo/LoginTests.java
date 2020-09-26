package com.mycompany.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {
    @Test(priority = 1, testName = "Login test with valid username and password")
    public void loginWithValidUser(){
        System.out.println("Login test with valid username and password");
        String exp = "Hello";
        String act = "Hello";
        Assert.assertEquals(act,exp, "The words don't match");
    }
    @Test(priority = 2, testName = "Login test with invalid username and password")
    public void loginWithInvalidUser(){
        System.out.println("Login test with invalid User");
    }
    @Test(priority = 3, testName = "Verify home page title")
    public void homePageTest(){
        System.out.println("This is a homepage test");
    }
    @Test(priority = 4, testName = "Verify Logout")
    public void logoutTest(){
        System.out.println("This is a logout test");
    }
}

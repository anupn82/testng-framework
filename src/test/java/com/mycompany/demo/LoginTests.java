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
        Assert.fail("Invalid user login test failed");
    }
    @Test(priority = 3, testName = "Verify home page title")
    public void homePageTest(){
        System.out.println("This is a homepage test");
        String exp = "Homepage";
        String act = "Homepage";
        Assert.assertTrue(exp==act, "Home page login not valid");
    }
    @Test(priority = 4, testName = "Verify Logout")
    public void logoutTest(){
        System.out.println("This is a logout test");
    }
}

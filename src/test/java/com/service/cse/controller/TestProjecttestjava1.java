package com.service.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjecttestjava1 {

        Projecttestjava1Delegate projecttestjava1Delegate = new Projecttestjava1Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projecttestjava1Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
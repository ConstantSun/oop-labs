/*
 * @author: Duong Thi Thuy Hang
 * @since: 25th Sep 2018
 * @version: 0.1
 */



package com.petehouston.maven.unittestsample;

import org.junit.Assert;
import org.junit.Test;

public class G2 {
    @Test
    public void t1()
    {
        Greeter greeter = new Greeter();



        int a[] = new int[5];
        a[0] = 5; a[1] = 2 ;a[2] =-2 ;a[3] = 8; a[4] = 0;
        Assert.assertEquals(-2,Greeter.minOfArray(a,5));

    }

    @Test
    public void t2()
    {
        Greeter greeter = new Greeter();



        int a1[] = {5,2,-2,8,0,-10};
        Assert.assertEquals(-10,Greeter.minOfArray(a1,6));

    }

    @Test
    public void t3()
    {
        Greeter greeter = new Greeter();




        int a2[] = {5,2,-6,8};
        Assert.assertEquals(-6,Greeter.minOfArray(a2,4));

    }

    @Test
    public void t4()
    {
        Greeter greeter = new Greeter();




        int a3[] ={35,10,-2,18,0};
        Assert.assertEquals(-2,Greeter.minOfArray(a3,5));

    }

    @Test
    public void t5()
    {
        Greeter greeter = new Greeter();



        int a4[] ={5,2,-2,8,0};
        Assert.assertEquals(-2,Greeter.minOfArray(a4,5));

    }
}
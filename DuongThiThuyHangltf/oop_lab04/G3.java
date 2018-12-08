/*
 * @author: Duong Thi Thuy Hang
 * @since: 25th Sep 2018
 * @version: 0.1
 */



package com.petehouston.maven.unittestsample;

import org.junit.Assert;
import org.junit.Test;

public class G3 {
    @Test
    public void t1()
    {
        Greeter greeter = new Greeter();
        Assert.assertEquals("Binh thuong",Greeter.BMI(50,1.55));

    }
    @Test
    public void t2()
    {
        Greeter greeter = new Greeter();

        Assert.assertEquals("Beo phi",Greeter.BMI(100,1.55));

    }
    @Test
    public void t3()
    {
        Greeter greeter = new Greeter();



        Assert.assertEquals("Thua can",Greeter.BMI(56,1.55));

    }
    @Test
    public void t4()
    {
        Greeter greeter = new Greeter();


        Assert.assertEquals("Thieu can",Greeter.BMI(30,1.55));

    }
    @Test
    public void t5()
    {
        Greeter greeter = new Greeter();


        Assert.assertEquals("Binh thuong",Greeter.BMI(51,1.55));

    }

}
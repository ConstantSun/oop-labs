/*
 * @author: Duong Thi Thuy Hang
 * @since: 25th Sep 2018
 * @version: 0.1
 */



package com.petehouston.maven.unittestsample;

import org.junit.Assert;
import org.junit.Test;

public class GreeterTest {
    @Test
    public void t1()
    {
        Greeter greeter = new Greeter();
        Assert.assertEquals(6,greeter.maximum(2,6));
    }

    @Test
    public void t2()
    {
        Greeter greeter = new Greeter();
        Assert.assertEquals(7,greeter.maximum(-2,7));

    }

    @Test
    public void t3()
    {
        Greeter greeter = new Greeter();


        Assert.assertEquals(8,greeter.maximum(1,8));


    }

    @Test
    public void t4()
    {
        Greeter greeter = new Greeter();



        Assert.assertEquals(9,greeter.maximum(4,9));



    }

    @Test
    public void t5()
    {
        Greeter greeter = new Greeter();

        Assert.assertEquals(10,greeter.maximum(-25,10));


    }

}
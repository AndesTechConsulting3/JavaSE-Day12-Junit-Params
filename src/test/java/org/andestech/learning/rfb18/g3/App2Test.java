package org.andestech.learning.rfb18.g3;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertTrue;


public class App2Test
{
    @Category({ISlowTest.class})
    @Test
public void slow3Test()
{
    assertTrue( true );
    System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
}

    @Test
    @Category({IFastTest.class})
    public void fast4Test()
    {
        assertTrue( true );
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }


    @Category({ISlowTest.class, IWeekendTest.class})
    @Test
    public void slow4Test()
    {
        assertTrue( true );
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}



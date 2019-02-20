package org.andestech.learning.rfb18.g2;

import static org.junit.Assert.assertTrue;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AppTest 
{

@Category({IFastTest.class})
@Test
 public void fast1Test()
{
    assertTrue( true );
    System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
}
    @Category({IFastTest.class})
    @Test
    // public void fast2Test()
    public void forma_11_Test()
    {
        assertTrue( true );
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Category({IFastTest.class})
    @Test
   // public void fast2Test()
    public void forma_14_Test()
    {
        assertTrue( true );
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}




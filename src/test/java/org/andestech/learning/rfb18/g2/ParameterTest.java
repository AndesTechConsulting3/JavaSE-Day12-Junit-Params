package org.andestech.learning.rfb18.g2;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Math1
{
    public static int summa(int a, int b)
    {
        return a+b;
    }
}

@RunWith(Parameterized.class)
public class ParameterTest {

    private int x;
    private int y;
    private int z;

    public ParameterTest(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

  @Ignore
  @Test
    public void summaTest(){

        int a=1, b=2;
        Assert.assertEquals(3, Math1.summa(a,b));

        a=3; b=2;
        Assert.assertEquals(5, Math1.summa(a,b));

    }


    @Parameterized.Parameters
    public static List<Object[]> getData3(){

        return Arrays.asList(new Object[][]{
                {1,2,3},
                {3,-3,1},
                {3,6,9}
        });

    }

    @Parameterized.Parameters
    public static List<Object[]> getData2(){

        ArrayList<Object[]> list = new ArrayList<>();

        list.add(new Object[]{3,2,5});
        list.add(new Object[]{-3,-2,-5});
        list.add(new Object[]{3,5,5});
        list.add(new Object[]{13,12,25});

        return list;

    }



    @Test
    public void summaParTest(){
        Assert.assertEquals(z, Math1.summa(x,y));

    }

}

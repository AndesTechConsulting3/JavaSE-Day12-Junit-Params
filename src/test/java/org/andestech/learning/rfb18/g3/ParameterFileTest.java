package org.andestech.learning.rfb18.g3;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class ParameterFileTest {

    private int x;
    private int y;
    private int z;

    public ParameterFileTest(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    @Parameterized.Parameters
    public static List<Object[]> getData3(){

      return FileUtils.getData("src/test/resources/data.txt");

    }

    @Test
    public void summaParTest(){
        Assert.assertEquals(z, Math1.summa(x,y));

    }

}

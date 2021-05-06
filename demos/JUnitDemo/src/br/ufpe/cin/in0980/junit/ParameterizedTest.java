package br.ufpe.cin.in0980.junit;


import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    private final int aParameter;
    private final int anotherParameter;

    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 1},
                {0, 10},
                {0, 250},
                {0, 2500},
                {0, 10000},
                {1, 1},
                {1, 10},
                {1, 250},
                {1, 2500},
                {1, 10000},
                {10, 1},
                {10, 10},
                {10, 250},
                {10, 2500},
                {10, 10000},
                {250, 1},
                {250, 10},
                {250, 250},
                {250, 2500},
                {250, 10000},
                {2500, 1},
                {2500, 10},
                {2500, 250},
                {2500, 2500},
                {2500, 10000},
                {10000, 1},
                {10000, 10},
                {10000, 250},
                {10000, 2500},
                {10000, 10000},
        });
    }

    public ParameterizedTest(int aParameter, int anotherParameter) {
        this.aParameter = aParameter;
        this.anotherParameter = anotherParameter;
    }

    @Test
    public void parameterized() {
        System.out.println("aParameter: " + aParameter);
        System.out.println("anotherParameter: " + anotherParameter);

        // this combination fails for some reason...
        if (aParameter == 2500 && anotherParameter == 1) {
            throw new RuntimeException();
        }
    }
}

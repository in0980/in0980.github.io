package br.ufpe.cin.in0980.junit;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


//Hamcrest --> matchers
public class BinarySearchTest {

    int[] a;

    @Before
    public void setUp() {
        a = new int[]{7,9,1,3,5,13,20,55,255,127};
        Arrays.sort(a);
        //1,3,5,7,9,13,20,55,127,255
    }

    @Test
    public void buscarElementoPresente() {
        int index = BinarySearch.binarySearch(a,5);
        //JUnit puro
        Assert.assertEquals(2,index);
        //Hamcrest
        assertThat(index, is(2));
    }

    @Test
    public void buscarElementoNaoPresente() {
        int index = BinarySearch.binarySearch(a,15);
        assertThat(index, is(lessThan(0)));
    }



}

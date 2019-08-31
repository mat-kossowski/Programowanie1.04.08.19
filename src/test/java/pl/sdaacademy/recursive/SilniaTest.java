package pl.sdaacademy.recursive;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SilniaTest {

    @Test
    public void iteration() {


        Silnia silnia = new Silnia();


        Assert.assertEquals(1,silnia.iteration(0));
        Assert.assertEquals(1,silnia.iteration(1));
        Assert.assertEquals(2,silnia.iteration(2));
        Assert.assertEquals(6,silnia.iteration(3));
        Assert.assertEquals(24,silnia.iteration(4));
        Assert.assertEquals(120,silnia.iteration(5));
    }

    @Test
    public void recursive() {


        Silnia silnia = new Silnia();


        Assert.assertEquals(1,silnia.recursive(0));
        Assert.assertEquals(1,silnia.recursive(1));
        Assert.assertEquals(2,silnia.recursive(2));
        Assert.assertEquals(6,silnia.recursive(3));
        Assert.assertEquals(24,silnia.recursive(4));
        Assert.assertEquals(120,silnia.recursive(5));
    }

}
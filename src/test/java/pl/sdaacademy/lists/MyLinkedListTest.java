package pl.sdaacademy.lists;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {


    @Test
    public void addShouldAddElementToEmptyList(){
        //given
        MyLinkedList myLinkedList = new MyLinkedList();
        //then
        myLinkedList.add(5);
        //when
        Assert.assertEquals(1,myLinkedList.size());
    }
    @Test
    public void addShouldAddElementToNonEmptyList(){
        //given
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        //then
        myLinkedList.add(5);
        //when
        Assert.assertEquals(5,myLinkedList.size());
    }

}
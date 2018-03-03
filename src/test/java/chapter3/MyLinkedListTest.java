package chapter3;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    MyLinkedList<Integer>  integer = new MyLinkedList<Integer>();



    @Test
    public void add() {
        integer.add(1);
        integer.add(2);
    }

    @Test
    public void size() {
        add();
        integer.add(3);
        assertTrue("assertTrue",integer.size() == 3);
        integer.add(4);
        assertTrue("assertTrue",integer.size() == 4);
        integer.add(4);
        assertTrue("assertTrue",integer.size() == 5);
    }

    @Test
    public void get() {
    }
}
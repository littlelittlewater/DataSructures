package chapter3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class MyArrayListTest {
    MyArrayList<Integer> integers;
    @Before
    public void iniArray(){
        integers = new MyArrayList<Integer>();
    }
    @Test
    public void get() {
        for(int i = 0 ; i <= 12 ; i++){
            integers.add(i);
        }
        for(int i = 0 ; i <= 12 ; i++){
            assertTrue("assertTrue",i==integers.get(i));

        }
    }

    @Test
    public void set() {
        MyArrayList<Integer> integers = new MyArrayList<Integer>();
        integers.add(1);
    }

    @Test
    public void changeCapatity() {
        MyArrayList<Integer> integers = new MyArrayList<Integer>();
        integers.changeCapatity(10);
    }

    @Test
    public void size() {
        for(int i = 0 ; i <= 12 ; i++){
            integers.add(i);
        }
        System.out.println(integers.size());
    }

    @Test
    public void hasNext() {
    }

    @Test
    public void next() {
    }

    @Test
    public void remove() {


    }

    @Test
    public void add() {
        for(int i = 0 ; i <= 10 ; i++){
            integers.add(i);
        }
    }

    @Test
    public void iterator() {

        for(int i = 0 ; i <= 10 ; i++){
            integers.add(i);
        }
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
package chapter3;

import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {
    private static final  int  capacity = 10;
    private  T[] arr ;
    private int size;

    public MyArrayList() {
        clear();
    }

    public T get(int i){
        if(i <= size){

        }
        return  arr[i];
    }

    public void set(T t){

    }


    //修改容量
    public void  changeCapatity(int size){
        //如果修改的容量更小，就直接return
        if(size < this.size){
            return ;
        }
        //因为不能直接new泛型，所以new一个超类，然后
        T[] old = arr;
        arr = (T[])  new Object[size];
        for(int i = 0 ; i < size() ; i ++){
            arr[i] = old[i];
        }

    }



    public int size(){
        return size;
    }

    public Boolean isEmpty(){
       return  arr.length == 0 ;
    }

    public void clear(){
        size = 0 ;
        changeCapatity(capacity);
    }

    public boolean hasNext() {
        return false;
    }

    public T next() {
        return null;
    }

    public void remove(){

    }


    public void add(T[] arr){

    }

    public void add(T t){
        if(size() == arr.length){
            changeCapatity(2*size);
        }
        arr[size++] = t ;
    }
    public Iterator<T> iterator() {
        return new MyIterater();
    }



    public  class  MyIterater implements Iterator{
        int cur = 0 ;
        public boolean hasNext() {
            System.out.println(cur + "" + size());
            return cur < size();
        }

        public Object next() {
            assert cur < size();
            return arr[cur++];
        }

        public void remove() {
        }
    }
}

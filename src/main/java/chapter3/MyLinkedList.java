package chapter3;

public class MyLinkedList <T>{
     private  int size;

      public MyLinkedList() {
          head = cur ;
       }

       public  int size(){
          int size = 0;
          Node node = head;
          while(!isLast(node)){
               node = node.next;
               size++;
          }
          return size;
       }
       public Boolean isEmpty(){
            if(head.next == null)
            {
                return true;
            }
            return false;
        }
        public void add(T t){
            Node node = new Node();
            node.next = null;
            node.data = t ;
            cur.next=node;
            cur = cur.next;
        }

        public void add(int index ,T t){


        }

        public T get(int index){
            Node<T> node = head;
            int i = 0 ;
            node = node.next;
            while(!isLast(head) && i++ < index){
                node=node.next;
            }
            return node.data;
        }

        public void set(int index ,T t){

        }

        public void remove(int idx){

        }
        private boolean isLast(Node node){

          if(node.next == null){
              return true;
          }else {
              return false;
          }
        }

        private Node<T> head =  new Node<T>();
        private Node<T> cur = new Node<T>();
        private class Node<T>{
            Node<T> next = null;
            T data = (T) new Object();
        }
}

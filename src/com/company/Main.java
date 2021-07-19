package com.company;




 class LinkList {


    private class Node{
        private  int value;
        private  Node next;

        public  Node (int value){
            this.value = value;
        }
    }



    private Node first;
    private  Node last;

    public void addFirst(int item){
        Node node = new Node(item);

        if (isEmpty()){
            first = last = node;
        }else{
            while(last.next != null){

            }
        }
    }

    public void addLast(int item){
        Node node = new Node(item);

        if (isEmpty()){
            first = last = node;
        }else{
           last.next = node;
           last = node;
        }

    }

    private boolean isEmpty(){
      return first == null;
    }



}

public class Main {

    public static void main(String[] args) {

      var link = new LinkList();
        link.addLast(1);
        link.addLast(2);
        link.addLast(3);



    }
}

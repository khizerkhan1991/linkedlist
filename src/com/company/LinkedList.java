package com.company;

public class LinkedList {

   private  Node node;
   private  int size = 0;

   // insert in linkedList
    public  boolean insert(int data){

        try {
            if(node == null){
                node = new Node(data);
                size ++;
                return true;
            }
            else{
                return insert(node, data);
            }
        }
        catch (Exception x){
            return false;
        }
    }

    // insert in linked list
    private  boolean insert(Node node, int data) {

        if(node.getNextNode() != null)
           return insert(node.getNextNode(), data);
        else{
            node.setNextNode(new Node(data));
            size ++;
            return true;
        }
    }

    // get element by index
    public Integer getByIndex(int index){

        Node n = node;
        if (index >= size)
            return null;

        for(int i = 0; i < index; i++){
            n = n.getNextNode();
        }

        return n.getData();
    }

    // delete index by element
    public boolean deleteNode(int deletedIndex){

        if (deletedIndex >= size)
            return false;

        Node n = node;
        Node secondLastNode = null;

        for(int i=0; i<= deletedIndex +1; i++){

            if(i == deletedIndex - 1)
                secondLastNode = n;
            else if(i == deletedIndex + 1){
                secondLastNode.setNextNode(n);
                return true;
            }
            n = n.getNextNode();

        }
        return false;
    }
}

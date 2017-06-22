package linkedList.reverseLinkedList;

import java.util.HashSet;

public class Practice_01 {
    private Node head;
    
    public void reverseLinkedList(){
        Node oldNode = head;
        head = null;
        
        for(Node n = oldNode; n != null; n = n.next){
        
        }
    }
    
    public void addToHead(int n){
        Node newNode =  new Node();
        newNode.data = n;
        newNode.next = head;
        head = newNode;
    }
    
    public void removeFirst(){
        if(head == null){
            throw new RuntimeException("Nothing to remove");
        }
        head = head.next; 
    }
    
    @Override
    public String toString(){
        String str = "[ ";
        
        for(Node n = head; n != null; n = n.next){
            str += n.data + " ";
        }
        str += "]";
        return str;
    }
    
    public void removeDuplicates(){
        HashSet<Object> set = new HashSet<Object>();
        Node prev = null;
        Node n = head;
        
        while(n!=null){
            if(set.contains(n.data)){
                prev.next = n.next;    
            }
            else{
               set.add(n.data);
               prev = n;
            }
            n = n.next;
        }
    }
}

class Node{
    public Object data;
    public Node next;

    Node(){
        this.data = null;
        this.next = null;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.data);
    }
}

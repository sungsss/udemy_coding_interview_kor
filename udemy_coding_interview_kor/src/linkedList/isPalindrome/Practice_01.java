package linkedList.isPalindrome;

import java.util.HashSet;
import java.util.Stack;

public class Practice_01 {
    private Node head;

    public boolean isPalindrome(){
        Node n1 = this.head;
        Node n2 = this.head;
                
        Stack<Object> stack = new Stack<Object>();        
                
        while(n2 != null && n2.next != null){
            stack.add(n1.data);
            n1 = n1.next;
            n2 = n2.next.next;
        }
        
        //To skip the middle of the case of "Odd"
        //1 1 1 1 1
        //1 2 3 4 5 4 3 2 1
        //2   2   2   2   2

        //1 1 1 1 1 
        //1 2 3 4 5 5 4 3 2 1 
        //2    2   2    2   2
        
        if(n2 != null){
            n1 = n1.next;
        }
        
        while(n1 != null){
            if(stack.pop() != n1.data){
                return false;
            }
            else{
                n1 = n1.next;
            }
        }
        return true;
    }

    public Node getKthToLast(int k){
        Node n1 = this.head;
        Node n2 = this.head;
        
        for(int i = 1; i < k; i++){   
            if(n2 == null) return null;
            n2 = n2.next;
        }
        
        while(n2.next != null){
            n1 = n1.next;
            n2 = n2.next;
        }
        return n1;
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
package linkedList.singleLinkedList;

public class Practice_01 {
    private Node head;
    
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

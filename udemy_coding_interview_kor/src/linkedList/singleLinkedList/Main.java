package linkedList.singleLinkedList;

public class Main {
    public static void main(String[] args) {
        Practice_01 linkedList = new Practice_01();
        linkedList.addToHead(30);
        linkedList.addToHead(20);
        linkedList.addToHead(10);
        
        System.out.println(linkedList.toString());
        
        linkedList.removeFirst();
        linkedList.removeFirst();
        linkedList.removeFirst();
        
        System.out.println(linkedList.toString());
        
    }
}

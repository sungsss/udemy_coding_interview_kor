package linkedList.removeDuplicates;

public class Main {
    public static void main(String[] args) {
        Practice_01 linkedList = new Practice_01();
        
        linkedList.addToHead(10);
        linkedList.addToHead(10);
        linkedList.addToHead(20);
        linkedList.addToHead(20);
        
        System.out.println(linkedList.toString());
        
        linkedList.removeDuplicates();
        
        System.out.println(linkedList.toString());
        
        
    }
}

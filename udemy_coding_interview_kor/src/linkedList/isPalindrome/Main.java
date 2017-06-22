package linkedList.isPalindrome;

public class Main {
    public static void main(String[] args) {
        Practice_01 linkedList = new Practice_01();
        
        linkedList.addToHead(10);
        linkedList.addToHead(20);
        linkedList.addToHead(30);
        linkedList.addToHead(40);
        linkedList.addToHead(50);
        linkedList.addToHead(40);
        linkedList.addToHead(30);
        linkedList.addToHead(20);
        linkedList.addToHead(10);
        
        System.out.println(linkedList.toString());
        
        boolean result = linkedList.isPalindrome();
        
        System.out.println(result);
        
         Practice_01 linkedList2 = new Practice_01();
        
        linkedList2.addToHead(10);
        linkedList2.addToHead(20);
        linkedList2.addToHead(30);
        linkedList2.addToHead(40);
        linkedList2.addToHead(50);
        linkedList2.addToHead(50);
        linkedList2.addToHead(40);
        linkedList2.addToHead(30);
        linkedList2.addToHead(20);
        linkedList2.addToHead(10);
        
        System.out.println(linkedList2.toString());
        
        boolean result2 = linkedList2.isPalindrome();
        
        System.out.println(result2);
    }
}

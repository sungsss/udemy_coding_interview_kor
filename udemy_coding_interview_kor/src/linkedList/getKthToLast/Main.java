package linkedList.getKthToLast;

public class Main {
    public static void main(String[] args) {
        Practice_01 linkedList = new Practice_01();
        
        linkedList.addToHead(10);
        linkedList.addToHead(20);
        linkedList.addToHead(30);
        linkedList.addToHead(40);
        
        System.out.println(linkedList.toString());
        
        Node node = linkedList.getKthToLast(2);
        
        System.out.println(node.data);
    }
}

package stack.arrayStack;

public class Main {
    public static void main(String[] args) {
        Practice_01 stack1 = new Practice_01();
        for(int i=1; i<=100; i++){
            stack1.push(i);
        }
        stack1.push(101);
        System.out.println(stack1.pop());
    }
}


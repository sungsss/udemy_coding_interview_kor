package string.wordCount;

public class Main {
    public static void main(String[] args) {
        String testStr = "i love you and you are a girl!";
        Practice_01 p1 = new Practice_01();
        p1.read(testStr.split(" "));
        int count = p1.getCount("you");
        System.out.println(count);
    }
}

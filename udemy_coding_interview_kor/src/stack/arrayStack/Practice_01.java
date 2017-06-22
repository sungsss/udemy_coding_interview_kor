package stack.arrayStack;

public class Practice_01 {
    private int[] data = new int[100];
    private int topIndex = -1;
    
    public void push(int i){
        if(data.length-1 == topIndex){
            int[] oldData = data;
            data = new int[data.length * 2];
            System.arraycopy(oldData, 0, data, 0, oldData.length);
        }
        data[++topIndex] = i;
    }
    
    public int pop(){
        if(topIndex < 0){
            throw new RuntimeException("Nothing to pop");
        }
        int value = data[topIndex--];
        return value;
    }
}

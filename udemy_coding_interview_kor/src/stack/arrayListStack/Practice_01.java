package stack.arrayListStack;

import java.util.ArrayList;
import java.util.List;

public class Practice_01<T> {
	private List<T> list;
    
    public Practice_01(){
        list = new ArrayList<T>();
    }
    
    public void push(T i){
    	list.add(i);
    }
    
    public T pop(){
    	return list.get(list.size()-1);
    }
}

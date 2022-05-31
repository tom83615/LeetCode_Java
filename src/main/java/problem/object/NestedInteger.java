package problem.object;

import java.util.ArrayList;
import java.util.List;

public class NestedInteger {

    private boolean isInteger;
    private int value;
    private List<NestedInteger> list;

    public NestedInteger(int value){
        this.value = value;
        this.isInteger = true;
    }

    public NestedInteger(List<NestedInteger> list){
        this.list = list;
        this.isInteger = false;
    }

    public NestedInteger(int... integers){
        this.list = new ArrayList<>();
        for(int integer: integers){
            this.list.add(new NestedInteger(integer));
        }
        this.isInteger = false;
    }

    public boolean isInteger(){
        return isInteger;
    }

    public int getInteger(){
        return isInteger? this.value : Integer.parseInt(null);
    }

    public List<NestedInteger> getList(){
        return !isInteger? this.list: null;
    }

    public void add(NestedInteger nestedInteger){
        if(isInteger){
            List<NestedInteger> newlist = new ArrayList<>();
            newlist.add(new NestedInteger(this.value));
            newlist.add(nestedInteger);

            this.list = newlist;
            this.isInteger = false;
        }else{
            this.list.add(nestedInteger);
        }
    }
}

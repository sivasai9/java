package Arraylist;

import java.util.Arrays;

public class customarraylist {
    private int []data;
    private static int default_size=10;
    private int size=0;
    
    public customarraylist(){
        this.data = new int[default_size];
    }
    public void add(int num){
        if(isnull()){
            resize();
        }
        data[size++]=num;
    }
    private  boolean isnull(){
        return size==data.length;
    }
    private void resize(){
        int []temp=new int[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public int remove(){
        int remove =data[--size];
        return remove;
    }
    public int get(int index){
        return data[index];
    }
    public void set(int index,int value){
        data[index]=value;

        }
        public String toString(){
            return "CustomArrayList{"+
                   "data=" + Arrays.toString(data) +
                   ", size=" + size+
                   '}';

        }  
      
      
    public static void main(String[] args) {
        customarraylist list=new customarraylist();
        list.add(5);
        list.add(3);
        System.out.println(list);
    }
    
}

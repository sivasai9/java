package oops;

import java.util.Arrays;

public class basic_opps {
    public static void main(String[] args) {
        student student1;   // declaring the object just a reference to the object it is just in stack memory
       
        student [] students=new student[5];
        System.out.println(Arrays.toString(students));
        student obj=new student();

        

        
    }

    public static class student {
        int rno;
        String name;
        float marks;
       

    }
    
}

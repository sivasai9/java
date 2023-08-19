package inheritance_java;

public class box {
    double l;
    double b;
    double w;

    box(){
         this.l=-1;
         this.b=-1;
         this.w=-1;
    }
    // cube
    box(double side){
        this.l=side;
        this.b=side;
        this.w=side;
    }
    box(double length,double breadth,double width){
        this.l=length;
        this.b=breadth;
        this.w=width;
    }
    box(box old){
        this.l=old.l;
        this.b=old.b;
        this.w=old.w;
    }

    
}

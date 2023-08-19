package inheritance_java;

public class boxweight  extends box{
    double weight;

    boxweight(){
        this.weight=-1;
    }
    public boxweight(double l,double b,double w,double weight){
        super(l,b,w);
        this.weight=weight;

    }
    
}


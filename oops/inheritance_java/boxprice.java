package inheritance_java;

public class boxprice extends boxweight{
    double cost;
    boxprice(){
        this.cost=-1;
    }
    public boxprice(double l,double b,double w,double weight,double cost){
        super(l,b,w,weight);
        this.cost=cost;
    }
      
}

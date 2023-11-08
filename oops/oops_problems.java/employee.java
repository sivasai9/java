public class employee{
   private String first_name;
    private String last_name;
    private double salary;
    private double money;
   public employee(String first_name,String last_name,double money){
     this.first_name=first_name;
     this.last_name=last_name;
     setmoney(money);
   }
   public void setFirstname(String first_name){
    this.first_name=first_name;
   }
   public String getFirstname(){
    return first_name;
   }
   public void setLastname(String last_name){
    this.last_name=last_name;
   }
   public String getLastname(){
    return last_name;
   }
   public void setmoney(double money){
    if(money>0){
      this.money=money;
    }
    else{
      money=0.0;
    }   
   }
   public double getmoney(){
    return money;
   }
   public double raise(double per){
    return money*=(1+per/100);
   }
  }

   



   
 

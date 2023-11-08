public class main {
    public static void main(String[] args) {
        employee e1=new employee("siva", "sankranthi",8000.0);
        e1.raise(10);
        System.out.println(e1.getFirstname());
        System.out.println(e1.getLastname());
        System.out.println(e1.getmoney());
    }
}

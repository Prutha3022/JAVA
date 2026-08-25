class car{
    String brand;
    void display(){
        System.out.println("This is display function "+brand);
    }
}
public class Test{
    public static void main(String[] args){
        System.out.println("Hi");
        car obj1 = new car();
        obj1.brand = "toyota!";
        obj1.display();
    }
}
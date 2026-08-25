class balance{
int amn;

    void withdraw(int a){
        if(a<amn || amn == a){
            amn = amn - a;
        }
        else if(amn<0){
            System.out.println("Enter valid amount.");
        }
    }

    void deposit(int a){
        if(a>0){
            amn = amn + a;
        }
    }

    void display(){
        System.out.println("The account balance is: "+amn);
    }
    }

public class banking{
    public static void main(String[] args){

        balance acc = new balance();
       
        acc.deposit(101010);
        acc.withdraw(123);
        acc.display();
    }
}
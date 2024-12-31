import java.util.Scanner;

public class datainput {
    
    public static void main(String[] args){

        //Creating a scanner object:

        Scanner sc = new Scanner(System.in);

        //Crearing a variable that will receive the user input

        String x;

        x = sc.next();

        sc.close();
        
        System.out.println("you typed:" + x);
    }
}

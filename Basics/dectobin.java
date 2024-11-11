import java.util.*;
public class dectobin {
    public static void decToBin(int n){
    int myNum =n;
    int pow =0;
    int binNum =0;
    while(n>0){
        int rem = n%2;
        binNum+= (rem*(int)Math.pow(10,pow));
        pow++;
        n/=2;

    }
    System.out.println("binary form of "+ myNum + " = "+ binNum);
    }

    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int n = jk.nextInt();
        decToBin(n);
    }
}

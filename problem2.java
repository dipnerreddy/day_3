import java.util.*;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int A,B;
        A=sc.nextInt();  // taking A as normal time to reach a destination 
        B=sc.nextInt();  // taking B as you would have reached the rest point

        int z=(B/2);    // as we are travelling in 2X speed to rest point
        System.out.println(A-z); // print the  total travel time.
    }
}
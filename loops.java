
import java .util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        while(n>0){
            k=k*10+n%10;
            n=n/10;

        }
        System.out.println("reversed number"+k);

        }
    }


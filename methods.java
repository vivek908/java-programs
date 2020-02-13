import java.util.*;
class methods{
    public static int square(int n){      
        return n*n;
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int result;
        result=square(n);
        System.out.println("result is "+result);
        int a=input.nextInt();
        int b=input.nextInt();
        result=sum(a,b);
        System.out.println("sum is "+result);
    }
      
}
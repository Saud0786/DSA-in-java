public class recursion {

    public static int powerOfX(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return powerOfX(x,n/2)*powerOfX(x,n/2);
        }
        else{
            return powerOfX(x,n/2)*powerOfX(x,n/2)*x;
        }
        // same same but different power calculation
//        int power = powerOfX(x,n-1);
//        int cal=x*power;
//        return cal;
    }
    // fibonacci series
//    public static void fibonacci(int a, int b, int n){
//        if(n==0){
//            return;
//        }
//        int c=a+b;
//        System.out.println(c);
//        fibonacci(b,c,n-1);
//
//    }
    // factorial finding
 //   public static int printNum(int i) {
//        if (i == 1  || i==0) {
//            return 1;
//        }
//       int fac= printNum( i - 1);
//        return i*fac;
//    }

    public static void main(String[] args) {

           //factorial
//        int ans=printNum(5);
//        System.out.println(ans);

        //fibonacci series
//        int n=7;
//        int a=0,b=1;
//        System.out.println(a);
//        System.out.println(b);
//        fibonacci(a,b,n-2);


        //power of x calculation
        int x=2,n=4;
        int ans=powerOfX(x,n);
        System.out.println(ans);
    }
}

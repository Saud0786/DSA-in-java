import java.util.Scanner;

public class Bit_manipulation {
    public static void main(String[] args) {
       // int a=4;

      //  System.out.println(a<<2);// pichhe shift hoga yani right shift 0100 ----> 10000=16
        //  System.out.println(a>>1);// agge shift hoga yani left shift    0100 ----> 0010=2


   //***     Get bit yani konse position pe ky h

//        int pos=1;
//        int bitMash= 1<<pos;
//        if((bitMask&a)==0){
//            System.out.println("bit was zero");
//        }else{
//            System.out.println("bit was one");
//        }



   // ***  set bit yani bit 0 ko 1 kr dena

//        int pos=1;
//        int bitMash=1<<pos;
//        int newNum=bitMash|a;
//        System.out.println(newNum);


        // *** clear bit yani 1 ko 0 kr dena

//        int pos=1;
//        int bitMash=1<<pos;
//        int notBitMash=~(bitMash);
//        int newNum=notBitMash&a;
//        System.out.println(newNum);



        //*** update bit yani 0 ko 1 and 1 ko 0 kr dega


//        Scanner sc=new Scanner(System.in);
//        int oper=sc.nextInt();
//        // oper=1 :set else oper=0 : clear
//        int pos=1;
//        int bitMash=1<<pos;
//        if(oper==0){
//            int newNum=bitMash|a;
//       System.out.println(newNum);
//        }else{
//            int notBitMash=~(bitMash);
//       int newNum=notBitMash&a;
//        System.out.println(newNum);
        int value=1,n=45,num;
        num=n>>1;
        num=num+value;
        System.out.println(num);
        }
    }


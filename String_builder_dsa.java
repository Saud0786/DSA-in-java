import java.util.*;
public class String_builder_dsa {
    public static void main(String[] args) {

        // All type of operation perform at string builder

        StringBuilder sb=new StringBuilder("beautiful");
        // new string set by string builder
      //  System.out.println(sb);

        // call at any index by chatAt
      //  System.out.println(sb.charAt(3));



        // char delete at any index
//        sb.delete(3,5);
//        System.out.println(sb);



        // char insert at any index
//        sb.insert(0,"t");
//        System.out.println(sb);

        // Add new string at end side
//        sb.append(" flower");
//        System.out.println(sb);

        // Print length of String
     //   System.out.println(sb.length());



        // Reverse string
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int end=sb.length()-1-i;

            char frontChar=sb.charAt(front);
            char backChar= sb.charAt(end);

            sb.setCharAt(front,backChar);
            sb.setCharAt(end,frontChar);

        }

        System.out.println(sb);
    }
}

import java.util.HashSet;

public class recursion2 {
    // time complexity =O(4^n)
    public static String[]keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCom(String str,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char current=str.charAt(idx);
        String mapping=keypad[current-'0'];
        for(int i=0;i<mapping.length();i++){
            printCom(str,idx+1,combination+mapping.charAt(i));
        }
    }

    // Unique subsequences print
    // *******************
//    public static void subsequencesUnique(String str, int idx, String newString, HashSet<String>set){
//        if(idx==str.length()){
//            if (set.contains(newString)){
//                return;
//            }else {
//                System.out.println(newString);
//                set.add(newString);
//                return;
//            }
//        }
//        char current=str.charAt(idx);
//        // to be
//        subsequencesUnique(str,idx+1,newString+current,set);
//        // not to be
//        subsequencesUnique(str,idx+1,newString,set);
//    }

           //**************
// time complexity=O(2^n)
//    public static void subsequences(String str,int idx,String newString){
//        if(idx==str.length()){
//            System.out.println(newString);
//            return;
//        }
//        char current=str.charAt(idx);
//        // to be
//        subsequences(str,idx+1,newString+current);
//        // not to be
//        subsequences(str,idx+1,newString);
//    }



    // time complexity = O(n)
    // Remove all duplicate element ************

//    public static boolean[]map=new boolean[26];
//
//    public static void removeDuplicate(String str,int idx,String newString){
//        if (idx==str.length()){
//            System.out.println(newString);
//            return;
//        }
//        char current=str.charAt(idx);
//        if(map[current-'a']){
//            removeDuplicate(str,idx+1,newString);
//        }
//        else{
//            newString+=current;
//            map[current-'a']=true;
//            removeDuplicate(str,idx+1,newString);
//        }
//    }
    // Move x end side      ********
    // time complexity = O(N)

//    public static void PrintNewString(String str,int idx,int count,String newString){
//        if(idx==str.length()){
//            for (int i=0;i<=count;i++){
//                newString=newString+"x";
//            }
//            System.out.println(newString);
//            return;
//        }
//        char current=str.charAt(idx);
//        if(current=='x'){
//            count++;
//            PrintNewString(str,idx+1,count,newString);
//        }
//        else{
//            newString=newString+current;
//            PrintNewString(str,idx+1,count,newString);
//        }
//
//
//    }
                  //************
// time complexity = O(n)
//    public static boolean checkArray(int a[],int idx){
//        if (idx==a.length-1){
//            return true;
//        }
//        if(a[idx]<a[idx+1]){
//           return checkArray(a,idx+1);
//        }
//else{
//
//        return false;
//    }
//    }

    // 1st & last occurance of an element in string ********************
   //time complexity = O(n)
//    public static int first=-1;
//    public static int last=-1;
//
//    public static void findOccurance(String str,int idx,char element){
//
//        if (idx==str.length()){
//            System.out.println(first);
//            System.out.println(last);
//            return;
//        }
//        char currentChar=str.charAt(idx);
//        if(currentChar==element){
//         if(first==-1){
//             first=idx;
//         }else{
//             last=idx;
//         }
//        }
//        findOccurance(str,idx+1,element);
//    }


    //**********

//  time complexity =O(2^n)
//        public static void moveDisks(int n, char Rod1, char Rod3, char Rod2) {
//            if (n == 1) {
//                System.out.println("Move disk from rod " + Rod1 + " to rod " + Rod3);
//                return;
//            }
//            moveDisks(n - 1, Rod1, Rod2, Rod3);
//            System.out.println("Move disk from rod " + Rod1 + " to rod " + Rod3);
//            moveDisks(n - 1, Rod2, Rod3, Rod1);
//}

    // String reverse      ************

    // time complexity =O(n)

//    public static void revStr(String str,int idx){
//        if(idx==0){
//            System.out.print(str.charAt(idx));
//            return;
//        }
//        System.out.print(str.charAt(idx));
//        revStr(str,idx-1);
//    }
  public static void main(String[] args) {

           //Question 1 Reverse string

            //String str="abcd";
          //revStr(str,str.length()-1);

    // Question 2 tower of hanoi problem

      //  int n=3;
      // moveDisks(n,'A','C','B');


      // Question 3
      // Find the 1st & last occurance of an element in string

//      String str="adaaadcafag";
//      findOccurance(str,0,'a');

      // Question 4
      // check if an array is sorted (Strictly Increasing) example=1,2,3,4,5 but not 1,2,3,5,5

//      int a[]={1,2,3,4,4,5};
//      System.out.println( checkArray(a,0));

      // Question 5
      // Move all 'X' to the end of the string
    // String str="axbxcdxx";
      //PrintNewString(str,0,0," ");

      // Question 6
      // Remove duplicate element
//      String str="abbccd";
//      removeDuplicate(str,0,"");


      // Question 7
      // Print all the subsequences

//         String str="abc";
//         subsequences(str,0,"");


      // Question 8
      //print Unique subsequences
//      String str="aaa";
//      HashSet<String>set=new HashSet<>();
//      subsequencesUnique(str,0,"",set);

    //  Question 9
      // Print keypad combination
//      String str="23";
//      printCom(str,0,"");
      }
}

import java.util.ArrayList;

public class advanceRecursion {
    // print permutation -1
    // time complexity =O(n!)
    //***********************************************************
//    public static void printPerm(String str,String permutation){
//        if (str.length()==0){
//            System.out.println(permutation);
//            return;
//        }
//        for(int i=0;i<str.length();i++){
//            char current=str.charAt(i);
//            String newstr=str.substring(0,i)+str.substring(i+1);
//            printPerm(newstr,permutation+current);
//        }


    // count total paths in a maze to move from (0,0) to (n,m)
    //time complexity = dynamic programming
    //********************************************************************
//    public static int countPath(int i,int j,int n,int m){
//        if(n==i || m==j){
//            return 0;
//        }
//        if(i==n-1 && j==m-1){
//            return 1;
//        }
////        move right
//        int right=countPath(i+1,j,n,m);
//        // move downWord
//        int down=countPath(i,j+1,n,m);
//        return right+down;
//***********************************************************
    //place tile of size 1xm in a floor of size n*m;
    // time complexity=dynamic programming
//    public static int tilePlacement(int  n,int m){
//        if(n==m){
//            return 2;
//        }
//        if(n<m){
//            return 1;
//        }
//        // horizontal placement
//        int horizontal=tilePlacement(n-m,m);
//        // vertical placement
//        int vertical=tilePlacement(n-1,m);
//        return vertical+horizontal;

    //Find the num of ways in which you invite N people to your party , single or in pair
    // *****************************************
    // TIme complexity=
//    public static int PairOfGuest(int n) {
//        if (n<=1){
//            return 1;}
//          // single
//       int way1= PairOfGuest(n-1);
//        //pair
//        int way2=(n-1)* PairOfGuest(n-2);
//        return way1+way2;

        public static  void printSubset(ArrayList<Integer>subset) {
            for (int i=0;i<subset.size();i++){
                System.out.print(subset.get(i)+" ");
            }
            System.out.println();
        }
    public static void findSubset(int n,ArrayList<Integer>subset){
            if(n==0){
                printSubset(subset);
            return;
            }
            // add hoga
           subset.add(n);
            findSubset(n-1,subset);

            // add nahi hoga
        subset.remove(subset.size()-1);
        findSubset(n-1,subset);

    }


    public static void main(String[] args) {
        // Question 1
//        String str="abc";
//        printPerm(str,"");

//        Question 2
//        int n=3,m=3;
//        int totalpath=countPath(0,0,n,m);
//        System.out.println( "total num of path is "+totalpath);

        // Question 3
//        int n=4,m=2;
//        System.out.println( "Total Num of tile placement is "+tilePlacement(n,m));

        // Question 4
//        int n=4;
//        System.out.println("Total num of posible guest pair "+PairOfGuest(n));

        // Question 5
        int n=3;
        ArrayList<Integer>subset=new ArrayList<>();
        findSubset(n,subset);
    }
}

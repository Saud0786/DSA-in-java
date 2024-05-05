public class Sorting {

    public static void main(String[] args) {
        int a[]={43,42,67,98,22,34};

        // bubble sorting
        // time complexity = O(n^2)

//        for (int i=0;i< a.length-1;i++){
//            for (int j=0;j< a.length-i-1;j++){
//                if(a[j]>a[j+1]){
//                  int  temp=a[j];
//                    a[j]=a[j+1];
//                    a[j+1]=temp;
//                }
//            }
//        }
//        for (int i=0;i< a.length;i++){
//            System.out.print(a[i]+" ");
//        }




        // Selection sort
//       time complexity= O(n^2)
//        int temp=0;
//        for(int i=0;i< a.length;i++){
//            for(int j=i+1;j< a.length;j++){
//                if(a[i]>a[j]){
//                    temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//                }
//            }
//        }
//        System.out.print("Array sorted in ascending order : ");
//        for(int i=0;i< a.length;i++)
//        System.out.print(a[i]+" ");




        // insertion sort
        // time complexity= O(n^2)
        for (int i=0;i< a.length;i++){
           int current=a[i];
           int j=i-1;
           while(j>=0 && current<a[j]){
               a[j+1]=a[j];
               j--;
           }
           a[j+1]=current;
        }
        for (int i=0;i< a.length;i++)
        System.out.print(a[i]+" ");
    }
}

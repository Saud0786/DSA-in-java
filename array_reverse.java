import java.util.Arrays;

public class array_reverse {
    public static void main(String[] args) {
        int a[]={2,4,-6,7,-9,-4,10,-54};

        // Reverse the array element

        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }






        // find max num of element in the array
//        int max=0;
//        for(int ele:a){
//            if(ele>max){
//                max=ele;
//            }
//        }
//        System.out.println(max);






        // count even and odd num in the array
//        int even=0;
//        int odd=0;
//        for(int i=0;i<a.length;i++){
//            if(a[i]%2==0){
//                even++;
//            }
//            else{
//                odd++;
//            }
//        }
//
//        System.out.println("Even element in the array "+even);
//        System.out.println("Odd element in the array "+odd);




        // Sort array in the ascending order

//



        //Sort in descending order

//        int temp=0;
//        for(int i=0;i<5;i++){
//            for(int j=i+1;j<5;j++){
//                if(a[i]<a[j]){
//                    temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//                }
//            }
//        }
//        System.out.print("Array sorted in descending order : ");
//        for(int i=0;i<5;i++)
//            System.out.print(a[i]+" ");



        // Array shift left position

//        int n=2;
//        for(int i=0;i<n;i++){
//            int first=a[0],j;
//            for( j=0;j<a.length-1;j++){
//                a[j]=a[j+1];
//            }
//            a[j]=first;
//        }
//        for(int i=0;i<a.length; i++){
//            System.out.print(a[i]+" ");
//        }



        // all negative element move to the end side



//        int temp=0;
//        for(int i=0;i<a.length;i++){
//            for(int j=i+1;j<a.length;j++){
//                if(a[i]<0){
//                    temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//                }
//            }
//        }
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]+" ");
//        }




        // 3*3 matrix and sum the diagonal num of array



//        int[][] arr={{4,5,7},{4,7,2},{8,9,6}};
//        for(int i=0;i<arr.length;i++){
//            for(int j = 0; j<arr[i].length; j++){
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println();
//
//        }
//        System.out.println("Sum of diagonal element in the array");
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            sum=sum+arr[i][i];
//        }
//        System.out.println(sum);


        // Find the missing element in the array


//        int a[]={1,6,8,9,4,5,3,7};
//        int n=a.length+1;
//        int sum=(n*(n+1))/2;
//        for(int ele:a){
//            sum=sum-ele;
//        }
//        System.out.print("Missing element is :");
//        System.out.print(sum);
    }
}

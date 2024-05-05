public class mergeSort {
    public static void conquer(int arr[],int start,int mid,int end){
        int merge[]=new int[end-start+1];
        int idx1=start;
        int idx2=mid+1;
        int x=0;
        while (idx1<=mid && idx2<=end){
            if(arr[idx1]<=arr[idx2]){
                merge[x++]=arr[idx1++];
            }
            else{
                merge[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){                           // if first sorted part  me element bach jaye tb
            merge[x++]=arr[idx1++];

        }
        while (idx2<=end){                         // if second sorted part  me element bach jaye tb
            merge[x++]=arr[idx2++];
        }
        for (int i=0,j=start;i<merge.length;i++,j++){
            arr[j]=merge[i];
        }

    }
    public static void divide(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2; // mid element
        divide(arr,start,mid);
        divide(arr,mid+1,end); // divide all element in small part
        conquer(arr,start,mid,end); // call conquer
    }
    public static void main(String[] args) {
        int arr[]={3,5,9,4,6,8};
        int n=arr.length;
        divide(arr,0,n-1);
        //print sorted arrays
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            //time com=O(n log n);
        }
    }
}


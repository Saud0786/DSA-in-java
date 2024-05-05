public class QuickSort {
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;

        for (int j=0;j<high;j++){
            if(arr[j]<pivot){
                i++;
                // swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp= arr[i];
        arr[high]=temp;
        return i;
    }
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pidx=partition(arr,low,high);      // pivot element ko sahi space me fix krega

            quickSort(arr,low,pidx-1);
            quickSort(arr,pidx+1,high);
        }
    }
    public static void main(String[] args) {
        int arr[]={23,45,43,55,68,87};
        int n=arr.length;
        quickSort(arr,0,n-1);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");



            // time com
            // worst case=O(n*2)
            // best case=(n log n)
        }
    }
}

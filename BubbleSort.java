public class BubbleSort{
    static void Swap(int arr[],int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
   static void bubbleSort(int arr[]){
        //this loop is for Rounds (total Rounds=array length-1 round becoz single element is already sorted)
        for(int i=1;i<arr.length;i++){
        //this loop is for each element to positioned on its actual place
        for(int j=0;j<arr.length-i;j++){
            if(arr[j]>arr[j+1]){
                Swap(arr,j,j+1);
                }
            }
        }
    }
    static void Print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={3,2,5,1,87,23,5,10};
        System.out.print("Original Array=");
        Print(arr);
        bubbleSort(arr);
        System.out.print("\nSorted Array  =");
        Print(arr);
    }
}

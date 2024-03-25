public class DeletionOfArrayIndex {
    //Basic Approach by using second array
    public static int[] removeElement(int arr[],int index){
        int[] copyArray = new int[arr.length-1];
        //check the original array is empty or not
        if(index<0||arr==null||index>=arr.length)
            return arr;
        for(int i=0,k=0;i<arr.length;i++){
            if(index==arr[i])
                continue;
            else
            copyArray[k++] = arr[i];
        }
        return copyArray;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Array Before: ");
        for (int element:arr){
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println("Array After: ");
      for (int element:removeElement(arr,2)){
          System.out.print(element+" ");
      }
    }
}

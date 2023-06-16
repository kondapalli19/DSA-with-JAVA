public class Arrayy {
    public static int[] insertFirst(int[] arr,int val){
        int n=arr.length+1;
        int[] newArr = new int[n];
        newArr[0]=val;
        for (int i = 1; i < newArr.length; i++) {
            newArr[i]=arr[i-1];
        }
        return newArr;
    }
    public static int[] insertLast(int[] arr,int val){
        int n=arr.length+1;
        int[] newArr = new int[n];
        newArr[n-1]=val;
        for (int i = 0; i < newArr.length-1; i++) {
            newArr[i]=arr[i];
        }
        return newArr;
    }
    public static int[] insertPos(int[] arr, int val, int index){
        int n=arr.length+1;
        int[] newArr = new int[n];
        for (int i = n-1; i > index; i--) {
            newArr[i]=arr[i-1];
        }
        newArr[index]=val;
        for(int i=index-1; i >= 0; i--){
            newArr[i]=arr[i];
        }
        return newArr;
    }

    public static int[] deleteFirst(int[] arr){
        int n=arr.length-1;
        int[] newArr = new int[n];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i]=arr[i+1];
        }
        return newArr;
    }

    public static int[] deleteLast(int[] arr){
        int n=arr.length-1;
        int[] newArr = new int[n];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i]=arr[i];
        }
        return newArr;
    }

    public static int[] deletePos(int[] arr, int index){
        int n=arr.length-1;
        int[] newArr = new int[n];
        for (int i = 0; i < index; i++) {
            newArr[i]=arr[i];
        }
        for(int i=index+1; i < arr.length; i++){
            newArr[i-1]=arr[i];
        }
        return newArr;
    }


    public static void display(int[] newArr){
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={2, 7, 8, 0, 8};

        // int[] newArr = new int[arr.length+1];

        int[] newArrr = new int[arr.length-1];

        // newArr=insertFirst(arr, 20);
        // newArr=insertLast(arr, 20);
        // newArr=insertPos(arr, 20, 2);

        // newArrr = deleteFirst(arr);
        // newArrr = deleteLast(arr);
        newArrr = deletePos(arr, 2);
        display(newArrr);
    }
    
}

public class smallestLetterGreatTarget {
    public static void main(String[] args) {
        char[] arr={'c','d','f','g'};
        char ch='j';
        char ans=bsearch(arr,ch);
        System.out.println(ans);
    }
    static char bsearch(char[] arr, char ch){
     
            int start=0;
            int end=arr.length-1;
            
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[mid]>ch){
                    end=mid-1;
                }
                else if(arr[mid]<ch){
                    start=mid+1;
                }
                else if(arr[mid]==ch){
                    return arr[mid];
                }
                }
                return arr[start%arr.length];      // This is important as letters are wrapped around

            }
        }
    


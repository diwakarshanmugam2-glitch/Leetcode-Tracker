// Last updated: 7/14/2026, 2:02:20 PM
class Solution {
    public void sortColors(int[] arr) {
        // code here
        int n= arr. length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
  public static void main(String[] args) {
        int[] arr={1,2,3,4,4};
        int target=4;
        int[] ans={-1,-1};
        ans[0]=binaryLeft(arr,target);
        ans[1]=binaryRight(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    //[1,2,3,4,4,4,5,9] 3,5  mid=4
    static int binaryLeft(int[] arr,int key){
        int left=-1;
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==key && (mid-start)>=0 ){
                left=mid;
                end=mid-1;
            }
            if(arr[mid]>key){
                end=mid-1;
            }
            if (arr[mid]<key){
                start=mid+1;
            }
        }
        return left;

    }
    static int binaryRight(int[] arr,int key){
        int right=-1;
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==key && (end-mid)>=0 ){
                right=mid;
                start=mid+1;
            }
            if(arr[mid]>key){
                end=mid-1;
            }
            if (arr[mid]<key){
                start=mid+1;
            }
        }
        return right;
    }

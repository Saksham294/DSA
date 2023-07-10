   static int ceiling(int[] arr,int key){
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        while (start<=end){
            if (arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                start=mid+1;
            }
            if (arr[mid]<key){
                mid=end-1;
            }
        }
        return start;

    }
    static int floor(int[] arr,int key){
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        while (start<=end){
            if (arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                start=mid+1;
            }
            if (arr[mid]<key){
                mid=end-1;
            }
        }
        return end;
    }

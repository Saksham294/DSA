  public static void main(String[] args) {
        int[] point={1,0,1,1,1};
        int x=pivot(point);
        int find=binary(point,0,0,x);
        int find2=binary(point,0,x+1,point.length-1);
        if(find!=-1 || find2!=-1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    static int binary(int[] arr,int key,int start,int end){

        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                end=mid-1;
            }
            if (arr[mid]<key){
                start=mid+1;
            }
        }
        return -1;

    }
    static int pivot(int[] arr){
        int l=arr.length;
        int piv=0;
        for (int i = 0; i <l-1 ; i++) {
            if (arr[i]>arr[i+1]){
                piv=i;
            }
        }
        return piv;
    }

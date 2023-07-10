 static void cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(correctIndex>0&& arr[correctIndex]!=arr[i]){
                //Then we swap the numbers till we don't get the number at the correct index
                int temp=arr[correctIndex];
                arr[correctIndex]=arr[i];
                arr[i]=temp;
            }
            else {
                i++;
            }
        }
    }

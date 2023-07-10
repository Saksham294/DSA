 static int[] binarySearch2D(int[][] arr,int key){
        int[] ans={-1,-1};
        int rows=arr.length-1;
        int columns=arr[0].length-1;
        int startRow=0;

        while (startRow<=rows && columns>=0){
            int startColumn=arr[startRow][columns];
            if(key<startColumn){
                columns--;
            }
            if(key>startColumn){
                startRow++;
            }
            if(key==startColumn){
                ans[0]=startRow;
                ans[1]=columns;
                return ans;
            }
        }
        return ans;

    }

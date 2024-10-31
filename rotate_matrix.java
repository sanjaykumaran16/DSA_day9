class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        for(int i=0;i<n;i++){
            rev_rows(matrix[i],n);
        }
    }
    public void rev_rows(int[] arr,int size){
        int p1=0;
        int p2=size-1;
        while(p1<p2){
            int t2=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=t2;
            p1++;
            p2--;
        }
    }    
}

package Java.TWO_D_BS;

import java.util.Arrays;

public class TWO_DSearch {
    static int[] Search(int[][] mat,int target){
        int row =0;
        int col = mat.length-1;


        while(row < mat.length && col >=0 ){
            if (mat[row][col]==target){
                return new int[]{row,col};
            }
            if(mat[row][col] < target) {
                row++;
            }else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15 ,16}
        };
        System.out.println(Arrays.toString(Search(mat, 16)));
    }
}

package arrays;

/**
 * 5491. 矩阵对角线元素的和
 * @autor zyj
 * @date 2020/9/5 22:44
 */
public class DiagonalSum {
    public static void main(String[] args) {
        int [][] a = {{1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}};
        System.out.println(diagonalSum(a));

    }

    public static  int diagonalSum(int[][] mat) {
        int sum = 0;
        int j = 0;
        int p = mat[0].length - 1;
        for(int i = 0; i < mat[0].length;i++){
            if(j != p){
                sum += mat[i][j];
                sum += mat[i][p];
                j++;
                p--;
            }else{
                sum += mat[i][j];
                j++;
                p--;
            }
        }
        return sum;
    }
}

package Assignment;

import java.util.*;

public class Source {

    public static void printElementInAllRows(int mat[][]) {
        int M = mat.length;
        int N = mat[0].length;
        Map<Integer,Integer> mp = new HashMap<>();
        ArrayList<Integer> solution = new ArrayList<>();
        for (int j = 0; j < N; j++)
            mp.put(mat[0][j],1);
        for (int i = 1; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (mp.get(mat[i][j]) != null && mp.get(mat[i][j]) == i)
                {
                    mp.put(mat[i][j], i + 1);
                    if (i == M - 1)
                        solution.add(mat[i][j]);
//                        System.out.print(mat[i][j] + " ");
                }
            }
        }
        int i,j;
        if(solution.get(0) < solution.get(1)){
            i=solution.get(0);
            j=solution.get(1);
        }
        else{
            i=solution.get(1);
            j=solution.get(0);
        }
        System.out.println(i + " " + j);
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        printElementInAllRows(matrix);
    }
}
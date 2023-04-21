import java.util.Scanner;


public class PL06_14 {

    // função de soma de duas matrizes com o mesmo tamanho
    public static int[][] sumMat(int[][] mat1, int[][] mat2, int size){
        int[][] result = new int[size][size];
        for (int line = 0; line < size; line++) {
            for (int col = 0; col < size; col++) {
                result[line][col] = mat1[line][col] + mat2[line][col];
            }
        }
        return result;
    }

    // função de somatório dos elementos de uma matriz
    public static int sumItensMat(int[][] mat, int size){
        int sum = 0;
        for (int line = 0; line < size; line++) {
            for (int col = 0; col < size; col++) {
                sum += mat[line][col];
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = input.nextInt();

        int[][] mat1 = new int[size][size];
        int[][] mat2 = new int[size][size];

        // Fill mat1
        System.out.println("Enter the elements of the first array: ");
        for (int line = 0; line < size; line++) {
            for (int col = 0; col < size; col++) {
                mat1[line][col] = input.nextInt();
            }
        }

        // Fill mat2
        System.out.println("Enter the elements of the first array: ");
        for (int line = 0; line < size; line++) {
            for (int col = 0; col < size; col++) {
                mat2[line][col] = input.nextInt();
            }
        }

        int[][] sumMat = sumMat(mat1, mat2, size);
        System.out.println("Matrix resulting from the sum of two arrays:");
        for (int line = 0; line < size; line++) {
            for (int col = 0; col < size; col++) {
                System.out.print(sumMat);


    }
    }
}
}
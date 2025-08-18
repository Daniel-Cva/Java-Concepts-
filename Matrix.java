import java.util.Scanner;
public class Matrix {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows= scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter Matrix Elements:");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                System.out.println("Element [" + i + "][" + j + "]: ");
                matrix[i][j]= scanner.nextInt();
            }
        }
        System.out.println("Matrix Rows: "+ rows);
        System.out.println("Matrix Columns: "+ cols);
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

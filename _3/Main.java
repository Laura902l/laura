public class Main {
    public static void main(String[] args) {
        double[][] array = {{4.0, 2.0}, {4.0, 5.0}};
        int rows = 2;
        int columns = 2;

        Matrix matrix = new Matrix(array, rows, columns);
        Matrix matrix2 = new Matrix(new double[][] {{5.0, 2.0}, {7.0, 4.0}}, 2, 2);
        Matrix result = matrix.addition(matrix2);
        System.out.println("Matrix 1:");
        System.out.println(matrix);
        System.out.println("Matrix 2:");
        System.out.println(matrix2);
        System.out.println("Result of addition:");
        System.out.println(result);
        System.out.println("Matrix 1:");
        matrix.print();
        System.out.println("Matrix 1:");
        matrix2.print();
        System.out.println("Result of multiplication by a number:");
        System.out.println(matrix.multiplication(2.0));


    }
}
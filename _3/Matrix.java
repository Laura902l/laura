public class Matrix {
    private double[][] array;
    private int rows;
    private int columns;

    public Matrix(double[][] array, int rows, int columns) {
        this.array = array;
        this.rows = rows;
        this.columns = columns;
    }

    public double[][] getArray() {
        return array;
    }

    public void setArray(double[][] array) {
        this.array = array;

    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;

    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
    public Matrix addition(Matrix other) {

        if (this.rows != other.rows || this.columns != other.columns) {
            throw new IllegalArgumentException("Illegal");
        }

        Matrix result = new Matrix(new double[this.rows][this.columns], this.rows, this.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                result.array[i][j] = this.array[i][j] + other.array[i][j];
            }
        }
        System.out.println(result);
        return result;
    }
    public Matrix multiplication(double number) {
        Matrix ans = new Matrix(new double[this.rows][this.columns], this.rows, this.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                ans.array[i][j] = this.array[i][j] * number;
            }
        }
        return ans;
    }
    public void print() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.print(this.array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < this.rows; i++) {
            str.append("[ ");
            for (int j = 0; j < this.columns; j++) {
                str.append(this.array[i][j]);
                str.append(" ");
            }
            str.append("]");
        }
        return str.toString();
    }


}



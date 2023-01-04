public class Main {
    public static void main(String[] args) {
        outputOfNumbers(7, 4);

    }

    public static void outputOfNumbers(int A, int B) {
        if (A == B) {
            System.out.print(A+" ");
        } else if (A < B) {
            System.out.print(A+" ");
            outputOfNumbers(A+1, B);
        } else {
            System.out.print(A+" ");
            outputOfNumbers(A-1, B);
        }
    }
}

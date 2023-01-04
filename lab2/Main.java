import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
  C = A + B
 ��� �������� long
  ���� ��������� �������� ������� ����� �������
 */

public class Main {
    static boolean checkIsNextWrong(Scanner in) {
        if (!in.hasNextInt()) {
            System.out.println("Incorrect file data");
            return true;
        }
        return false;
    }

    static void enterArray(Scanner in, int n, int m, long[][] a) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                a[i][j] = in.nextLong();
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static long[][] sumArrays(long[][] a, long[][] b, int n, int m){
        long[][] c = new long[n][m];
        for(int i = 0; i < a.length; ++i){
            for(int j = 0; j < a[i].length; ++j){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        return c;
    }

    static long findRowMax(long[][] a, int m, int index){
        long max = a[index][0];
        for(int j = 1; j < m; ++j)
            max = Math.max(max, a[index][j]);
        return max;
    }

    public static void main(String[] args) {
        try {
            File inputFile = new File("input.txt");
            Scanner in = new Scanner(inputFile);
            if (checkIsNextWrong(in))
                return;
            int n = in.nextInt();
            if (checkIsNextWrong(in))
                return;
            int m = in.nextInt();
            System.out.println("������� �: ");
            long[][] a = new long[n][m];
            enterArray(in, n, m, a);
            System.out.println("������� B: ");
            long[][] b = new long[n][m];
            enterArray(in, n, m, b);
            System.out.println("������� A + B");
            long[][] c = sumArrays(a, b, n, m);
            long sum = 0;
            for(int i = 0; i < n; ++i){
                sum += findRowMax(c, m, i);
            }
            System.out.println("���� ��������� �������� � ������ - " + sum);
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("���� �� ��������");
            e.printStackTrace();
        }
    }
}
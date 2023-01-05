/*
��������� ���� ����, ���� ���������� �� ����� � 5-� ����.
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static boolean checkIsNextInt(Scanner scanner) {
        if (!scanner.hasNextInt()) {
            System.out.println("Value can not be calculated. Incorrect input found");
            return false;
        }
        return true;
    }

    static void printArray(Plane[] planes, int peopleCount) {
        for (int i = 0; i < planes.length; ++i) {
            if (planes[i].checkEnoughPlace(peopleCount)) {
                System.out.println("��������� ���� ��� ���������");
            } else {
                System.out.println("�����! ��� ��������� �� ��������� ����");
            }
            System.out.println("����� �������� - " + (i + 1));
            System.out.println(planes[i] + "\n");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������ ������� ����� �� ����: ");
        if (!checkIsNextInt(scanner)) {
            return;
        }
        int countPeople = scanner.nextInt();
        Plane[] planes = new Plane[]{
                new Plane("������ ����", 1000, 130, 100, true),
                new Plane("������� ����", 750, 200, 20, true),
                new Plane("������� ����", 800, 70, 50, false)
        };
        System.out.println("�� ����������: ");
        printArray(planes, countPeople);
        Arrays.sort(planes, Comparator.comparing(Plane::getSpeed));
        System.out.println("����������� �� ��������");
        printArray(planes, countPeople);
        Arrays.sort(planes, Comparator.comparing(Plane::getMaxCountOfPeople).reversed());
        System.out.println("����������� �� ��������� ����������� ������� ��������");
        printArray(planes, countPeople);
    }
}
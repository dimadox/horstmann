package chapter7_input_output_and_exception_handling.test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        // primitive types (value types)
        int i;
        i = 0;          // i - ����� ��� �������� 1 int-�

        // reference types (���������)
        Scanner scanner;    // scanner - ������ (reference), �������� ������� ���� ���
        scanner = new Scanner(System.in);   // constructor ���������� ��� ��, ��� �����
            // scanner �������� ��������� (references) �� ��������� ������

        Scanner otherReference;
        otherReference = scanner;
            // �������� ������ ������ (otherReference) �� ��� �� ������

        scanner = null;     // null - ������ (reference / ��������� ����������) �� �� ��� �� ���������


        // assignment statement =
        // semantics

        int x = 10; // x = 10
        int y = x;  // y = 10   // !!! �������� x ���� ��������� � y
        x = 5;      // x = 5

        // y = 10

        int z;  //z
        int u; // y

        //��� ��� Scanner
        Scanner scanner1 = new Scanner(System.in); // ���� �� Scanner
        Scanner scanner2 = new Scanner(System.in);// ���� �� Scanner
        Scanner scanner3; // no instance is created

        //y = f(x);

         int j = 1;


    }
}

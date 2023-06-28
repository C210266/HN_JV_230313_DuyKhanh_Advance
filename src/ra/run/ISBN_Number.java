package ra.run;

import ra.config.InputMethods;

import java.util.Stack;

public class ISBN_Number {
    public static void main(String[] args) {
        System.out.println("Nhap vao so ISBN");
        String isbnString = InputMethods.getISBN();
        long isbnNumber = Long.parseLong(isbnString);
        Stack<Integer> number = new Stack<>();
        while (isbnNumber > 0) {
            number.push((int) (isbnNumber % 10));
            isbnNumber /= 10;
        }

        if (checkISBN(number)) {
            System.out.println("Chuoi ISBN hop le");
        } else {
            System.out.println("Chuoi ISBN khong hop le");
        }

    }

    public static boolean checkISBN(Stack<Integer> number) {
        if (number.size() != 10) {
            return false;
        }
        int sum = 0;
        int n = 10;
        while (!number.isEmpty()) {
            int digit = number.pop();
            sum += digit * n;
            n--;
        }
        return sum % 11 == 0;
    }


}

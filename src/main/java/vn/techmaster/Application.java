package vn.techmaster;

import vn.techmaster.model.MortgagePaymentCalculation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;

        System.out.println("Nhập vào số tiền gốc vay (VND):");
        float principal = 0;
        do {
            try {
                principal = scanner.nextFloat();
                if (principal <= 0) {
                    System.out.println("Số tiền gốc phải là số dương, mời nhập lại: ");
                } else {
                    valid = true;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Số tiền gốc phải là số thực, mời nhập lại");
                valid = false;
            }
            scanner.nextLine();
        } while (!valid);

        System.out.println("Nhập vào lãi xuất theo năm (%):");
        float rateByYear = 0;
        do {
            try {
                rateByYear = scanner.nextFloat()/100;
                if (rateByYear <= 0) {
                    System.out.println("Lãi xuất phải là số dương, mời nhập lại: ");
                } else {
                    valid = true;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Lãi xuất phải là số thực, mời nhập lại");
                valid = false;
            }
            scanner.nextLine();
        } while (!valid);

        System.out.println("Nhập vào số kỳ hạn theo năm");
        int period = 0;
        do {
            try {
                period = scanner.nextInt();
                if (period <= 0) {
                    System.out.println("kỳ hạn phải là số dương, mời nhập lại: ");
                } else {
                    valid = true;
                }
            } catch (InputMismatchException ex) {
                System.out.println("số kỳ hạn phải là số nguyên, mời nhập lại");
                valid = false;
            }
            scanner.nextLine();
        } while (!valid);

        MortgagePaymentCalculation mortgagePaymentCalculation = new MortgagePaymentCalculation(principal, rateByYear, period);
        System.out.println("Số tiền hàng tháng phải nộp: " + mortgagePaymentCalculation.calculations());
    }
}

package com.harman.project1;
import java.math.BigInteger;
import java.util.Scanner;

    public class EmployeeDetails {
        void details(){}
        @Deprecated
        void test(){
            System.out.println("Testing...");
        }
    }
    class Details extends EmployeeDetails {
        @Override
        void details() {
            super.details();
            Scanner in = new Scanner(System.in);
            String name, address, email;
            System.out.println("Enter the Name :");
            name = in.nextLine();
            System.out.println("Enter the Address :");
            address = in.nextLine();
            System.out.println("Enter the email :");
            email = in.nextLine();
            int age;
            BigInteger phone;
            System.out.println("Enter the Age :");
            age = in.nextInt();
            System.out.println("Enter the Phone :");
            phone = in.nextBigInteger();
            System.out.println("The Name is :" + name);
            System.out.println("The Age is :" + age);
            System.out.println("The Address is :" + address);
            System.out.println("The email is :" + email);
            System.out.println("The Phone is :" + phone);
        }
        public @interface Myannotation{ //creating our own annotation
        }
        @Myannotation()
        public static void main(String[] args) {
            Details obj = new Details();
            obj.test();
            obj.details();
        }
    }


package ru.mirea.lab16.ex4;


import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch(Exception e) {
            System.out.println("Exception happened!");
        }
//        catch (NumberFormatException e){             // Compile error: NumberFormatException already catched
//            System.out.println("Not correct number");
//        }
        finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        Exception4 e2 = new Exception4();
        e2.exceptionDemo();
    }
}

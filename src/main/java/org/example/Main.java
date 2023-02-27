package org.example;

import javax.swing.text.Style;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
////        int value1  =9 / 2 ;
////        int value2  = 0x0011 ;
////        long max = 2112122121212121212L;
////        int unsign1 = -22222222;
//        double d = 9.001d / 3;
//        float f = 9f / 3;
////        System.out.println("value 1 = " + value1);
////        System.out.println(value2);
////        System.out.println(max);
////        System.out.println(unsign1);
//        System.out.println(d);
//        System.out.println(f);
////    int market = 512 ;
////    double percentage = market * 0.46 ;
////    System.out.println("percentage:"  + percentage);
//
//
////        boolean var = true;
////        System.out.println(var);
////        char var2 = '\u0007';
////        System  .out.println(var2);
//    double x = 1.05;
//        BigDecimal bigDecimal = new BigDecimal("1.05"); // 1.05
//        BigDecimal bigDecimal2 = new BigDecimal("2.55"); // 2.55
//    double y = 2.55;
////         1.05 + 2.55 = 3.60
//        System.out.println(x + y);
//    System.out.println(bigDecimal2.add(bigDecimal));


//
//        String var = "Hello world \u00BB";
//        String info = "Please enter your name : ";
//        System.out.println(var);
//        System.out.println( var + info);
//    int y = 10 ;
//    long z = y ;
//    short x = (short)y ;
//    System.out.println(y);
//    System.out.println(z);
//    System.out.println(x);
//
//        double v2 = 20.0123456789d;
//        float v1 = (float)v2;
//        System.out.println(v1);

//
//        int a ;
//        float b ;
//        // (a+b)^2 = a^2 + 2ab + b^2
//        a = 25 ;
//        b = 42.159f ;
//        int  result = (int)Math.pow(a+b,2);
//        System.out.println("Value of result is : " + result);
//
//        int mod = 12 % 2 ;
//        int x = 10 ;
//        System.out.println(mod);
//        System.out.println(++x); // 10
//        System.out.println(x); // 11

//
//        int x = 5 ;
//        if (x == 5 ) {
//
//            System.out.println("Va lue of x is 5 ");}
//        else { System.out.println("Error");}
//
//


//        int x =6 , y =5 ;
//        if(x >= y ) { System.out.println("True");}
//        else { System.out.println("False");}


//        boolean x = true , y = false ;
//        if(x && y ) { System.out.println("True");}
//        else { System.out.println("False");}
//
//        if (x || y ) { System.out.println("True");}
//        else { System.out.println("False");}


//        int x = 5 , y = 10 ;
//        if ((x  < y ) && (x == y)) { System.out.println("True");}
//        else { System.out.println("False");}

//
//        if (!false ) { System.out.println("True");}
//        else { System.out.println("False");}


        // excercise
//        int ageOFBoy = 21 ;
//        int ageOfGirl = 20 ;
//
//        if ((ageOfGirl >= 18) && (ageOFBoy >= 20)) {
//            System.out.println("Both are adults");
//        }
//        else if ((ageOfGirl >= 18) || (ageOFBoy >= 20)) {
//            System.out.println("One of them is adult");
//        }
//        else {
//            System.out.println("Both are not adults");
//        }


//        Ternary Operator
//            boolean x ;
//             x = (5 >4) ? true:false;
//            System.out.println(x);
////
//
//            int y ;
//            y = (5 > 4) ? 1:0;
//            System.out.println(y);
//            int a = 5 ;
//            a += 5 ; // a = a + 5 ;
//            System.out.println(a);
//            a -= 5 ; // a = a - 5 ;
//            System.out.println(a);
//            a*=5 ; // a = a * 5 ;
//            System.out.println(a);
//            a/=5 ; // a = a / 5 ;
//            System.out.println(a);
//            a%=5 ; // a = a % 5 ;
//            System.out.println(a);

// Excercise
//
//
        String password = generateRandomString();
        // Create an object of Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Your password is: " + password);
        // Prompt the user to enter a number
        System.out.print("Enter the code: ");
        // take input string form user
        String number = input.next();
        // check if the number is equal to the password 6 times

        for (int i = 0; i < 6; i++) {
            if (number.equals(password)) {
                System.out.println("Welcome, please enter your ID");
                String id = input.next();
                printID(id);
                break;
            } else {
                System.out.println("Wrong code, please try again");
                number = input.next();
                // if the user enter the wrong code 6 times , generate new password and start again
                if (i == 5) {
                    password = generateRandomString();
                    System.out.println("Your password is: " + password);
                    System.out.print("Enter the code: ");
                    number = input.next();
                    i = 0;
                }
            }
        }


    }

    // check if the password is correct or not 6 times
    public static void checkPassword(String password, String number) {
        Scanner idInput = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            if (number.equals(password)) {
                System.out.println("Welcome, please enter your ID:");
                String id = idInput.next();
                printID(id);

            } else {
                System.out.println("Wrong code, please try again");
                number = idInput.next();
            }
        }

    }


//         generate a random string
    public static String generateRandomString() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String randomString = "";
        int length = 6;
        Random random = new Random();
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(random.nextInt(characters.length()));
        }
        for (int i = 0; i < text.length; i++) {
            randomString += text[i];
        }
        return randomString;
    }

    public static void printID(String id) {

        Map<String, String> idDict = new HashMap<>();

        // Add province code and name to the dictionary
        idDict.put("01", "Hà Nội");
        idDict.put("02", "Hà Giang");
        idDict.put("03", "Cao Bằng");
        idDict.put("04", "Lạng Sơn");
        idDict.put("05", "Quảng Ninh");
        idDict.put("06", "Bắc Giang");
        idDict.put("07", "Bắc Kạn");
        idDict.put("08", "Tuyên Quang");
        idDict.put("09", "Lào Cai");
        idDict.put("10", "Yên Bái");
        idDict.put("11", "Thái Nguyên");
        idDict.put("12", "Lạng Sơn");
        idDict.put("13", "Bắc Ninh");
        idDict.put("14", "Hải Dương");
        idDict.put("15", "Hải Phòng");
        idDict.put("16", "Hưng Yên");
        idDict.put("17", "Thái Bình");
        idDict.put("18", "Hà Nam");
        idDict.put("19", "Nam Định");
        idDict.put("20", "Ninh Bình");
        idDict.put("21", "Thanh Hóa");
        idDict.put("22", "Nghệ An");
        idDict.put("23", "Hà Tĩnh");
        idDict.put("24", "Quảng Bình");
        idDict.put("25", "Quảng Trị");
        idDict.put("26", "Thừa Thiên Huế");
        idDict.put("27", "Đà Nẵng");
        idDict.put("28", "Quảng Nam");
        idDict.put("29", "Quảng Ngãi");
        idDict.put("30", "Bình Định");
        idDict.put("31", "Phú Yên");
        idDict.put("32", "Khánh Hòa");
        idDict.put("33", "Ninh Thuận");
        idDict.put("34", "Bình Thuận");
        idDict.put("35", "Kon Tum");
        idDict.put("36", "Gia Lai");
        idDict.put("37", "Đắk Lắk");
        idDict.put("38", "Đắk Nông");
        idDict.put("39", "Lâm Đồng");
        idDict.put("40", "Bình Phước");
        idDict.put("41", "Tây Ninh");
        idDict.put("42", "Bình Dương");
        idDict.put("43", "Đồng Nai");
        idDict.put("44", "Bà Rịa - Vũng Tàu");
        idDict.put("45", "TP Hồ Chí Minh");
        idDict.put("46", "Long An");
        idDict.put("47", "Tiền Giang");
        idDict.put("48", "Bến Tre");
        idDict.put("49", "Trà Vinh");
        idDict.put("50", "Vĩnh Long");
        idDict.put("51", "Đồng Tháp");
        idDict.put("52", "An Giang");
        idDict.put("53", "Kiên Giang");
        idDict.put("54", "Cần Thơ");
        idDict.put("55", "Hậu Giang");
        idDict.put("56", "Sóc Trăng");
        idDict.put("57", "Bạc Liêu");
        idDict.put("58", "Cà Mau");

        // Get province code from the id
        String provinceCode = id.substring(1, 3);
        String sexCode = id.substring(3, 4);
        String yearofBirth = id.substring(4, 6);
        String randomCode = id.substring(6, 11);
        if (idDict.containsKey(provinceCode)) {}
        try{
            System.out.println("Mã tỉnh thành: " + idDict.get(provinceCode));

            System.out.println("Mã tỉnh thành: " + idDict.get(provinceCode));
            if (sexCode.equals("1") || sexCode.equals("2")) {
                System.out.println("Năm sinh: 19" + yearofBirth);
                if (sexCode.equals("1")) {
                    System.out.println("Giới tính: Nam");
                } else {
                    System.out.println("Giới tính: Nữ");
                }
            } else {
                System.out.println("Năm sinh: 20" + yearofBirth);
                if (sexCode.equals("3")) {
                    System.out.println("Giới tính: Nam");
                } else {
                    System.out.println("Giới tính: Nữ");
                }

                System.out.println("Dãy ngẫu nhiên: " + randomCode);
            }
        }
        catch (Exception e) {
                System.out.println("Mã tỉnh thành không hợp lệ");
            }


        }
    }



// Sol
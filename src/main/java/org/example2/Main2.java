package org.example2;

import java.util.Scanner;
import org.example.IdCardVerifier;

public class Main2 {

  public static void main(String[] args) {
    String id = "026078198234";
    System.out.println(id.substring(0, 3));
    System.out.println(id.substring(4, 6));
    System.out.println(id.substring(3, 4));
    System.out.println(id.substring(6,12));
    Scanner idInputRecieved = new Scanner(System.in);
    int id2 = idInputRecieved.nextInt();
  }

}

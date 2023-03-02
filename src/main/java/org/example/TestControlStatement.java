package org.example;

import java.util.Arrays;

class Computer {

  String name = "Dell";


  public Computer(String name) {
    this.name = name;

  }

  class CPU {

    public void process() {
      System.out.println("CPU is Intel I7 10th Gen");
    }
  }

  class RAM {

    public void memory() {
      System.out.println("RAM is 16GB");
    }
  }

  class Storage {

    public void storage() {
      System.out.println("Storage is 1TB");
    }
  }

  class computerName {

    public void getName() {
      System.out.println("Computer name is " + Computer.this.name);
    }
  }
}

interface iotDevice {

  void turnOn();

  void turnOff();

  void getType();

  void getFirmwareVersion();

  void displayTime();
}

interface iotDevice2 {

  void SIMcardinfo();

  void sleepTime();

  void controlClock();

}

class Light implements iotDevice, iotDevice2 {

  @Override
  public void turnOn() {
    System.out.println("Light is turned on");
  }

  @Override
  public void turnOff() {
    System.out.println("Light is turned off");
  }

  @Override
  public void getType() {
    System.out.println("Light is a type of iotDevice");
  }

  @Override
  public void getFirmwareVersion() {
    System.out.println("Light's firmware version is 1.0.0");
  }

  @Override
  public void displayTime() {
    System.out.println("Light's time is 12:00");
  }

  @Override
  public void controlClock() {
    System.out.println("Light's clock is controlled");
  }

  @Override
  public void SIMcardinfo() {
    System.out.println("Light's SIM card info is 123456789");
  }

  public void sleepTime() {
    System.out.println("Light's sleep time is 12:00");
  }
}

abstract class Language {

  abstract void display();

  public void displayLanguage() {
    System.out.println("This is a language:");
  }

}

class English extends Language {

  @Override
  void display() {
    English english = new English();
    english.displayLanguage();
    System.out.println("English");
  }
}

class testTestHeritance extends testInheritance {

  public static void main(String[] args) {
    testTestHeritance test = new testTestHeritance();
    System.out.println(test.heritanceVariable);
  }

  @Override // can't not set static for override method
  public void displayLightInfo() {
    super.displayLightInfo(); // super Keyword
    System.out.println("Light is turned off");
  }
}

class testInheritance {

  int heritanceVariable = 1;

  public void displayLightInfo() {
    System.out.println("Light is turned on");
  }
}

class testThisKeyWord {

  int numbers = 9;

  public testThisKeyWord() {

    int numbers2 = this.numbers++;
    int numbers1 = numbers;
    System.out.println(numbers2);
    System.out.println(numbers1);


  }

  public static void main(String[] args) {

  }


}

class testAccessModifier {

  public String name2 = "Mary";
  protected String name4 = "Paul";
  String name = "John";
  private final String name3 = "Peter";

  public static void main(String[] args) {
    testAccessModifier test = new testAccessModifier();
    System.out.println(test.name);
    System.out.println(test.name2);
    System.out.println(test.name3);
    System.out.println(test.name4);
  }

}

class Company {

  String name;

  public Company(String name) {
    this.name = name;
    System.out.println(name);
  }
}

public class TestControlStatement {

  TestControlStatement() {
    System.out.println("TestControlStatement constructor");

  }


  public static void main(String[] args) {
    System.out.println("Hello World!");
//    testSwitch();
//    testContinue();
//    testContinue2();
//
//    testLabeledContinue();
//    testArray();

//    testClassStatement();
//      testContructor();
//    testString();
//    testAccessModifier();
//      testThiskeyword();
//    testFinalVariables();
//
//    testInheritannce();
//      testOverriding();
//    testInterfaces();
//    testInnerClass();
    System.out.println(testRecursive(9));
  }


  static void testEnhancedForLoop() {

  }

  static void testContinue() {
    for (int i = 0; i < 10; i++) {
      if (i > 5) {
        continue;
      }
      System.out.println(i);
    }
    System.out.println("Done");
  }

  static void testContinue2() {
    for (int j = 1; j < 10; j++) {
      System.out.println("j= " + j);
      for (int k = 1; k < 10; k++) {

        if (k == 5) {

          continue;
        }
        System.out.println("k= " + k);
      }
    }
    System.out.println("End of testContinue2");

  }

  static void testLabeledContinue() {
    label:
    for (int j = 1; j < 10; j++) {
      System.out.println("j= " + j);
      for (int k = 1; k < 10; k++) {

        if (k == 5) {

          continue label;
        }
        System.out.println("k= " + k);
      }
    }

  }

  static void testSwitch() {
    int i = 1;
    switch (i) {
      case 0:
        System.out.println("0");
//        break;
      case 1:
        System.out.println("1");
//        break;
      case 2:
        System.out.println("2");

      case 3:
        System.out.println("3");
        break;
      case 4:
        System.out.println("4");
        break;

      default:
        System.out.println("default");
        break;
    }
  }

  static void testArray() {
    String[] names = new String[3];
    names[0] = "John";
    names[1] = "Mary";
    names[2] = "Peter";
    System.out.println((Arrays.toString(names)));

    String[] array = new String[]{"John1", "Mary1", "Peter1"};
    System.out.println(array[0]);

    String[][] deepArray = new String[][]{{"John", "Mary"}, {"Peter", "Paul"}};
    System.out.println(deepArray[0][0]);
    System.out.println(Arrays.deepToString(deepArray));

    //copy an array
    String[] copyArray = Arrays.copyOf(array, array.length);
    String[] copyArray2 = array;
    String[] copyArray3 = array.clone();
    //copy from index 0 to the end of the array
    String[] copyArray4 = new String[array.length];
    System.arraycopy(array, 0, copyArray4, 0, array.length);
    String[] copyArray5 = Arrays.copyOfRange(array, 0, array.length);

    System.out.println(Arrays.toString(copyArray));
    System.out.println(Arrays.toString(copyArray2));
    System.out.println(Arrays.toString(copyArray3));
    System.out.println(Arrays.toString(copyArray4));
    System.out.println(Arrays.toString(copyArray5));

    //copy an element of an array

  }

  static void testClassStatement() {
    LightCommand led = new LightCommand();
    LightCommand.lightStatus = true;
    boolean a = LightCommand.getLightStatus();
    System.out.println(a);
    LightCommand.setLightStatus(true);
    LightCommand.printLightStatus();
    LightCommand.turnOff();
    LightCommand.printLightStatus();

  }

  static void testContructor() {
    TestControlStatement testControlStatement = new TestControlStatement();
    Company company = new Company("Viettel");


  }

  static void testString() {

    String greets = "Hello";
    String name = "John";
    System.out.println(greets.length());

    // Join  2 strings
    String nameGreets = greets + name;
    String nameGreets1 = greets.concat(name);
    System.out.println(nameGreets);
    System.out.println(nameGreets1);

    // Compare 2 strings
    String string1 = "Hello";
    String string2 = " Hello".trim();
    System.out.println(string1.equals(string2));

    String example = "Hello World";
    example.concat("!");
    System.out.println(example);
    example = example.concat("!");
    System.out.println(example);


  }

  public static void testAccessModifier() {
    testAccessModifier testAccessModifier = new testAccessModifier();
    System.out.println(testAccessModifier.name);
    System.out.println(testAccessModifier.name2);
//    System.out.println(testAccessModifier.name3);
    System.out.println(testAccessModifier.name4);

    System.out.println("test static method");

    org.example.testAccessModifier.main(null);
  }

  public static void testThiskeyword() {
    // equal to self python
    System.out.println("test this keyword");
    testThisKeyWord testThiskeyword = new testThisKeyWord();
    System.out.println(testThiskeyword.numbers);


  }

  public static void testFinalVariables() {
    final int a = 10;

//    a = 15;
    System.out.println(a);

  }

  public static void testInheritannce() {
    testTestHeritance test = new testTestHeritance();
    testTestHeritance.main(null);

  }

  public static void testOverriding() {
    testTestHeritance newTest = new testTestHeritance();
    newTest.displayLightInfo();

  }

  public static void testAbstractClass() {
    English english = new English();
    english.display();
  }

  public static void testInterfaces() {
    Light lights1_floor1 = new Light();
    lights1_floor1.turnOn();
    lights1_floor1.turnOff();
    lights1_floor1.getFirmwareVersion();
    lights1_floor1.getType();
    lights1_floor1.SIMcardinfo();
  }

  public static void testInnerClass() {
    Computer computer = new Computer("Dell");
    Computer.CPU cpu = computer.new CPU();
    Computer.RAM ram = computer.new RAM();
    Computer.Storage storage = computer.new Storage();
//Computer.computerName name = computer.new.computerName();

    cpu.process();
    ram.memory();
    storage.storage();


  }

  public static int testRecursive(int n) {
    if (n == 0 || n == 1) {
      return 1;
    } else {
      return n * testRecursive(n - 2);
    }

  }


}
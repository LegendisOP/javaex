interface interfaceDemoA {
  void display1();
  void display2();
}

interface interfaceDemoB extends interfaceDemoA{
  void display3();
  void display4();
}

class interfaceDemoClassA implements interfaceDemoA {
  public void display1(){
    System.out.println("This is display 1 method");
  }
  public void display2(){
    System.out.println("This is display 2 method");
  }
}

class interfaceDemoClassB implements interfaceDemoB{
  public void display1(){
    System.out.println("This is display 1 method");
  }
  public void display2(){
    System.out.println("This is display 2 method");
  }
  public void display3(){
    System.out.println("This is display 3 method");
  }
  public void display4(){
    System.out.println("This is display 4 method");
  }
}

public class interfaceDemo {
  public static void main(String args[]){
    interfaceDemoClassA interfaceDemoObjectA = new interfaceDemoClassA();
    interfaceDemoClassB interfaceDemoObjectB = new interfaceDemoClassB();
    interfaceDemoObjectA.display1();
    interfaceDemoObjectA.display2();
    interfaceDemoObjectB.display1();
    interfaceDemoObjectB.display2();
    interfaceDemoObjectB.display3();
    interfaceDemoObjectB.display4();
  }
}

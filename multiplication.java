
public class multiplication{

  //MODIFY TO  PREVENT INFINITE RECURSION
 public static int multiply(int a, int b){
    return a + multiply(a, b - 1);
  }

  public static void main(String[] args){ // NO NEED TO MODIFY
    for (int a = 1; a <= 5; a++){
      for (int b = 1; b <= 5; b++)
        System.out.println("" + a + " * " + b + " = " + multiply(a,b));
    }
  }

}

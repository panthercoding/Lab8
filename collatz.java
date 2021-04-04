/* 
after compiling, run by writing java collatz [insert number here]
it will return the collatz sequence for the user specified number
*/

import java.util.*;

public class collatz{

  public static ArrayList<Integer> findCollatz(int n, ArrayList<Integer> list){
    /* recursive method to be implemented */
  }

  /* NO NEED TO CHANGE */
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]); //1st command line argument
    //creates list to populate with sequence numbers
    ArrayList<Integer> list = new ArrayList<Integer>();
    System.out.println(findCollatz(n, list)); //find the collatz sequence of n
  }

}

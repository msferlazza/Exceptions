package ch.ibw.exceptions;

import Prog1Tools.IOTools;

public class Excep1 {

  public static void main(String[] args) {
    int a = IOTools.readInteger("a=");
    int b = IOTools.readInteger("b=");
    System.out.println("a/b="+(a/b));
  }

}

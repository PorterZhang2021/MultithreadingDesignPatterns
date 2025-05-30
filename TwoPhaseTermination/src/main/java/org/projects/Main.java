package org.projects;

public class Main {
  public static void main(String[] args) {
    System.out.println("main: BEGIN");
    try {
      CountupThread countupThread = new CountupThread();
      countupThread.start();

      Thread.sleep(10000);

      System.out.println("main: shutdownRequest");
      countupThread.shutdownRequest();

      System.out.println("main: join");

      countupThread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("main: END");
  }
}

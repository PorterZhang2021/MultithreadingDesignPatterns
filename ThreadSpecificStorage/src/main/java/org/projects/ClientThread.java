package org.projects;

public class ClientThread extends Thread {
  public ClientThread(String name) {
    super(name);
  }

  public void run() {
    System.out.println(getName() + "  BEGIN");
    for (int i = 0; i < 10; i++) {
      Log.println("i = " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {

      }
    }
    Log.close();
    System.out.println(getName() + "  END");
  }
}

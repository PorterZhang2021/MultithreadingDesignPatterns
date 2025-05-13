package org.projects;

public class UserThread extends Thread {
  private final Gate gate;
  private final String name;

  private final String address;

  public UserThread(Gate gate, String name, String myAddress) {
    this.gate = gate;
    this.name = name;
    this.address = myAddress;
  }

  public void run() {
    System.out.println(name + " is trying to enter the gate");
    while (true) {
      gate.pass(name, address);
    }
  }


}

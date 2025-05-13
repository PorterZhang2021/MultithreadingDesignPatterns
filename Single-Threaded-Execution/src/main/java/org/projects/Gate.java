package org.projects;

public class Gate {
  private int count;
  private String name;
  private String address;


  public synchronized void pass(String name, String address) {
    this.count++;
    this.name = name;
    this.address = address;
    check();
  }

  public synchronized String toString() {
    return "No: " + count + " " + name + "-" + address;
  }

  private void check() {
    if (name.charAt(0) != address.charAt(0)) {
      System.out.println("**** BROKEN ****" + this);
    } else {
      System.out.println(this);
    }
  }
}

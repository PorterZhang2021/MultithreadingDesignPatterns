package org.projects;

public class PrintPersonThread extends Thread {
  private final Person person;

  public PrintPersonThread(Person person) {
    this.person = person;
  }

  public void run() {
    System.out.println(Thread.currentThread().getName() + " prints " + person);
  }
}

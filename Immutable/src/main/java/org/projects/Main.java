package org.projects;

public class Main {
  public static void main(String[] args) {
    Person alice = new Person("Alice", 20);
    Person bob = new Person("Bob", 30);
    Person charlie = new Person("Charlie", 40);
    new PrintPersonThread(alice).start();
    new PrintPersonThread(alice).start();
    new PrintPersonThread(alice).start();
    new PrintPersonThread(bob).start();
    new PrintPersonThread(charlie).start();
  }
}

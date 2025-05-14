package org.projects;

public class Main {
  public static void main(String[] args) {
    Person alice = new Person("Alice", "Alaska");
    Person bob = new Person("Bob", "Boston");
    Person charlie = new Person("Charlie", "Chicago");
    new PrintPersonThread(alice).start();
    new PrintPersonThread(bob).start();
    new PrintPersonThread(charlie).start();
  }
}

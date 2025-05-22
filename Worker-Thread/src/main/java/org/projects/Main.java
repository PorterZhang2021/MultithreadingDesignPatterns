package org.projects;

public class Main {
  public static void main(String[] args) {
    Channel channel = new Channel(5);
    channel.startWorkers();
    new ClientThread("Alice", channel).start();
    new ClientThread("Bob", channel).start();
    new ClientThread("Charlie", channel).start();
  }
}

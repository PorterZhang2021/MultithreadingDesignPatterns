package org.projects;

import java.util.Random;

public class EaterThread extends Thread {
  private final Random random;

  private final Table table;

  public EaterThread(String name, Table table, long seed) {
    super(name);
    this.table = table;
    this.random = new Random(seed);
  }

  public void run() {
    try {
      while (true) {
        String cake = table.take();
        System.out.println(Thread.currentThread().getName() + " ate " + cake);
        Thread.sleep(random.nextInt(1000));
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

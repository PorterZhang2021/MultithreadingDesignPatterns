package org.projects;

public class Main {
  public static void main(String[] args) {
    Table table = new Table(3);
    new MakerThread("MakerThread-1", table, 31415).start();
    new MakerThread("MarkerThread-2", table, 92653).start();
    new MakerThread("MarkerThread-3", table, 58989).start();
    new EaterThread("EaterThread-1", table, 58989).start();
    new EaterThread("EaterThread-2", table, 62643).start();
    new EaterThread("EaterThread-3", table, 38327).start();
  }
}

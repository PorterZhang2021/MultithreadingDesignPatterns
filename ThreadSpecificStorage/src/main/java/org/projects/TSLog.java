package org.projects;

import java.io.PrintWriter;

public class TSLog {
  private PrintWriter writer = null;

  public TSLog(String filename) {
    try {
      writer = new PrintWriter(filename);
    } catch (Exception e) {
      System.err.println("Cannot open log file: " + filename);
    }
  }

  public void println(String s) {
    writer.println(s);
  }

  public void close() {
    writer.println("==== END of log ====");
    writer.close();
  }

}

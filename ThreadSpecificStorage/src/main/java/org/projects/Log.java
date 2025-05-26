package org.projects;

public class Log {
  private static final ThreadLocal<TSLog> tsLogCollection = new ThreadLocal<>();

  public static void println(String s) {
    getTSLog().println(s);
  }

  public static void close() {
    getTSLog().close();
  }

  public static TSLog getTSLog() {
    TSLog tsLog = tsLogCollection.get();

    if (tsLog == null) {
      tsLog = new TSLog(Thread.currentThread().getName() + "-log.txt");
      tsLogCollection.set(tsLog);
    }
    return tsLog;
  }

}

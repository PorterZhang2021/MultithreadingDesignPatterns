package org.projects;

public class DisplayClientThread extends Thread {
  private final ActiveObject activeObject;

  public DisplayClientThread(String name, ActiveObject activeObject) {
    super(name);
    this.activeObject = activeObject;
  }

  public void run() {
    try {
      for (int i = 0; true; i++) {
        String content = Thread.currentThread().getName() + " " + i;
        activeObject.displayString(content);
        Thread.sleep(200);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

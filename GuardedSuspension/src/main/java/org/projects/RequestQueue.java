package org.projects;

import java.util.LinkedList;
import java.util.Queue;

public class RequestQueue {
  private final Queue<Request> queue = new LinkedList<>();

  public synchronized Request getRequest() {
    // guard condition
    while (queue.peek() == null) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    return queue.poll();
  }

  public synchronized void putRequest(Request request) {
    queue.offer(request);
    notifyAll();
  }

}

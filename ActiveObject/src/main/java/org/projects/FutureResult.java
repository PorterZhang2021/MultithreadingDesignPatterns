package org.projects;

public class FutureResult<T> extends Result<T> {

  private Result<T> result;

  private boolean ready = false;

  public synchronized void setResult(Result<T> result) {
    this.result = result;
    ready = true;
    notifyAll();
  }

  @Override
  public synchronized T getResultValue() {
    while (!ready) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    return result.getResultValue();
  }
}

package org.projects;

public class ReadWriteLock {

  private int readingReaders = 0;
  private int waitingWriters = 0;
  private int writingWriters = 0;

  private boolean preferWriter = true;

  public synchronized void readLock() throws InterruptedException {
    while (writingWriters > 0 || (preferWriter && waitingWriters > 0)) {
      wait();
    }
    readingReaders++;
  }

  public synchronized void readUnlock() {
    readingReaders--;
    // 这里可以优化成 if (readingReaders == 0) preferWriter=true notifyAll();
    // 是否有问题暂时不知道
    preferWriter = true;
    notifyAll();
  }

  public synchronized void writeLock() throws InterruptedException {
    waitingWriters++;
    try {
      while (readingReaders > 0 || writingWriters > 0) {
        // 这里有finally的情况，是不是不能改成return?
        wait();
      }
    } finally {
      waitingWriters--;
    }
    writingWriters++;
  }

  public synchronized void writeUnlock() {
    writingWriters--;
    preferWriter = false;
    notifyAll();
  }

}


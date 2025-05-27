package org.projects;

public class DisplayStringRequest extends MethodRequest<Object> {
  private final String string;

  public DisplayStringRequest(Servant servant, String content) {
    super(servant, null);
    this.string = content;
  }

  @Override
  public void execute() {
    servant.displayString(string);
  }
}

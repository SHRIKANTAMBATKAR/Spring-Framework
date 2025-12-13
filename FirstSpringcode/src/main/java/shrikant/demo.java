package shrikant;

public class demo {
  private String Message;

  public demo() {
	super();
  }

  public demo(String message) {
	super();
	Message = message;
  }

  @Override
  public String toString() {
	return "demo [Message=" + Message + "]";
  }
  public void sayHello() {
      System.out.println(Message);
  }
}

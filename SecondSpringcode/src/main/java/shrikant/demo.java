package shrikant;

import java.util.ArrayList;
import java.util.Iterator;

public class demo {
  private String Message;
  private int i , j;
  
  ArrayList<String> obj;

  public demo() {
	super();
  }

  public demo(String message) {
	super();
	Message = message;
  }
  
  
  public demo(String message, int i, int j) {
	super();
	Message = message;
	this.i = i;
	this.j = j;
}
  
  public demo(ArrayList<String> obj) {
	super();
	this.obj = obj;
}

  public void printnum() {
      System.out.println(Message);
	  System.out.println(i);
	  System.out.println(j);
  }
  
  public void printlist() {
	Iterator<String> itr = obj.iterator();
     while(itr.hasNext()) {
      System.out.println(itr.next());
     }
   }

  }
  


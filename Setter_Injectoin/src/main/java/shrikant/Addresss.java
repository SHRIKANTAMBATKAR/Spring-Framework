package shrikant;

import java.io.Serializable;

public class Addresss implements  Serializable{
  private int doreno;
  private String city;
  private String state;
  
  public Addresss() {
	super();
  }

  public Addresss(int doreno, String city, String state) {
	super();
	this.doreno = doreno;
	this.city = city;
	this.state = state;
  }

  @Override
  public String toString() {
	return "Addresss [doreno=" + doreno + ", city=" + city + ", state=" + state + "]";
  }


  
}

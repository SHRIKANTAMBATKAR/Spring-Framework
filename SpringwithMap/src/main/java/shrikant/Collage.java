package shrikant;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class Collage {
  private int clgId;
  private String clgName;
  private Map<Deparment, Employee> deparment;
  
  public Collage() {
	super();
  }

  public Collage(int clgId, String clgName, Map<Deparment, Employee> deparment) {
	super();
	this.clgId = clgId;
	this.clgName = clgName;
	this.deparment = deparment;
  }
  
  public void show() {
	  System.out.println(clgId);
	  System.out.println(clgName);
	  
	Set<Entry<Deparment, Employee>> s=deparment.entrySet();
	Iterator <Entry<Deparment, Employee>> itr=s.iterator();
	while(itr.hasNext()) {
		Entry<Deparment, Employee> entry=itr.next();
		System.out.println("Dep is :"+entry.getKey()+" "+"Hod is "+entry.getValue());
		
	}
	
  }
  
}

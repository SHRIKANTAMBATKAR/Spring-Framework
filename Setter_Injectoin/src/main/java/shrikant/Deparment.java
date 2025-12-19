package shrikant;
import java.util.List;

public class Deparment {

    private int depid;
    private String depname;
    private List<Employee> list;

    public Deparment() {
        super();
    }
    

    public Deparment(int depid, String depname, List<Employee> list) {
        this.depid = depid;
        this.depname = depname;
        this.list = list;
    }

    public List<Employee> getList() {
        return list;
    }

	public int getDepid() {
		return depid;
	}


	public void setDepid(int depid) {
		this.depid = depid;
	}


	public String getDepname() {
		return depname;
	}


	public void setDepname(String depname) {
		this.depname = depname;
	}


	public void setList(List<Employee> list) {
		this.list = list;
	}
   
	@Override
    public String toString() {
        return "Deparment [depid=" + depid +
               ", depname=" + depname + "]";
    }
    
}


package MiniProject1;

public class BusDetails {
    private String name;
    private int busnum;
    private String route;
    private int space;
    private boolean ac;
     
     BusDetails(String name,int busnum, String route,int space,boolean ac){
    	
    	this.name=name;
    	this.busnum=busnum;
    	this.route=route;
    	this.space=space;
    	this.ac=ac;
     }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBusnum() {
		return busnum;
	}
	
	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public int getSpace() {
		return space;
	}

	public void setSpace(int space) {
		this.space = space;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public void Display() {
		System.out.println("name=" + name + ", busnum=" + busnum + ", route=" + route + ", space=" + space + ", ac="
				+ ac );
	} 
     
     
     
}

package myUI.app;

public class Planet {
	private String name;
	private String decsription;
	
	public Planet(String name, String description) {
		this.name = name;
		this.decsription = description;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.decsription;
	}
}

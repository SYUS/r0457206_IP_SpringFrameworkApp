package service;

public class MenuItem {
	private String action;
	private String description;
	private boolean authenticationNeeded;

	public MenuItem(){}
	
	public MenuItem(String action, String desciption) {
		super();
		this.setAction(action);
		this.setDescription(desciption);
	}

	public MenuItem(String action, String desciption, boolean authenticationNeeded) {
		super();
		this.setAction(action);
		this.setDescription(desciption);
		this.setAuthenticationNeeded(authenticationNeeded);
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String desciption) {
		this.description = desciption;
	}

	public boolean isAuthenticationNeeded() {
		return authenticationNeeded;
	}

	public void setAuthenticationNeeded(boolean authenticationNeeded) {
		this.authenticationNeeded = authenticationNeeded;
	}
}

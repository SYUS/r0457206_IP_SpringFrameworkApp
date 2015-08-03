package model;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Person implements Serializable{
    
        private static final String EMAIL_PATTERN = 
		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
        @Size(min=2,max=30)
	private String name;
        
        @NotNull
        @Pattern(regexp=EMAIL_PATTERN)
	private String email;
        
        @Size(min=6,max=30)
	private String password;

	public Person() {}

        public Person(String email, String password) {
            this("sessionUser",email,password);
        } 
        
	public Person(String name, String email, String password) {
		setName(name);
		setEmail(email);
		setPassword(password);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isPasswordCorrect(String password) {
		return getPassword().equals(password);
	}
}

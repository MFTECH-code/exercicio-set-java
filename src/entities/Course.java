package entities;

import java.util.Objects;
import java.util.Set;

public class Course {
	private String name;
	private Set<User> cadastredUsers;
	
	public Course() {
		super();
	}

	public Course(String name, Set<User> cadastredUsers) {
		super();
		this.name = name;
		this.cadastredUsers = cadastredUsers;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Set<User> getCadastredUsers() {
		return cadastredUsers;
	}
	
	public void setCadastredUsers(Set<User> cadastredUsers) {
		this.cadastredUsers = cadastredUsers;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(name, other.name);
	}
}

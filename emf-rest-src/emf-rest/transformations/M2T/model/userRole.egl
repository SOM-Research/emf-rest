package webmapi.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@SuppressWarnings("serial")
@Entity
@Table(name ="USER_ROLE")
public class UserRole implements Serializable{

	@Id
	@GeneratedValue
	private Long id;
	
	@JoinColumn(name = "USER_ID")
	@ManyToOne
	private User user;
	
	@JoinColumn(name = "ROLE_ID")
	@ManyToOne
	private Role role;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	
	
	
}

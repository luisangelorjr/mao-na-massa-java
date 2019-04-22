package persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class ApplicationUser extends AbstractEntity {

	private static final long serialVersionUID = 4602833676694388632L;
	
	@NotEmpty(message = "The username cannot be empty")
	@Column(unique = true)
	private String username;
	@NotEmpty(message = "O campo de senha não pode ser vazio")
	private String password;
	@OneToOne
	private Professor professor;
}

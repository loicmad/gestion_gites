package pojo;

// Generated 03-avr.-2014 20:24:12 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Personne generated by hbm2java
 */
@Entity
@Table(name = "personne", catalog = "gestion_gite", uniqueConstraints = @UniqueConstraint(columnNames = {
		"login", "password" }))
public class Personne implements java.io.Serializable {

	private Integer idPersonne;
	private String nom;
	private String prenom;
	private String email;
	private boolean statut;
	private String login;
	private String password;
	private Gerant gerant;
	private Moderateur moderateur;

	public Personne() {
	}

	public Personne(String nom, String prenom, String email, boolean statut,
			String login, String password) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.statut = statut;
		this.login = login;
		this.password = password;
	}

	public Personne(String nom, String prenom, String email, boolean statut,
			String login, String password, Gerant gerant, Moderateur moderateur) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.statut = statut;
		this.login = login;
		this.password = password;
		this.gerant = gerant;
		this.moderateur = moderateur;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idPersonne", unique = true, nullable = false)
	public Integer getIdPersonne() {
		return this.idPersonne;
	}

	public void setIdPersonne(Integer idPersonne) {
		this.idPersonne = idPersonne;
	}

	@Column(name = "nom", nullable = false, length = 100)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "prenom", nullable = false, length = 100)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "email", nullable = false, length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "statut", nullable = false)
	public boolean isStatut() {
		return this.statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}

	@Column(name = "login", nullable = false, length = 10)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "password", nullable = false, length = 44)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "personne")
	public Gerant getGerant() {
		return this.gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "personne")
	public Moderateur getModerateur() {
		return this.moderateur;
	}

	public void setModerateur(Moderateur moderateur) {
		this.moderateur = moderateur;
	}

}

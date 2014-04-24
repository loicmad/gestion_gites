package pojo;

// Generated 03-avr.-2014 20:24:12 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Gerant generated by hbm2java
 */
@Entity
@Table(name = "gerant", catalog = "gestion_gite")
public class Gerant implements java.io.Serializable {

	private int idGerant;
	private Personne personne;
	private Date dateAffiliation;
	private Set<Gite> gites = new HashSet<Gite>(0);

	public Gerant() {
	}

	public Gerant(Personne personne, Date dateAffiliation) {
		this.personne = personne;
		this.dateAffiliation = dateAffiliation;
	}

	public Gerant(Personne personne, Date dateAffiliation, Set<Gite> gites) {
		this.personne = personne;
		this.dateAffiliation = dateAffiliation;
		this.gites = gites;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "personne"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "idGerant", unique = true, nullable = false)
	public int getIdGerant() {
		return this.idGerant;
	}

	public void setIdGerant(int idGerant) {
		this.idGerant = idGerant;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Personne getPersonne() {
		return this.personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateAffiliation", nullable = false, length = 19)
	public Date getDateAffiliation() {
		return this.dateAffiliation;
	}

	public void setDateAffiliation(Date dateAffiliation) {
		this.dateAffiliation = dateAffiliation;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gerant")
	public Set<Gite> getGites() {
		return this.gites;
	}

	public void setGites(Set<Gite> gites) {
		this.gites = gites;
	}

}

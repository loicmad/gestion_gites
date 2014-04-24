package pojo;

// Generated 03-avr.-2014 20:24:12 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Installation generated by hbm2java
 */
@Entity
@Table(name = "installation", catalog = "gestion_gite")
public class Installation implements java.io.Serializable {

	private Integer idInstallation;
	private String typeInstallation;
	private byte[] pictogramme;
	private Set<Gite> gites = new HashSet<Gite>(0);

	public Installation() {
	}

	public Installation(String typeInstallation, byte[] pictogramme) {
		this.typeInstallation = typeInstallation;
		this.pictogramme = pictogramme;
	}

	public Installation(String typeInstallation, byte[] pictogramme,
			Set<Gite> gites) {
		this.typeInstallation = typeInstallation;
		this.pictogramme = pictogramme;
		this.gites = gites;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idInstallation", unique = true, nullable = false)
	public Integer getIdInstallation() {
		return this.idInstallation;
	}

	public void setIdInstallation(Integer idInstallation) {
		this.idInstallation = idInstallation;
	}

	@Column(name = "typeInstallation", nullable = false, length = 50)
	public String getTypeInstallation() {
		return this.typeInstallation;
	}

	public void setTypeInstallation(String typeInstallation) {
		this.typeInstallation = typeInstallation;
	}

	@Column(name = "pictogramme", nullable = false)
	public byte[] getPictogramme() {
		return this.pictogramme;
	}

	public void setPictogramme(byte[] pictogramme) {
		this.pictogramme = pictogramme;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "installations")
	public Set<Gite> getGites() {
		return this.gites;
	}

	public void setGites(Set<Gite> gites) {
		this.gites = gites;
	}

}
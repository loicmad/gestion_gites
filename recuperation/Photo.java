package recuperation;

// Generated 03-avr.-2014 20:24:12 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Photo generated by hbm2java
 */
@Entity
@Table(name = "photo", catalog = "gestion_gite")
public class Photo implements java.io.Serializable {

	private Integer idPhoto;
	private Gite gite;
	private String nomPhoto;
	private String pathPhotp;
	private String format;
	private int taille;

	public Photo() {
	}

	public Photo(Gite gite, String nomPhoto, String pathPhotp, String format,
			int taille) {
		this.gite = gite;
		this.nomPhoto = nomPhoto;
		this.pathPhotp = pathPhotp;
		this.format = format;
		this.taille = taille;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idPhoto", unique = true, nullable = false)
	public Integer getIdPhoto() {
		return this.idPhoto;
	}

	public void setIdPhoto(Integer idPhoto) {
		this.idPhoto = idPhoto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idGite", nullable = false)
	public Gite getGite() {
		return this.gite;
	}

	public void setGite(Gite gite) {
		this.gite = gite;
	}

	@Column(name = "nomPhoto", nullable = false, length = 50)
	public String getNomPhoto() {
		return this.nomPhoto;
	}

	public void setNomPhoto(String nomPhoto) {
		this.nomPhoto = nomPhoto;
	}

	@Column(name = "pathPhotp", nullable = false, length = 50)
	public String getPathPhotp() {
		return this.pathPhotp;
	}

	public void setPathPhotp(String pathPhotp) {
		this.pathPhotp = pathPhotp;
	}

	@Column(name = "format", nullable = false, length = 10)
	public String getFormat() {
		return this.format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	@Column(name = "taille", nullable = false)
	public int getTaille() {
		return this.taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

}

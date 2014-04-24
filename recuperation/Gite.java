package recuperation;

// Generated 03-avr.-2014 20:24:12 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Gite generated by hbm2java
 */
@Entity
@Table(name = "gite", catalog = "gestion_gite")
public class Gite implements java.io.Serializable {

	private Integer idGite;
	private Typegite typegite;
	private Gerant gerant;
	private String nomGite;
	private String localisation;
	private String telephone;
	private String fax;
	private int cotation;
	private Set<Installation> installations = new HashSet<Installation>(0);
	private Set<Typelocation> typelocations = new HashSet<Typelocation>(0);
	private Set<Commentaire> commentaires = new HashSet<Commentaire>(0);
	private Set<Photo> photos = new HashSet<Photo>(0);
	private Set<Specialite> specialites = new HashSet<Specialite>(0);
	private Set<LinkGiteactivite> linkGiteactivites = new HashSet<LinkGiteactivite>(
			0);

	public Gite() {
	}

	public Gite(Typegite typegite, Gerant gerant, String nomGite,
			String localisation, String telephone, String fax, int cotation) {
		this.typegite = typegite;
		this.gerant = gerant;
		this.nomGite = nomGite;
		this.localisation = localisation;
		this.telephone = telephone;
		this.fax = fax;
		this.cotation = cotation;
	}

	public Gite(Typegite typegite, Gerant gerant, String nomGite,
			String localisation, String telephone, String fax, int cotation,
			Set<Installation> installations, Set<Typelocation> typelocations,
			Set<Commentaire> commentaires, Set<Photo> photos,
			Set<Specialite> specialites, Set<LinkGiteactivite> linkGiteactivites) {
		this.typegite = typegite;
		this.gerant = gerant;
		this.nomGite = nomGite;
		this.localisation = localisation;
		this.telephone = telephone;
		this.fax = fax;
		this.cotation = cotation;
		this.installations = installations;
		this.typelocations = typelocations;
		this.commentaires = commentaires;
		this.photos = photos;
		this.specialites = specialites;
		this.linkGiteactivites = linkGiteactivites;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idGite", unique = true, nullable = false)
	public Integer getIdGite() {
		return this.idGite;
	}

	public void setIdGite(Integer idGite) {
		this.idGite = idGite;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idType", nullable = false)
	public Typegite getTypegite() {
		return this.typegite;
	}

	public void setTypegite(Typegite typegite) {
		this.typegite = typegite;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idGerant", nullable = false)
	public Gerant getGerant() {
		return this.gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	@Column(name = "nomGite", nullable = false, length = 100)
	public String getNomGite() {
		return this.nomGite;
	}

	public void setNomGite(String nomGite) {
		this.nomGite = nomGite;
	}

	@Column(name = "localisation", nullable = false)
	public String getLocalisation() {
		return this.localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	@Column(name = "telephone", nullable = false, length = 15)
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "fax", nullable = false, length = 15)
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Column(name = "cotation", nullable = false)
	public int getCotation() {
		return this.cotation;
	}

	public void setCotation(int cotation) {
		this.cotation = cotation;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "link_giteinstallation", catalog = "gestion_gite", joinColumns = { @JoinColumn(name = "idGite", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "idInstallation", nullable = false, updatable = false) })
	public Set<Installation> getInstallations() {
		return this.installations;
	}

	public void setInstallations(Set<Installation> installations) {
		this.installations = installations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gite")
	public Set<Typelocation> getTypelocations() {
		return this.typelocations;
	}

	public void setTypelocations(Set<Typelocation> typelocations) {
		this.typelocations = typelocations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gite")
	public Set<Commentaire> getCommentaires() {
		return this.commentaires;
	}

	public void setCommentaires(Set<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gite")
	public Set<Photo> getPhotos() {
		return this.photos;
	}

	public void setPhotos(Set<Photo> photos) {
		this.photos = photos;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "link_gitespecialite", catalog = "gestion_gite", joinColumns = { @JoinColumn(name = "igGite", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "idSpecialite", nullable = false, updatable = false) })
	public Set<Specialite> getSpecialites() {
		return this.specialites;
	}

	public void setSpecialites(Set<Specialite> specialites) {
		this.specialites = specialites;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gite")
	public Set<LinkGiteactivite> getLinkGiteactivites() {
		return this.linkGiteactivites;
	}

	public void setLinkGiteactivites(Set<LinkGiteactivite> linkGiteactivites) {
		this.linkGiteactivites = linkGiteactivites;
	}

}

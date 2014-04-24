package pojo;

// Generated 03-avr.-2014 20:24:12 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Activite generated by hbm2java
 */
@Entity
@Table(name = "activite", catalog = "gestion_gite")
public class Activite implements java.io.Serializable {

	private Integer idActivite;
	private Typeactivite typeactivite;
	private String nomActivite;
	private String description;
	private Date dateOuverture;
	private String periode;
	private String lieu;
	private String siteWeb;
	private Set<LinkGiteactivite> linkGiteactivites = new HashSet<LinkGiteactivite>(
			0);

	public Activite() {
	}

	public Activite(Typeactivite typeactivite, String nomActivite,
			String description, Date dateOuverture, String periode,
			String lieu, String siteWeb) {
		this.typeactivite = typeactivite;
		this.nomActivite = nomActivite;
		this.description = description;
		this.dateOuverture = dateOuverture;
		this.periode = periode;
		this.lieu = lieu;
		this.siteWeb = siteWeb;
	}

	public Activite(Typeactivite typeactivite, String nomActivite,
			String description, Date dateOuverture, String periode,
			String lieu, String siteWeb, Set<LinkGiteactivite> linkGiteactivites) {
		this.typeactivite = typeactivite;
		this.nomActivite = nomActivite;
		this.description = description;
		this.dateOuverture = dateOuverture;
		this.periode = periode;
		this.lieu = lieu;
		this.siteWeb = siteWeb;
		this.linkGiteactivites = linkGiteactivites;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idActivite", unique = true, nullable = false)
	public Integer getIdActivite() {
		return this.idActivite;
	}

	public void setIdActivite(Integer idActivite) {
		this.idActivite = idActivite;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idType", nullable = false)
	public Typeactivite getTypeactivite() {
		return this.typeactivite;
	}

	public void setTypeactivite(Typeactivite typeactivite) {
		this.typeactivite = typeactivite;
	}

	@Column(name = "nomActivite", nullable = false, length = 100)
	public String getNomActivite() {
		return this.nomActivite;
	}

	public void setNomActivite(String nomActivite) {
		this.nomActivite = nomActivite;
	}

	@Column(name = "description", nullable = false, length = 65535)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateOuverture", nullable = false, length = 19)
	public Date getDateOuverture() {
		return this.dateOuverture;
	}

	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	@Column(name = "periode", nullable = false, length = 100)
	public String getPeriode() {
		return this.periode;
	}

	public void setPeriode(String periode) {
		this.periode = periode;
	}

	@Column(name = "lieu", nullable = false, length = 256)
	public String getLieu() {
		return this.lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	@Column(name = "siteWeb", nullable = false, length = 50)
	public String getSiteWeb() {
		return this.siteWeb;
	}

	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "activite")
	public Set<LinkGiteactivite> getLinkGiteactivites() {
		return this.linkGiteactivites;
	}

	public void setLinkGiteactivites(Set<LinkGiteactivite> linkGiteactivites) {
		this.linkGiteactivites = linkGiteactivites;
	}

}
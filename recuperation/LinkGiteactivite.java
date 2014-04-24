package recuperation;

// Generated 03-avr.-2014 20:24:12 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * LinkGiteactivite generated by hbm2java
 */
@Entity
@Table(name = "link_giteactivite", catalog = "gestion_gite")
public class LinkGiteactivite implements java.io.Serializable {

	private LinkGiteactiviteId id;
	private Gite gite;
	private Activite activite;
	private int distance;

	public LinkGiteactivite() {
	}

	public LinkGiteactivite(LinkGiteactiviteId id, Gite gite,
			Activite activite, int distance) {
		this.id = id;
		this.gite = gite;
		this.activite = activite;
		this.distance = distance;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idActivite", column = @Column(name = "idActivite", nullable = false)),
			@AttributeOverride(name = "idGite", column = @Column(name = "idGite", nullable = false)) })
	public LinkGiteactiviteId getId() {
		return this.id;
	}

	public void setId(LinkGiteactiviteId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idGite", nullable = false, insertable = false, updatable = false)
	public Gite getGite() {
		return this.gite;
	}

	public void setGite(Gite gite) {
		this.gite = gite;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idActivite", nullable = false, insertable = false, updatable = false)
	public Activite getActivite() {
		return this.activite;
	}

	public void setActivite(Activite activite) {
		this.activite = activite;
	}

	@Column(name = "distance", nullable = false)
	public int getDistance() {
		return this.distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

}

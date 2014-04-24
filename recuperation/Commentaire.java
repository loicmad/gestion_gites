package recuperation;

// Generated 03-avr.-2014 20:24:12 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Commentaire generated by hbm2java
 */
@Entity
@Table(name = "commentaire", catalog = "gestion_gite")
public class Commentaire implements java.io.Serializable {

	private Integer idCommentaire;
	private Client client;
	private Gite gite;
	private Moderateur moderateur;
	private String commentaire;
	private int appreciation;
	private Date dateCommentaire;
	private boolean statut;

	public Commentaire() {
	}

	public Commentaire(Client client, Gite gite, String commentaire,
			int appreciation, Date dateCommentaire, boolean statut) {
		this.client = client;
		this.gite = gite;
		this.commentaire = commentaire;
		this.appreciation = appreciation;
		this.dateCommentaire = dateCommentaire;
		this.statut = statut;
	}

	public Commentaire(Client client, Gite gite, Moderateur moderateur,
			String commentaire, int appreciation, Date dateCommentaire,
			boolean statut) {
		this.client = client;
		this.gite = gite;
		this.moderateur = moderateur;
		this.commentaire = commentaire;
		this.appreciation = appreciation;
		this.dateCommentaire = dateCommentaire;
		this.statut = statut;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idCommentaire", unique = true, nullable = false)
	public Integer getIdCommentaire() {
		return this.idCommentaire;
	}

	public void setIdCommentaire(Integer idCommentaire) {
		this.idCommentaire = idCommentaire;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idClient", nullable = false)
	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idGite", nullable = false)
	public Gite getGite() {
		return this.gite;
	}

	public void setGite(Gite gite) {
		this.gite = gite;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idModerateur")
	public Moderateur getModerateur() {
		return this.moderateur;
	}

	public void setModerateur(Moderateur moderateur) {
		this.moderateur = moderateur;
	}

	@Column(name = "commentaire", nullable = false, length = 65535)
	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	@Column(name = "appreciation", nullable = false)
	public int getAppreciation() {
		return this.appreciation;
	}

	public void setAppreciation(int appreciation) {
		this.appreciation = appreciation;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateCommentaire", nullable = false, length = 19)
	public Date getDateCommentaire() {
		return this.dateCommentaire;
	}

	public void setDateCommentaire(Date dateCommentaire) {
		this.dateCommentaire = dateCommentaire;
	}

	@Column(name = "statut", nullable = false)
	public boolean isStatut() {
		return this.statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}

}

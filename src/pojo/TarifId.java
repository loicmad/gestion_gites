package pojo;

// Generated 03-avr.-2014 20:24:12 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TarifId generated by hbm2java
 */
@Embeddable
public class TarifId implements java.io.Serializable {

	private int idType;
	private int idTypeLocation;

	public TarifId() {
	}

	public TarifId(int idType, int idTypeLocation) {
		this.idType = idType;
		this.idTypeLocation = idTypeLocation;
	}

	@Column(name = "idType", nullable = false)
	public int getIdType() {
		return this.idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	@Column(name = "idTypeLocation", nullable = false)
	public int getIdTypeLocation() {
		return this.idTypeLocation;
	}

	public void setIdTypeLocation(int idTypeLocation) {
		this.idTypeLocation = idTypeLocation;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TarifId))
			return false;
		TarifId castOther = (TarifId) other;

		return (this.getIdType() == castOther.getIdType())
				&& (this.getIdTypeLocation() == castOther.getIdTypeLocation());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdType();
		result = 37 * result + this.getIdTypeLocation();
		return result;
	}

}

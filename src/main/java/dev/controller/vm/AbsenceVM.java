/**
 * 
 */
package dev.controller.vm;

import java.time.LocalDate;

import dev.domain.Absence;
import dev.domain.enumerations.Status;
import dev.domain.enumerations.Type;

/**
 * @author robin
 *
 */
public class AbsenceVM {

	private LocalDate dateDebut;
	private LocalDate dateFin;
	private Type type;
	private Status status;
	private String motif;
	
	public AbsenceVM() {
		super();
	}

	public AbsenceVM(LocalDate dateDebut, LocalDate dateFin, Type type, Status status) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.type = type;
		this.status = status;
	}

	public AbsenceVM(Absence abs) {
		this.dateDebut = abs.getDateDebut();
		this.dateFin= abs.getDateFin();
		this.motif = abs.getMotif();
	}


	/** Getter
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}

	/** Setter
	 * @param motif the motif to set
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}

	/**
	 * Getter
	 * @return the dateDebut
	 */
	public LocalDate getDateDebut() {
		return dateDebut;
	}

	/**
	 * Setter
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * Getter
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/**
	 * Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * Getter
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * Setter
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * Getter
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * Setter
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}
	
	
}

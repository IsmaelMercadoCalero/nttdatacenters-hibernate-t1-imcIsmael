package nttdatacentershibernatet1imcIsmael.persistence;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 
 * Entidad de tabla Cliente
 * 
 * @author Ismael Mercado Calero
 *
 */
@Entity
@Table(name = "Cliente")
public class Cliente extends AbstractEntity implements Serializable {
	/** Serial Version */
	private static final long serialVersionUID = 1L;

	/** Identificador (PK) */
	private Long id;

	/** Nombre del cliente */
	private String name;

	/** Primer apellido del cliente */
	private String first_surname;

	/** Segundo apellido del cliente */

	private String second_surname;
	/** DNI del cliente */
	// @Column(name = "DNI", unique = true, nullable = false, length = 9)
	private String DNI;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	public Long getClienteId() {
		return id;
	}

	/**
	 * @param id
	 * 
	 */
	public void setClienteId(Long id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	@Column(name = "name")
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void name(String name) {
		this.name = name;
	}

	@Column(name = "first_surname")
	public String getFirstsurname() {
		return first_surname;
	}

	/**
	 * @param first_surname
	 */
	public void setFirstsurname(String first_surname) {
		this.first_surname = first_surname;
	}

	@Column(name = "second_surname")
	public String getSecondsurname() {
		return second_surname;
	}

	/**
	 * @param second_surname
	 */
	public void setSecondsurname(String second_surname) {
		this.second_surname = second_surname;
	}

	@Column(name = "DNI", unique = true, nullable = false, length = 9)
	public String getDNI() {
		return DNI;
	}

	/**
	 * @param DNI
	 */
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}

	@Transient
	public Class<?> getClase() {
		return Cliente.class;
	}

}

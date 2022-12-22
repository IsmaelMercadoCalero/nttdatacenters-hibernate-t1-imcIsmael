package nttdatacentershibernatet1imcIsmael.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 
 * Entidad de tabla NTTDATA_HEX_CONTRACT
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
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	/** Nombre del cliente */
	@Column(name = "name")
	private String name;

	/** Primer apellido del cliente */
	@Column(name = "first_surname", unique = true, nullable = false)
	private String first_surname;

	/** Segundo apellido del cliente */
	@Column(name = "second_surname")
	private String second_surname;
//AÑADIR VALIDACIONES
	/** DNI del cliente */
	@Column(name = "DNI", unique = true, nullable = false, length = 9)
	private String DNI;
}

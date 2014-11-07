package com.formation.banque.model.entity;

/**
 * The Class Argent.
 */
public class Argent {

	/** The id. */
	private Integer id;

	/** The somme. */
	private Integer somme;

	/**
	 * Instantiates a new argent.
	 *
	 * @param id
	 *            the id
	 * @param somme
	 *            the somme
	 */
	public Argent(Integer id, Integer somme) {
		super();
		this.id = id;
		this.somme = somme;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Gets the somme.
	 *
	 * @return the somme
	 */
	public Integer getSomme() {
		return somme;
	}

	/**
	 * Sets the somme.
	 *
	 * @param somme
	 *            the new somme
	 */
	public void setSomme(Integer somme) {
		this.somme = somme;
	}

}

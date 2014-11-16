package com.formation.banque.model.entity;

public abstract class Argent {

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	abstract public Integer getId();

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	abstract public void setId(Integer id);

	/**
	 * Gets the somme.
	 *
	 * @return the somme
	 */
	abstract public Integer getSomme();

	/**
	 * Sets the somme.
	 *
	 * @param somme
	 *            the new somme
	 */
	abstract public void setSomme(Integer somme);
}

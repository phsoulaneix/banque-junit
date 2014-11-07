package com.formation.banque.model.service;

import com.formation.banque.model.entity.Argent;
import com.formation.banque.model.entity.Client;
import com.formation.banque.model.entity.Compte;

/**
 * The Interface BanqueManager.
 */
public interface BanqueManager {

	/**
	 * Adds the client.
	 *
	 * @param client
	 *            the client
	 * @return if client existe
	 */
	public Boolean addClient(Client client);

	/**
	 * Removes the client.
	 *
	 * @param client
	 *            the client
	 * @return the boolean
	 */
	public Boolean removeClient(Client client);

	/**
	 * Adds the compte.
	 *
	 * @param client
	 *            the client
	 * @param compte
	 *            the compte
	 */
	public void addCompte(Client client, Compte compte);

	/**
	 * Removes the compte.
	 *
	 * @param client
	 *            the client
	 * @param compte
	 *            the compte
	 * @return the boolean
	 */
	public Boolean removeCompte(Client client, Compte compte);

	/**
	 * Adds the argent.
	 *
	 * @param client
	 *            the client
	 * @param compte
	 *            the compte
	 * @param argent
	 *            the argent
	 */
	public void addArgent(Client client, Compte compte, Argent argent);

	/**
	 * Retrieve argent.
	 *
	 * @param client
	 *            the client
	 * @param compte
	 *            the compte
	 * @param argent
	 *            the argent
	 * @throws DecouvertException
	 *             the decouvert exception
	 */
	public void retrieveArgent(Client client, Compte compte, Argent argent)
			throws DecouvertException;

}

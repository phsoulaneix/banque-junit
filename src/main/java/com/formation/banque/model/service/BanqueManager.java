package com.formation.banque.model.service;

import com.formation.banque.model.entity.memory.ArgentMemory;
import com.formation.banque.model.entity.memory.ClientMemory;
import com.formation.banque.model.entity.memory.CompteMemory;

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
	public Boolean addClient(ClientMemory client);

	/**
	 * Removes the client.
	 *
	 * @param client
	 *            the client
	 * @return the boolean
	 */
	public Boolean removeClient(ClientMemory client);

	/**
	 * Adds the compte.
	 *
	 * @param client
	 *            the client
	 * @param compte
	 *            the compte
	 */
	public void addCompte(ClientMemory client, CompteMemory compte);

	/**
	 * Removes the compte.
	 *
	 * @param client
	 *            the client
	 * @param compte
	 *            the compte
	 * @return the boolean
	 */
	public Boolean removeCompte(ClientMemory client, CompteMemory compte);

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
	public void addArgent(ClientMemory client, CompteMemory compte, ArgentMemory argent);

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
	public void retrieveArgent(ClientMemory client, CompteMemory compte, ArgentMemory argent)
			throws DecouvertException;

}

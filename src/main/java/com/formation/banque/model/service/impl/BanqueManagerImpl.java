package com.formation.banque.model.service.impl;

import java.sql.SQLException;

import com.formation.banque.model.dao.ArgentDAO;
import com.formation.banque.model.dao.ClientDAO;
import com.formation.banque.model.dao.CompteDAO;
import com.formation.banque.model.entity.memory.ArgentMemory;
import com.formation.banque.model.entity.memory.ClientMemory;
import com.formation.banque.model.entity.memory.CompteMemory;
import com.formation.banque.model.service.BanqueManager;
import com.formation.banque.model.service.DecouvertException;

public class BanqueManagerImpl implements BanqueManager {

	private final ClientDAO clientDao;

	private final CompteDAO compteDao;

	private final ArgentDAO argentDao;

	public BanqueManagerImpl(ClientDAO clientDao, CompteDAO compteDao,
			ArgentDAO argentDao) {
		super();
		this.clientDao = clientDao;
		this.compteDao = compteDao;
		this.argentDao = argentDao;
	}

	@Override
	public Boolean addClient(ClientMemory client) {
		try {
			return clientDao.create(client);
		} catch (final SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public Boolean removeClient(ClientMemory client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCompte(ClientMemory client, CompteMemory compte) {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean removeCompte(ClientMemory client, CompteMemory compte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addArgent(ClientMemory client, CompteMemory compte, ArgentMemory argent) {
		// TODO Auto-generated method stub

	}

	@Override
	public void retrieveArgent(ClientMemory client, CompteMemory compte, ArgentMemory argent)
			throws DecouvertException {
		// TODO Auto-generated method stub

	}

}

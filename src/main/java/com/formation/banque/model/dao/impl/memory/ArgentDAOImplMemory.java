package com.formation.banque.model.dao.impl.memory;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.formation.banque.model.dao.ArgentDAO;
import com.formation.banque.model.entity.Argent;

/**
 * The Class ArgentDAOImplMemory.
 */
public class ArgentDAOImplMemory implements ArgentDAO {

	/** The argents. */
	private final Map<Integer, Argent> argents = new HashMap<Integer, Argent>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.formation.banque.model.dao.DAO#create(java.lang.Object)
	 */
	@Override
	public boolean create(Argent obj) throws SQLException {
		if (obj.getId() == null || obj.getSomme() == null) {
			return false;
		}
		if (argents.containsKey(obj.getId())) {
			return false;
		}
		argents.put(obj.getId(), obj);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.formation.banque.model.dao.DAO#delete(java.lang.Object)
	 */
	@Override
	public boolean delete(Argent obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.formation.banque.model.dao.DAO#update(java.lang.Object)
	 */
	@Override
	public boolean update(Argent obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.formation.banque.model.dao.DAO#find(java.lang.Integer)
	 */
	@Override
	public Argent find(Integer id) throws SQLException {
		if (!argents.containsKey(id)) {
			throw new SQLException();
		}
		return argents.get(id);
	}

}

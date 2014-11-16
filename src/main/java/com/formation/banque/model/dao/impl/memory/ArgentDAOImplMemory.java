package com.formation.banque.model.dao.impl.memory;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.formation.banque.model.dao.ArgentDAO;
import com.formation.banque.model.entity.memory.ArgentMemory;

/**
 * The Class ArgentDAOImplMemory.
 */
public class ArgentDAOImplMemory implements ArgentDAO {

	/** The argents. */
	private final Map<Integer, ArgentMemory> argents = new HashMap<Integer, ArgentMemory>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.formation.banque.model.dao.DAO#create(java.lang.Object)
	 */
	@Override
	public boolean create(ArgentMemory obj) throws SQLException {
		if (obj.getId() == null || obj.getSomme() == null) {
			return Boolean.FALSE;
		}
		if (argents.containsKey(obj.getId())) {
			return Boolean.FALSE;
		}
		argents.put(obj.getId(), obj);
		return Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.formation.banque.model.dao.DAO#delete(java.lang.Object)
	 */
	@Override
	public boolean delete(ArgentMemory obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.formation.banque.model.dao.DAO#update(java.lang.Object)
	 */
	@Override
	public boolean update(ArgentMemory obj) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.formation.banque.model.dao.DAO#find(java.lang.Integer)
	 */
	@Override
	public ArgentMemory find(Integer id) throws SQLException {
		if (!argents.containsKey(id)) {
			throw new SQLException();
		}
		return argents.get(id);
	}

}

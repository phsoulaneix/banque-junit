package com.formation.banque.model.dao.impl.memory;

import static org.junit.Assert.fail;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.formation.banque.model.dao.ArgentDAO;
import com.formation.banque.model.entity.Argent;

/**
 * The Class ArgentDAOImplMemoryTest.
 */
public class ArgentDAOImplMemoryTest {

	/**
	 * Sets the up.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test create.
	 */
	@Test
	public void testCreate() {
		final ArgentDAO argentDAO = new ArgentDAOImplMemory();
		try {
			argentDAO.create(new Argent(1, 10));
		} catch (final SQLException e) {
			fail("Création impossible");
		}

		try {
			argentDAO.create(new Argent(null, 10));
		} catch (final SQLException e) {
			fail("Création impossible");
		}

		try {
			argentDAO.create(new Argent(1, null));
		} catch (final SQLException e) {
			fail("Création impossible");
		}
	}

	/**
	 * Test delete.
	 */
	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	/**
	 * Test update.
	 */
	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	/**
	 * Test find.
	 */
	@Test
	public void testFind() {
		fail("Not yet implemented");
	}

	/**
	 * Test equals.
	 */
	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

}

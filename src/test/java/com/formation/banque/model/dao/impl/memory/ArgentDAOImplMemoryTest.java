package com.formation.banque.model.dao.impl.memory;

import static org.junit.Assert.fail;

import java.sql.SQLException;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.formation.banque.model.dao.ArgentDAO;
import com.formation.banque.model.entity.memory.ArgentMemory;

/**
 * The Class ArgentDAOImplMemoryTest.
 */
@RunWith(JUnit4.class)
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
			Assert.assertTrue(argentDAO.create(new ArgentMemory(1, 10)));
			Assert.assertFalse(argentDAO.create(new ArgentMemory(null, 10)));
			Assert.assertFalse(argentDAO.create(new ArgentMemory(1, null)));
			Assert.assertFalse(argentDAO.create(new ArgentMemory(null, null)));
		} catch (final SQLException e1) {
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

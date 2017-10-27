package com.rest.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserServiceImplTest {
	
	
	private  UserService userSerive;

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaveUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteUserById() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllUsers() {
		assertEquals(3, userSerive.findAllUsers().size());
	}

	@Test
	public void testDeleteAllUsers() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsUserExist() {
		fail("Not yet implemented");
	}

}

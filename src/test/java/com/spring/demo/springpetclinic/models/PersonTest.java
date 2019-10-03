package com.spring.demo.springpetclinic.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
	@Test
	void shouldReturnPersonFirstName() {
		Person person = new Person();
		person.setFirstName("first name");

		assertEquals("first name", person.getFirstName());
	}

	@Test
	void shouldReturnPersonLastName() {
		Person person = new Person();
		person.setLastName("last name");

		assertEquals("last name", person.getLastName());
	}
}
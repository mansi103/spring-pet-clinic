package com.spring.demo.springpetclinic.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PetTypeTest {
	@Test
	void shouldReturnPetType() {
		PetType petType = new PetType();
		petType.setName("A Pet Type");

		assertEquals("A Pet Type", petType.getName());
	}
}
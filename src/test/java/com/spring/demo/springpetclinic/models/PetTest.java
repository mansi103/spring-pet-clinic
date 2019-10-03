package com.spring.demo.springpetclinic.models;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {
	@Test
	void shouldReturnPetType() {
		PetType petType = new PetType();
		petType.setName("Dog");

		Pet pet = new Pet();
		pet.setPetType(petType);

		assertEquals(petType, pet.getPetType());
	}

	@Test
	void shouldReturnPetOwner() {
		Owner owner = new Owner();
		owner.setFirstName("FirstName");
		owner.setLastName("LastName");

		Pet pet = new Pet();
		pet.setOwner(owner);

		assertEquals(owner, pet.getOwner());
	}

	@Test
	void shouldReturnPetBirthDate() {
		Pet pet = new Pet();
		pet.setBirthDate(LocalDate.of(2019, 10, 3));

		assertEquals(3, pet.getBirthDate().getDayOfMonth());
		assertEquals(Month.OCTOBER, pet.getBirthDate().getMonth());
		assertEquals(2019, pet.getBirthDate().getYear());
	}
}
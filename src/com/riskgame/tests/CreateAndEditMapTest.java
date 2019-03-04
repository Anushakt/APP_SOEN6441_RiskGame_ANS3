package com.riskgame.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import com.riskgame.service.CreateAndEditMap;
import com.riskgame.model.Continent;

public class CreateAndEditMapTest {
	CreateAndEditMap createAndEditMap; 
	Continent continent1, continent2, continent3;
	ArrayList<Continent> listofContinents = new ArrayList<Continent>();
	
	public CreateAndEditMapTest() {
		createAndEditMap = new CreateAndEditMap();
		
		continent1 = new Continent();
		continent1.setName("Asia");
		listofContinents.add(continent1);
		
		continent2 = new Continent();
		continent2.setName("Africa");
		listofContinents.add(continent2);
		
		continent3 = new Continent();
		continent3.setName("North America");
		listofContinents.add(continent3);
		
		createAndEditMap.setListOfContinents(listofContinents);
		
	}
	
	@Test
	public void isContinentInContinentList() {
		assertTrue(createAndEditMap.alreadyDefinedContinent("North America"));
	}

	@Test
	public void isContinentNotInContinentList() {
		assertFalse(createAndEditMap.alreadyDefinedContinent("Europe"));
	}
}
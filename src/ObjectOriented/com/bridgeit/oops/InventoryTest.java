package com.bridgeit.oops;


import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

public class InventoryTest {
	
	static Meal meal[];
	public static void main(String[] args) throws JsonProcessingException, IOException {
		
		ObjectMapper mapper=new ObjectMapper();
		File file=new File("D:\\Users\\ADMIN\\eclipse-workspace\\Oops\\src\\Data.json");
		JsonNode node=mapper.readTree(file);
		JsonNode node1=node.get("rice");
		meal=mapper.readValue(node1, Meal[].class);
		System.out.println("-----------Rice------------------------------");
		for(Meal meal1:meal)
		{
			System.out.println(meal1);
		}
		System.out.println("-----------Pulses------------------------");
		node1=node.get("pulses");
		meal=mapper.readValue(node1, Meal[].class);
		for(Meal pulses:meal)
		{
			System.out.println(pulses);
		}
		
		System.out.println("-----------Wheats------------------------");
		node1=node.get("wheats");
		meal=mapper.readValue(node1, Meal[].class);
		for(Meal wheats:meal)
		{
			System.out.println(wheats);
		}
		
	}
}
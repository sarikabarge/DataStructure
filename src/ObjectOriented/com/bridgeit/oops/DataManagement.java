package com.bridgeit.oops;


import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;


public class DataManagement
{
   public static void main(String[] args) 
   {
	   String filePath="D:\\Users\\ADMIN\\eclipse-workspace\\Oops\\src\\com\\bridgeit\\jsonfile\\datamanagement.json";
	   File file =new File(filePath);
	   ObjectMapper mapper=new ObjectMapper();
	   try
	   {
		JsonNode node=mapper.readTree(file);
		JsonNode rice=node.get("Rice");
		System.out.println("================= Rice Details ====================");
		for(JsonNode data:rice)
		{
			String name=data.path("Name").asText();
			int weight=data.path("Weight").asInt();
			int price=data.path("Price").asInt();
			System.out.println(" Name : "+name+"\n Price : "+price+"\n Weight : "+weight );
			System.out.println(" Total Price : "+price*weight +" Rs \n");
		}
		JsonNode node2=mapper.readTree(file);
		JsonNode pulses=node2.get("Pulses");
		System.out.println("================= Pulses Details ====================");
		for(JsonNode data:pulses)
		{
			String name=data.path("Name").asText();
			int weight=data.path("Weight").asInt();
			int price=data.path("Price").asInt();
			System.out.println(" Name : "+name+"\n Price : "+price+"\n Weight : "+weight );
			System.out.println(" Total Price : "+price*weight +" Rs \n");
		}
		JsonNode node3=mapper.readTree(file);
		JsonNode wheats=node3.get("Rice");
		System.out.println("================= Wheats Details ====================");
		for(JsonNode data:wheats)
		{
			String name=data.path("Name").asText();
			int weight=data.path("Weight").asInt();
			int price=data.path("Price").asInt();
			System.out.println(" Name : "+name+"\n Price : "+price+"\n Weight : "+weight );
			System.out.println(" Total Price : "+price*weight +" Rs \n");
		}
	   } 
	   catch (IOException e)
	   {		
		System.err.println("Please Give Valid File Details");
	   }
	   
   }
}

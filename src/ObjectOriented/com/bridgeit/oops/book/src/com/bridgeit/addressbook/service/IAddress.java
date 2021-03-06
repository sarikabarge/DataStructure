package com.bridgeit.addressbook.service;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgeit.addressbook.module.Person;

public interface IAddress 

{
	ObjectMapper objectmapper =new ObjectMapper();
	public static File getPathOfFile(String fileName, String fileExtension)
	{
		fileName = "/home/user/eclipse-workspace/book/"
				+ fileName + fileExtension;
		
		File file = new File(fileName);
		
		return file;
	}
	public static void saveFile(File file)
	{
		List<Person> updatedList =FileSystem.getList();
		try {
			objectmapper.writerWithDefaultPrettyPrinter().writeValue(file, updatedList);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void readFile(File file)
	{
		try 
		{
       FileSystem.setList(objectmapper.readValue(file, new TypeReference<List<Person>>() {}));
		} 
		catch (IOException e) 
		{
			System.out.println("\nFile Not Found!\n");
		}
	}
	
}


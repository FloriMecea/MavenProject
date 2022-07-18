package curs14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonProcessor {
   public void writeJson() {
	   
	   /* model json
	    * {
	    * "cheie": valoare
	    * 'alta cheie' :{
	    *       obj1: ceva
	    *       obj2: ceva
	    * }
	    * 
	    * }
	    */
	   
	   
	   JSONObject obj=new JSONObject();
	   obj.put("name", "TestUser");
	   obj.put("email", "TestUser@test.com");
	   
	   JSONArray list= new JSONArray();
	   list.add("Obiect1");
	   list.add("Obiect2");
	   list.add("Obiect3");
	   list.add("Obiect4");
	   list.add("Obiect5");
	   
	   obj.put("listaDeObiecte", list);
	   
	   
	   try(FileWriter file= new FileWriter("test.json")){
		   file.write(obj.toJSONString());
		   
	   }catch (IOException e) {
		   e.printStackTrace();
	   }
	   
   } 
	
	public void readJSON(String key) {
		
	JSONParser parser = new JSONParser();	
	try{
		FileReader reader = new FileReader ("test.json");
		JSONObject jsonObj= (JSONObject) parser.parse(reader);
		System.out.println(jsonObj);
		
		String obiect= (String) jsonObj.get(key);
		
		System.out.println("key:"+obiect);
		
		JSONArray obj1=(JSONArray) jsonObj.get("listaDeObiecte");
		System.out.println("Json Array: " +obj1);
	}catch(Exception e) {
		
	}
		
	}
	
	public void updateJsonFile(String key, String value) throws FileNotFoundException, IOException, ParseException {
		JSONParser jsonParser = new JSONParser();

		
		try(FileReader reader= new FileReader("test.json")){ //try with resources -nu mai inchid eu resursa

			JSONObject jsonObject= (JSONObject) jsonParser.parse(reader);
			System.out.println("------------");
			System.out.println("JSONObject este:"+jsonObject);
			jsonObject.put(key,value);
		
		
		  try {
			FileWriter file = new FileWriter("test.json");
			file.write(jsonObject.toJSONString());
			file.close();
		   } catch(Exception e) {}
	}

   }
	
	public void deleteJsonFile(String key) throws FileNotFoundException, IOException, ParseException {
		JSONParser jsonParser = new JSONParser();

		
		try(FileReader reader= new FileReader("test.json")){ //try with resources -nu mai inchid eu resursa

			JSONObject jsonObject= (JSONObject) jsonParser.parse(reader);
			System.out.println("------------");
			System.out.println("JSONObject este:"+jsonObject);
			jsonObject.remove(key);
		
		
		  try {
			FileWriter file = new FileWriter("test.json");
			file.write(jsonObject.toJSONString());
			file.close();
		   } catch(Exception e) {}
	}

   }
	
}

package curs14;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

public class TestJsonProcessor {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JsonProcessor obj= new JsonProcessor();
		
		obj.writeJson();
		
		obj.readJSON("email");
        obj.updateJsonFile("email", "altemail.com"); //dc cheia exista o suprascrie , dc nu o adauga
        obj.updateJsonFile("email2", "altemail2.com"); 
        obj.readJSON("email");
        obj.readJSON("email2");
        
        System.out.println("-----------stergere-------------------");
        obj.readJSON("name");
        obj.deleteJsonFile("name");
        obj.readJSON("name");
        obj.updateJsonFile("name2", "TestUser2"); 
        obj.readJSON("name2");
        
	}
	
	
	/*
	 * git init - creaza un repozitory pe local, o rulam doar o data
	 * cream fisier .gitignore
	 * git add . -> adauga tot (git add file ....)
	 * git commit -m "initial commit"
	 * 
	 *  git status -> on branch master, ....
	 *  git remote add origin https://github.com/FloriMecea/MavenProject.git
	 * leaga repozitoriul local git cu cel remote care are linkul de mai sus
	 * 
	 * git pull - doar dc sunt mai multi pe acelasi repozitory
	 * git push origin master - adaugam pe remote
	 */

}

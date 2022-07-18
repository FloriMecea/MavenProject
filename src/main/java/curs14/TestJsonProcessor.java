package curs14;

public class TestJsonProcessor {

	public static void main(String[] args) {
		JsonProcessor obj= new JsonProcessor();
		
		obj.writeJson();
		
		obj.readJSON("email");

	}
	
	
	/*
	 * git init - creaza un repozitory pe local, o rulam doar o data
	 * cream fisier .gitignore
	 * git add . -> adauga tot (git add file ....)
	 * git commit -m "initial commit"
	 * 
	 *  git status -> on branch master, ....
	 *  git remote add origin https://github.com/FloriMecea/MavenProject.git
	 * leaga repozitoriul local cu cel remote
	 * 
	 * git pull - doar dc sunt mai multi pe acelasi repozitory
	 * git push origin master - adaugam pe remote
	 */

}

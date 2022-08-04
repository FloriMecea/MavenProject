package curs20;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoExample {
	
	//connect to Mongo
	public static MongoClient connectToMongo() {
		
		try {
			
			ConnectionString connectionString =new ConnectionString("mongodb+srv://testuser:testuser@cluster0.bkai1.mongodb.net/sample_analytics?retryWrites=true&w=majority");
			MongoClientSettings setting= MongoClientSettings.builder()
					.applyConnectionString(connectionString)
					.serverApi(ServerApi.builder().version(ServerApiVersion.V1).build())
					.build();
			
			
			MongoClient mongoClient= MongoClients.create(setting);
			return mongoClient;
			
			
		}catch(MongoException e) {
			System.out.println("Could not make a connection");
		}
		
		return null;

	}
	
	//close mongo collection
	
	public static void closeConnection(MongoClient mongoClient) {
		
		try {
			System.out.println("trying to close the connection to DB!");
		    mongoClient.close();
		    System.out.println("Successfully closed the connection to DB!");
			
		}catch (MongoException e) {
			System.out.println("Could not establish a connection to DB!");
		}
	}
	
	public static void createMongoCollection (MongoDatabase db, String collectionName) {
		try {
			System.out.println("trying to create the connection to DB!");
		    db.createCollection(collectionName);
		    System.out.println("Successfully created the connection to DB!");
			
		}catch (MongoException e) {
			System.out.println("Could not create new connection to DB!");
		}
	}
	
	public static void main(String[] args) {
		
		MongoClient mongoClient= connectToMongo();
		MongoDatabase databaseSampleAnalytics= mongoClient.getDatabase("sample_analytics");
	
		createMongoCollection(databaseSampleAnalytics,"test_flori");
		
	    for (String name: databaseSampleAnalytics.listCollectionNames()) {
	    	System.out.println("Colection name: "+name);
	    }
	    
	 //   databaseSampleAnalytics.createCollection("test_flori");
	    closeConnection(mongoClient);
	    
	}
}

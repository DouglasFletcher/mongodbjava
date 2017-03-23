package crudpackage;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

import user.User;


public class AppMain {

	public static void main(String[] args) {

		// create dao to mongo client
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
		MongoDatabase list = mongoClient.getDatabase("testExample");

		// create user
		User user = new User(1, "john smith", "engineer");
		
		
		
		
		
		
		
		
		
	}

}

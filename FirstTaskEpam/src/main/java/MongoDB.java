import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;

public class MongoDB {
    public static void main(String[] args) {
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        for (Document document : mongoClient.listDatabases()) {
            System.out.println("Database: " + document);
        }
    }
}

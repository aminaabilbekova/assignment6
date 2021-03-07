package Assignment6;

public class Database {

    //private instance accessed only by getInstance() method
    private static Database instance;
    // private constructor
    private Database(){
        System.out.println("Singleton");
    }
    //method to return instance of class
    public static Database getInstance() {
        if (Database.instance == null){
            Database.instance = new Database();
        }
        return Database.instance;
    }
}

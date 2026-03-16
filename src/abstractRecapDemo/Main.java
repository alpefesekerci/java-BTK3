package abstractRecapDemo;

public class Main {
    public void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new SqlServerDatabaseManager();
        customerManager.getCustomer();
    }
}

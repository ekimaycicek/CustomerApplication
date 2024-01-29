import java.util.ArrayList;

public class CustomerManagement {

    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();

        Customer customer1 = new Customer("Ekim", "Aycicek", "ekim@gmail.com");
        Customer customer2 = new Customer("Ali Can", "Canyakan", "alican@gmail.com");
        Customer customer3 = new Customer("Mehmet", "Kaya", "mehmet@gmail.com");














        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);

        for (Customer customer :customerList ) {
            System.out.println("Name: " + customer.getName());
            System.out.println("Surname: " + customer.getSurname());
            System.out.println("Email: " + customer.getEmail());
            System.out.println();
        }
    }
}

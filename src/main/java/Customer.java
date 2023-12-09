public class Customer {

    /*
Müşteri yönetim uygulaması ile müşterilerin adını, soyadını ve e-posta adresini
takip etmeniz gerekiyor.
 */





    private String name;
    private String surname;
    private String email;









    public Customer(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }


}

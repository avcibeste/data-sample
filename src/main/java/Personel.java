// Personel.java dosyası

// Personel sınıfının tanımlanması
public class Personel {
    // Personelin özelliklerini temsil eden değişkenlerin tanımlanması
    public String name;
    public int age;
    public String position;
    public String department;
    public String email;
    public String phoneNumber;
    public Adres address;
    public String startDate;

    // Adres sınıfının tanımlanması
    public static class Adres {
        public String street;
        public String city;
        public String state;
        public String postcode;
    }

    // Ana metot (main method) tanımlaması
    public static void main(String[] args) {
        // Personel nesnesinin oluşturulması ve özelliklerinin atanması
        Personel personel = new Personel();
        personel.name = "Beste Avcı";
        personel.age = 28;
        personel.position = "Software Test Engineer";
        personel.department = "MBTT";
        personel.email = "beste@test.com";
        personel.phoneNumber = "1111111";

        // Adres nesnesinin oluşturulması ve özelliklerinin atanması
        personel.address = new Adres();
        personel.address.street = "Cumhuriyet Caddesi";
        personel.address.city = "Aydın";
        personel.address.state = "Kuşadası";
        personel.address.postcode = "09400";

        personel.startDate = "2021-01-21";

        // Personel bilgilerinin yazdırılması
        System.out.println("Personel:");
        System.out.println("  Name: " + personel.name);
        System.out.println("  Age: " + personel.age);
        System.out.println("  Position: " + personel.position);
        System.out.println("  Department: " + personel.department);
        System.out.println("  Email: " + personel.email);
        System.out.println("  Phonenumber: " + personel.phoneNumber);
        System.out.println("  Address:");
        System.out.println("    Street: " + personel.address.street);
        System.out.println("    City: " + personel.address.city);
        System.out.println("    State: " + personel.address.state);
        System.out.println("    Postcode: " + personel.address.postcode);
        System.out.println("  Startdate: " + personel.startDate);
    }
}

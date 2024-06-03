public class IK {
    public static void main(String[] args) {
        Departman itDepartmani = new Departman("IT Department");

        // İlk personel oluşturulması
        Personel personel1 = new Personel();
        personel1.name = "Beste Avcı";
        personel1.age = 28;
        personel1.position = "Software Test Engineer";
        personel1.department = "MBTT";
        personel1.email = "beste@test.com";
        personel1.phoneNumber = "1111111";
        personel1.address = new Personel.Adres();
        personel1.address.street = "Cumhuriyet Caddesi";
        personel1.address.city = "Aydın";
        personel1.address.state = "Kuşadası";
        personel1.address.postcode = "09400";
        personel1.startDate = "2021-01-21";

        // İkinci personel oluşturulması
        Personel personel2 = new Personel();
        personel2.name = "Ali Veli";
        personel2.age = 30;
        personel2.position = "Backend Developer";
        personel2.department = "IT";
        personel2.email = "ali@test.com";
        personel2.phoneNumber = "2222222";
        personel2.address = new Personel.Adres();
        personel2.address.street = "Atatürk Bulvarı";
        personel2.address.city = "İzmir";
        personel2.address.state = "Konak";
        personel2.address.postcode = "35000";
        personel2.startDate = "2020-05-15";

        // Personellerin departmana eklenmesi
        itDepartmani.addPersonel(personel1);
        itDepartmani.addPersonel(personel2);

        // Departman ve personel bilgilerinin yazdırılması
        System.out.println("Department: " + itDepartmani.getDepartmentName());
        System.out.println("Personeller:");
        for (Personel personel : itDepartmani.getPersoneller()) {
            System.out.println("  Name: " + personel.name);
            System.out.println("  Age: " + personel.age);
            System.out.println("  Position: " + personel.position);
            System.out.println("  Department: " + personel.department);
            System.out.println("  Email: " + personel.email);
            System.out.println("  PhoneNumber: " + personel.phoneNumber);
            System.out.println("  Address:");
            System.out.println("    Street: " + personel.address.street);
            System.out.println("    City: " + personel.address.city);
            System.out.println("    State: " + personel.address.state);
            System.out.println("    Postcode: " + personel.address.postcode);
            System.out.println("  StartDate: " + personel.startDate);
            System.out.println();
        }
    }
}

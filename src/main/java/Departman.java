import java.util.ArrayList;
import java.util.List;

public class Departman {
    private String departmentName;
    private List<Personel> personeller;

    public Departman(String departmentName) {
        this.departmentName = departmentName;
        this.personeller = new ArrayList<>();
    }

    public void addPersonel(Personel personel) {
        this.personeller.add(personel);
    }

    public List<Personel> getPersoneller() {
        return personeller;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}

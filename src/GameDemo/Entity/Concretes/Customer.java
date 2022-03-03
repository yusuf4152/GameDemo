package GameDemo.Entity.Concretes;
import GameDemo.Entity.Abstracts.IEntity;
public class Customer implements IEntity {
    private final String nationalityID;
    private final String name;
    private final String lastName;
    private final int birthYear;

    public Customer(String nationalityID, String name, String lastName, int birthYear) {
        this.nationalityID=nationalityID;
        this.name=name;
        this.lastName=lastName;
        this.birthYear=birthYear;
    }

    public String getNationalityID() {
        return nationalityID;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }
}

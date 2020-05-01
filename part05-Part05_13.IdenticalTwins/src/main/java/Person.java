
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Person)) {
            return false;
        }
        
        Person o = (Person) compared;
        
        if(this.birthday.equals(o.birthday) &&
           this.name.equals(o.name) && 
           this.height == o.height &&
           this.weight == o.weight){
            return true;
        }
        
        return false;
    }

}

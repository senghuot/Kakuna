package senghout.github.com.atomizer.model;

import org.springframework.data.annotation.Id;

public class Zoo {
    @Id
    public String Id;
    public long low;
    public long high;


    @Override
    public String toString() {
        return "Zoo{" +
                "Id='" + Id + '\'' +
                ", low=" + low +
                ", high=" + high +
                '}';
    }
}
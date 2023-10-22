package utn.students.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
// The Boilerplate
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idstudents;
    private String name;
    private String lastname;
    private String phone;
    private String email;
}

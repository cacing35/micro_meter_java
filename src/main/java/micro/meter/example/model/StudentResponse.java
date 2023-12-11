package micro.meter.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentResponse implements Serializable {

    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private String classRoom;

}

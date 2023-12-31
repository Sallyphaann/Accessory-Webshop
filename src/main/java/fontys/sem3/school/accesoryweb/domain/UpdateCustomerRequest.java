package fontys.sem3.school.accesoryweb.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCustomerRequest {
    private Long id;
    private String firstname;
    private String lastname;
    private String address;
    private String phoneNumber;

}

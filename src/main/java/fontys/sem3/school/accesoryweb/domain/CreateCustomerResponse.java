package fontys.sem3.school.accesoryweb.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateCustomerResponse {
    private Long customerId;
}

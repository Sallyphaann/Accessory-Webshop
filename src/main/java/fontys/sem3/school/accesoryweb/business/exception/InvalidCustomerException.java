package fontys.sem3.school.accesoryweb.business.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class InvalidCustomerException extends ResponseStatusException {
    public InvalidCustomerException(String errorCode) {
        super(HttpStatus.BAD_REQUEST, errorCode);}
}

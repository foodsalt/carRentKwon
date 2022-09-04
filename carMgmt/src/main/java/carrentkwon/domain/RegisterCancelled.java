package carrentkwon.domain;

import carrentkwon.domain.*;
import carrentkwon.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class RegisterCancelled extends AbstractEvent {

    private Long carId;
    private Boolean status;

    public RegisterCancelled(CarMgmt aggregate) {
        super(aggregate);
    }

    public RegisterCancelled() {
        super();
    }
    // keep

}

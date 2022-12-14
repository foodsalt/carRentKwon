package carrentkwon.domain;

import carrentkwon.domain.*;
import carrentkwon.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Returned extends AbstractEvent {

    private Long rentId;
    private String rentStatus;
    private Long carId;

    public Returned(CarRent aggregate) {
        super(aggregate);
    }

    public Returned() {
        super();
    }
    // keep

}

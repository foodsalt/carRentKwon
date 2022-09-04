package carrentkwon.domain;

import carrentkwon.domain.*;
import carrentkwon.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ReserveCancelled extends AbstractEvent {

    private Long rentId;
    private String rentStatus;
    private Long carId;
    // keep

}

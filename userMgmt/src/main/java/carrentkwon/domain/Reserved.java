package carrentkwon.domain;

import carrentkwon.domain.*;
import carrentkwon.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Reserved extends AbstractEvent {

    private Long rentId;
    private Long carId;
    private Long userId;
    private Date rentStartDate;
    private Date rentEndDate;
    private Date regDate;
    // keep

}

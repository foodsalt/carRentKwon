package carrentkwon.domain;

import carrentkwon.domain.*;
import carrentkwon.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class MileageUpdated extends AbstractEvent {

    private Long userId;
    private Double mileagePoint;

    public MileageUpdated(MemberMgmt aggregate) {
        super(aggregate);
    }

    public MileageUpdated() {
        super();
    }
    // keep

}

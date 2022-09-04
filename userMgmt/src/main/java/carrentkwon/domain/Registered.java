package carrentkwon.domain;

import carrentkwon.domain.*;
import carrentkwon.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Registered extends AbstractEvent {

    private Long userId;
    private String userName;
    private Date birthDate;
    private Date phoneNo;
    private Integer age;

    public Registered(MemberMgmt aggregate) {
        super(aggregate);
    }

    public Registered() {
        super();
    }
    // keep

}

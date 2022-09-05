package carrentkwon.domain;

import carrentkwon.UserMgmtApplication;
import carrentkwon.domain.MileageUpdated;
import carrentkwon.domain.Registered;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "MemberMgmt_table")
@Data
public class MemberMgmt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String userName;

    private Date birthDate;

    private Date phoneNo;

    private Integer age;

    private Double mileagePoint;

    @PostPersist
    public void onPostPersist() {
        Registered registered = new Registered(this);
        registered.publishAfterCommit();

        MileageUpdated mileageUpdated = new MileageUpdated(this);
        mileageUpdated.publishAfterCommit();
    }

    public static MemberMgmtRepository repository() {
        MemberMgmtRepository memberMgmtRepository = UserMgmtApplication.applicationContext.getBean(
            MemberMgmtRepository.class
        );
        return memberMgmtRepository;
    }

    public void registration() {
        PersonalInformationRegistered personalInformationRegistered = new PersonalInformationRegistered(
            this
        );
        personalInformationRegistered.publishAfterCommit();
    }

    public static void mileageUpdate(Reserved reserved) {
        /** Example 1:  new item */
        MemberMgmt memberMgmt = new MemberMgmt();
        memberMgmt.setUserId(reserved.getUserId());
        System.out.println(
            "\n\n##### listener memberMgmt : " + memberMgmt + "\n\n"
        );
        repository().save(memberMgmt);

        MileageUpdated mileageUpdated = new MileageUpdated(memberMgmt);
        mileageUpdated.setUserId(reserved.getUserId());
        System.out.println(
            "\n\n##### listener mileageUpdated : " + mileageUpdated + "\n\n"
        );
        mileageUpdated.publishAfterCommit();
        

        /** Example 2:  finding and process
        
        repository().findById(reserved.get???()).ifPresent(memberMgmt->{
            
            memberMgmt // do something
            repository().save(memberMgmt);

            MileageUpdated mileageUpdated = new MileageUpdated(memberMgmt);
            mileageUpdated.publishAfterCommit();

         });
        */

    }
}

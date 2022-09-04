package carrentkwon.domain;

import carrentkwon.CarMgmtApplication;
import carrentkwon.domain.Registered;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "CarMgmt_table")
@Data
public class CarMgmt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long carId;

    private String model;

    private String type;

    private Date regStartDate;

    private Date regEndDate;

    private Boolean status;

    @PostPersist
    public void onPostPersist() {
        Registered registered = new Registered(this);
        registered.publishAfterCommit();
    }

    public static CarMgmtRepository repository() {
        CarMgmtRepository carMgmtRepository = CarMgmtApplication.applicationContext.getBean(
            CarMgmtRepository.class
        );
        return carMgmtRepository;
    }

    public void registerCancel() {
        RegisterCancelled registerCancelled = new RegisterCancelled(this);
        registerCancelled.publishAfterCommit();
    }

    public static void carStatusChange(Reserved reserved) {
        /** Example 1:  new item */
        CarMgmt carMgmt = new CarMgmt();
        carMgmt.setCarId(reserved.getCarId());
        carMgmt.setStatus(false);
        repository().save(carMgmt);

        

        /** Example 2:  finding and process 
        
        repository().findByCarId(reserved.getCarId()).forEach(carMgmt->{
            // carMgmt // do something
            CarMgmt carMgmt = new CarMgmt();
            carMgmt.setCarId(reserved.getCarId());
            carMgmt.setStatus(false);
            System.out.println(
                "\n\n##### listener CarStatusChange reserved : " + carMgmt + "\n\n"
            );
    
            repository().update(carMgmt);
         });
       */

    }

    public static void carStatusChange(Rented rented) {
        /** Example 1:  new item */
        CarMgmt carMgmt = new CarMgmt();
        carMgmt.setCarId(rented.getCarId());
        carMgmt.setStatus(false);        
        repository().save(carMgmt);

        

        /** Example 2:  finding and process 
         *        
        repository().findByCarId(rented.getCarId()).forEach(carMgmt->{
            // carMgmt // do something
            CarMgmt carMgmt = new CarMgmt();
            carMgmt.setCarId(rented.getCarId());
            carMgmt.setStatus(true);
            System.out.println(
                "\n\n##### listener CarStatusChange rented : " + carMgmt + "\n\n"
            );
    
            repository().update(carMgmt);
         });
         */

    }

    public static void carStatusChange(Returned returned) {
        /** Example 1:  new item */
        CarMgmt carMgmt = new CarMgmt();
        carMgmt.setCarId(returned.getCarId());
        carMgmt.setStatus(false);        
        repository().save(carMgmt);

        

        /** Example 2:  finding and process 
        
        repository().findByCarId(returned.getCarId()).forEach(carMgmt->{
            // carMgmt // do something
            CarMgmt carMgmt = new CarMgmt();
            carMgmt.setCarId(returned.getCarId());
            carMgmt.setStatus(true);
            System.out.println(
                "\n\n##### listener CarStatusChange returned : " + carMgmt + "\n\n"
            );
    
            repository().update(carMgmt);
         });
         */

    }

    public static void carStatusChange(ReserveCancelled reserveCancelled) {
        /** Example 1:  new item */
        CarMgmt carMgmt = new CarMgmt();
        carMgmt.setCarId(reserveCancelled.getCarId());
        carMgmt.setStatus(false);        
        repository().save(carMgmt);

        

        /** Example 2:  finding and process 
        
        repository().findByCarId(reserveCancelled.getCarId()).forEach(carMgmt->{
            // carMgmt // do something
            CarMgmt carMgmt = new CarMgmt();
            carMgmt.setCarId(reserveCancelled.getCarId());
            carMgmt.setStatus(true);
            System.out.println(
                "\n\n##### listener CarStatusChange reserveCancelled : " + carMgmt + "\n\n"
            );
    
            repository().update(carMgmt);
         });
         */

    }
}

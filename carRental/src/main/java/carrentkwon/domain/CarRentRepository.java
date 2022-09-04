package carrentkwon.domain;

import carrentkwon.domain.*;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "carRents", path = "carRents")
public interface CarRentRepository
    extends PagingAndSortingRepository<CarRent, Long> {

        List<CarRent> findByCarId(Long carId);
    }

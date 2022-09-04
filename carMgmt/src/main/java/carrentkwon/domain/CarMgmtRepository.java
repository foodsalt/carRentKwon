package carrentkwon.domain;

import carrentkwon.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "carMgmts", path = "carMgmts")
public interface CarMgmtRepository
    extends PagingAndSortingRepository<CarMgmt, Long> {}

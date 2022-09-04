package carrentkwon.domain;

import carrentkwon.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "memberMgmts",
    path = "memberMgmts"
)
public interface MemberMgmtRepository
    extends PagingAndSortingRepository<MemberMgmt, Long> {}

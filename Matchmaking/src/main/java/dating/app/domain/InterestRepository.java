package dating.app.domain;

import dating.app.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "interests", path = "interests")
public interface InterestRepository
    extends PagingAndSortingRepository<Interest, String> {}

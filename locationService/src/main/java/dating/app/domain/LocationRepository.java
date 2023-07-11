package dating.app.domain;

import dating.app.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "locations", path = "locations")
public interface LocationRepository
    extends PagingAndSortingRepository<Location, String> {}

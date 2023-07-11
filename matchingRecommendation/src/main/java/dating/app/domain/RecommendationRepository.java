package dating.app.domain;

import dating.app.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "recommendations",
    path = "recommendations"
)
public interface RecommendationRepository
    extends PagingAndSortingRepository<Recommendation, String> {}

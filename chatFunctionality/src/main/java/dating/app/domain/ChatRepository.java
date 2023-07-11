package dating.app.domain;

import dating.app.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "chats", path = "chats")
public interface ChatRepository
    extends PagingAndSortingRepository<Chat, String> {}

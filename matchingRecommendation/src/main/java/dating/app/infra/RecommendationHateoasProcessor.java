package dating.app.infra;

import dating.app.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class RecommendationHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Recommendation>> {

    @Override
    public EntityModel<Recommendation> process(
        EntityModel<Recommendation> model
    ) {
        return model;
    }
}

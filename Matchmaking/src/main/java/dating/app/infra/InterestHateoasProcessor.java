package dating.app.infra;

import dating.app.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class InterestHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Interest>> {

    @Override
    public EntityModel<Interest> process(EntityModel<Interest> model) {
        return model;
    }
}

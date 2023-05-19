package dk.sdu.stud.olsve21.components;

import dk.sdu.stud.olsve21.common.data.GameData;
import dk.sdu.stud.olsve21.common.data.World;
import dk.sdu.stud.olsve21.common.services.IEntityProcessingService;
import dk.sdu.stud.olsve21.common.util.SPILocator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("processorInjector")
public class ProcessInjection implements IProcessor {
    @Override
    public void process(GameData gameData, World world) {
        List<IEntityProcessingService> processors = SPILocator.locateAll(IEntityProcessingService.class);
        processors.forEach((processor) -> processor.process(gameData, world));
    }
}

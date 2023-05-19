package dk.sdu.stud.olsve21.components;

import dk.sdu.stud.olsve21.common.data.GameData;
import dk.sdu.stud.olsve21.common.data.World;
import dk.sdu.stud.olsve21.common.services.IGamePluginService;
import dk.sdu.stud.olsve21.common.util.SPILocator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("pluginInjector")
public class PluginInjection {

    public void startPlugins(GameData gameData, World world) {
        List<IGamePluginService> plugins = SPILocator.locateAll(IGamePluginService.class);
        plugins.forEach((plugin) -> plugin.start(gameData, world));
    }
}

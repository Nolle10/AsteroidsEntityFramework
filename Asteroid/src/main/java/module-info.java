import dk.sdu.stud.olsve21.common.services.IEntityProcessingService;
import dk.sdu.stud.olsve21.common.services.IGamePluginService;

module Asteroid {
    requires Common;

    provides IGamePluginService with dk.sdu.stud.olsve21.asteroid.AsteroidPlugin;
    provides IEntityProcessingService with dk.sdu.stud.olsve21.asteroid.AsteroidControlSystem;
}
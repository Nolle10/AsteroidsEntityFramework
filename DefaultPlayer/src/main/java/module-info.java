import dk.sdu.stud.olsve21.common.services.IBulletCreator;
import dk.sdu.stud.olsve21.common.services.IEntityProcessingService;
import dk.sdu.stud.olsve21.common.services.IGamePluginService;

module DefaultPlayer {
    requires Common;

    uses IBulletCreator;

    provides IGamePluginService with dk.sdu.stud.olsve21.defaultplayer.PlayerPlugin;
    provides IEntityProcessingService with dk.sdu.stud.olsve21.defaultplayer.PlayerControlSystem;
}
import dk.sdu.stud.olsve21.common.services.IBulletCreator;
import dk.sdu.stud.olsve21.common.services.IEntityProcessingService;
import dk.sdu.stud.olsve21.common.services.IGamePluginService;
import dk.sdu.stud.olsve21.common.services.IPostEntityProcessingService;

module Common {
    exports dk.sdu.stud.olsve21.common.services;
    exports dk.sdu.stud.olsve21.common.data;
    exports dk.sdu.stud.olsve21.common.data.entityparts;
    exports dk.sdu.stud.olsve21.common.util;

    uses IBulletCreator;
    uses IGamePluginService;
    uses IEntityProcessingService;
    uses IPostEntityProcessingService;
}
import dk.sdu.stud.olsve21.common.services.IBulletCreator;
import dk.sdu.stud.olsve21.common.services.IEntityProcessingService;
import dk.sdu.stud.olsve21.common.services.IGamePluginService;

module DefaultBullet {
    requires Common;

    provides IBulletCreator with dk.sdu.stud.olsve21.bullet.BulletPlugin;
    provides IGamePluginService with dk.sdu.stud.olsve21.bullet.BulletPlugin;
    provides IEntityProcessingService with dk.sdu.stud.olsve21.bullet.BulletControlSystem;
}
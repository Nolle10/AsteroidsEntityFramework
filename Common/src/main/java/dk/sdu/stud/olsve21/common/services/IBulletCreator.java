package dk.sdu.stud.olsve21.common.services;

import dk.sdu.stud.olsve21.common.data.Entity;
import dk.sdu.stud.olsve21.common.data.GameData;

public interface IBulletCreator {
    /**
     * Start the plugin.
     * <br />
     * Pre-condition: Game running and shooter wants bullet to appear.<br />
     * Post-condition: Bullet entity that is ready to be added to the game world.
     *
     * @param shooter World of the game
     * @param gameData Data for the game
     *
     * @return Bullet Entity
     *
     * @see Entity
     * @see GameData
     */
    Entity create(Entity shooter, GameData gameData);
}

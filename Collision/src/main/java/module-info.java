import dk.sdu.stud.olsve21.common.services.IPostEntityProcessingService;

module Collision {
    requires Common;

    provides IPostEntityProcessingService with dk.sdu.stud.olsve21.collision.CollisionDetector;
}
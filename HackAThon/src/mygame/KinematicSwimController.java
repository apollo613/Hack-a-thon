/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import com.bulletphysics.collision.dispatch.PairCachingGhostObject;
import com.bulletphysics.collision.shapes.ConvexShape;
import com.bulletphysics.dynamics.character.KinematicCharacterController;

/**
 *
 * @author xlicolts613
 */
public class KinematicSwimController extends KinematicCharacterController{
    
    public KinematicSwimController(PairCachingGhostObject ghostObject, ConvexShape convexShape, float stepHeight) {
                this(ghostObject, convexShape, stepHeight, 1);
        }

        public KinematicSwimController(PairCachingGhostObject ghostObject, ConvexShape convexShape, float stepHeight, int upAxis) {
                super(ghostObject,convexShape,stepHeight,upAxis);
        }
        
        @Override
        public boolean canJump() {
//            return onGround();
            return true;
        }
    
}

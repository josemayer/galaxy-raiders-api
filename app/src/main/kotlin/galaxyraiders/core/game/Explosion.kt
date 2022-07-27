package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D

class Explosion(initialPosition: Point2D, radius: Double, timeToLive: Double) :
  SpaceObject("Explosion", '*', initialPosition, Vector2D(0.0, 0.0), radius, mass = 0.0) {

  var isTriggered = true
  var timeRemaining = timeToLive

  fun update() {
    if (this.timeRemaining <= 0.0) {
      this.isTriggered = false
    }
    this.timeRemaining -= 1.0
  }

  fun isTriggeredExplosion(): Boolean {
    return this.isTriggered
  }
}

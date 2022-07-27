package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D

class Explosion(initialPosition: Point2D, radius: Double, timeToLive: Double):
  SpaceObject("Explosion", '*', initialPosition, Vector2D(0.0, 0.0), radius, mass = 0.0) {
  
  var is_triggered = true
  var time_remaining = timeToLive

  fun update() {
    if (this.time_remaining <= 0.0) {
      this.is_triggered = false
    }
    this.time_remaining -= 1.0
  }

  fun isTriggered(): Boolean {
    return this.is_triggered
  }
}

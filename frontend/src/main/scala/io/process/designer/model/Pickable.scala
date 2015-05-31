package io.process.designer.model

import io.process.geometry.{ Rectangle, Point }

trait Pickable[T] {

  def pick(e: T, p: Point): Boolean

  def pick(e: T, r: Rectangle): Boolean
}


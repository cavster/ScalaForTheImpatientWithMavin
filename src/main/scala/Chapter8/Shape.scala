package Chapter8

import java.awt.Rectangle

/**
 * Created by colmcavanagh on 5/9/14.
 */

abstract class Shape { def centerPoint: (Int, Int) }

class Rectanglex(val width: Int, val height: Int, val centerPoint: (Int, Int)) extends Shape
// x added because of q7
class Circle(val radius: Int, val centerPoint: (Int, Int)) extends Shape



package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Popper {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/Popper", JSImport.Default)
  @js.native
  object PopperJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](PopperJS)
  
  /**
   * Poppers rely on the 3rd party library [Popper.js](https://github.com/FezVrasta/popper.js) for positioning.
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
        
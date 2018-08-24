
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Hidden {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/Hidden", JSImport.Default)
  @js.native
  object HiddenJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](HiddenJS)
  
  /**
   * Responsively hides children based on the selected implementation.
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
        
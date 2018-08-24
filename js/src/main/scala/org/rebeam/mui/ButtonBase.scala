
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object ButtonBase {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/ButtonBase", JSImport.Default)
  @js.native
  object ButtonBaseJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](ButtonBaseJS)
  
  /**
   * `ButtonBase` contains as few styles as possible.
   * It aims to be a simple building block for creating a button.
   * It contains a load of style reset and some focus/ripple logic.
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
        
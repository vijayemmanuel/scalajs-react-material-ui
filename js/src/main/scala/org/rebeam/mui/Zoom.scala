
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Zoom {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/Zoom", JSImport.Default)
  @js.native
  object ZoomJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](ZoomJS)
  
  /**
   * The Zoom transition can be used for the floating variant of the
   * [Button](https://material-ui.com/demos/buttons/#floating-action-buttons) component.
   * It uses [react-transition-group](https://github.com/reactjs/react-transition-group) internally.
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
        
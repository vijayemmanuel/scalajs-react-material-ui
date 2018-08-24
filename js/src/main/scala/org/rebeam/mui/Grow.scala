
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Grow {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/Grow", JSImport.Default)
  @js.native
  object GrowJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](GrowJS)
  
  /**
   * The Grow transition is used by the [Tooltip](/demos/tooltips) and
   * [Popover](/utils/popover) components.
   * It uses [react-transition-group](https://github.com/reactjs/react-transition-group) internally.
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
    
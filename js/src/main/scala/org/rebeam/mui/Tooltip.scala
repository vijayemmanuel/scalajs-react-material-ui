
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Tooltip {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/Tooltip", JSImport.Default)
  @js.native
  object TooltipJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](TooltipJS)
  
  /**
   * 
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
        
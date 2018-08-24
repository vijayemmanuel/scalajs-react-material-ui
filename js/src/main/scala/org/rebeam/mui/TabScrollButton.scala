
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object TabScrollButton {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/TabScrollButton", JSImport.Default)
  @js.native
  object TabScrollButtonJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](TabScrollButtonJS)
  
  /**
   * @ignore - internal component.
   */
  def apply(
    
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)()
  }

}
    
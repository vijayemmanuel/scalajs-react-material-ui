
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object TabIndicator {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/TabIndicator", JSImport.Default)
  @js.native
  object TabIndicatorJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](TabIndicatorJS)
  
  /**
   * @ignore - internal component.
   */
  def apply(
    
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)()
  }

}
    
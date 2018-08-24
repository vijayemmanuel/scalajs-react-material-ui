
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Ripple {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/Ripple", JSImport.Default)
  @js.native
  object RippleJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](RippleJS)
  
  /**
   * @ignore - internal component.
   */
  def apply(
    
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)()
  }

}
    

package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object SwitchBase {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/SwitchBase", JSImport.Default)
  @js.native
  object SwitchBaseJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](SwitchBaseJS)
  
  /**
   * @ignore - internal component.
   */
  def apply(
    
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)()
  }

}
    
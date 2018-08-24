
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Switch {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/Switch", JSImport.Default)
  @js.native
  object SwitchJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](SwitchJS)
  
  /**
   * 
   */
  def apply(
    
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)()
  }

}
    
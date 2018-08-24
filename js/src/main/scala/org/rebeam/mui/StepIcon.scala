
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object StepIcon {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/StepIcon", JSImport.Default)
  @js.native
  object StepIconJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](StepIconJS)
  
  /**
   * 
   */
  def apply(
    
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)()
  }

}
        
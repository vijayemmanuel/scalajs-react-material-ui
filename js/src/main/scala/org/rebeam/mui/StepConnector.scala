
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object StepConnector {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/StepConnector", JSImport.Default)
  @js.native
  object StepConnectorJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](StepConnectorJS)
  
  /**
   * 
   */
  def apply(
    
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)()
  }

}
    
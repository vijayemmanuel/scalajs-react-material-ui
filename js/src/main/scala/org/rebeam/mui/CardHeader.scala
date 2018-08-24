
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object CardHeader {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/CardHeader", JSImport.Default)
  @js.native
  object CardHeaderJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](CardHeaderJS)
  
  /**
   * 
   */
  def apply(
    
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)()
  }

}
    
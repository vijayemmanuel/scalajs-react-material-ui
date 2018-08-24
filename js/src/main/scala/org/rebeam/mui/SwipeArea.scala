
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object SwipeArea {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/SwipeArea", JSImport.Default)
  @js.native
  object SwipeAreaJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](SwipeAreaJS)
  
  /**
   * @ignore - internal component.
   */
  def apply(
    
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)()
  }

}
    

package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object ListItemSecondaryAction {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/ListItemSecondaryAction", JSImport.Default)
  @js.native
  object ListItemSecondaryActionJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](ListItemSecondaryActionJS)
  
  /**
   * 
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
    

package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object ExpansionPanelActions {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/ExpansionPanelActions", JSImport.Default)
  @js.native
  object ExpansionPanelActionsJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](ExpansionPanelActionsJS)
  
  /**
   * 
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
    
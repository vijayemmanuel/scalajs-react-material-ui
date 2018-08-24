
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object ExpansionPanelDetails {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/ExpansionPanelDetails", JSImport.Default)
  @js.native
  object ExpansionPanelDetailsJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](ExpansionPanelDetailsJS)
  
  /**
   * 
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
        
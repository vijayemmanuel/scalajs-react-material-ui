
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object ListItemText {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/ListItemText", JSImport.Default)
  @js.native
  object ListItemTextJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](ListItemTextJS)
  
  /**
   * 
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
    
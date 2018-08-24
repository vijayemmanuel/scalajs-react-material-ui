
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object ListItem {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/ListItem", JSImport.Default)
  @js.native
  object ListItemJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](ListItemJS)
  
  /**
   * 
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
        
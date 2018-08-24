
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Toolbar {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/Toolbar", JSImport.Default)
  @js.native
  object ToolbarJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](ToolbarJS)
  
  /**
   * 
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
    
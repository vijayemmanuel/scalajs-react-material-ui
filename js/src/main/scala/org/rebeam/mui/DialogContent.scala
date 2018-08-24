
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object DialogContent {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/DialogContent", JSImport.Default)
  @js.native
  object DialogContentJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](DialogContentJS)
  
  /**
   * 
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
    
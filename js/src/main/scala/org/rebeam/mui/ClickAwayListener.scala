
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object ClickAwayListener {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/ClickAwayListener", JSImport.Default)
  @js.native
  object ClickAwayListenerJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](ClickAwayListenerJS)
  
  /**
   * Listen for click events that occur somewhere in the document, outside of the element itself.
   * For instance, if you need to hide a menu when people click anywhere else on your page.
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
    
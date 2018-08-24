
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Modal {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/Modal", JSImport.Default)
  @js.native
  object ModalJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](ModalJS)
  
  /**
   * This component shares many concepts with [react-overlays](https://react-bootstrap.github.io/react-overlays/#modals).
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
        

package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Slide {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/Slide", JSImport.Default)
  @js.native
  object SlideJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](SlideJS)
  
  /**
   * The Slide transition is used by the [Snackbar](/demos/snackbars) component.
   * It uses [react-transition-group](https://github.com/reactjs/react-transition-group) internally.
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
    
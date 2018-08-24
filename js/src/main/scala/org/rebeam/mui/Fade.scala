
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Fade {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/Fade", JSImport.Default)
  @js.native
  object FadeJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](FadeJS)
  
  /**
   * The Fade transition is used by the [Modal](/utils/modal) component.
   * It uses [react-transition-group](https://github.com/reactjs/react-transition-group) internally.
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
    
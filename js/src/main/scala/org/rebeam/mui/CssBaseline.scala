
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object CssBaseline {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/CssBaseline", JSImport.Default)
  @js.native
  object CssBaselineJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](CssBaselineJS)
  
  /**
   * Kickstart an elegant, consistent, and simple baseline to build upon.
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
    
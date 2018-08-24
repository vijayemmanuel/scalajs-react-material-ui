
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object NoSsr {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/NoSsr", JSImport.Default)
  @js.native
  object NoSsrJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](NoSsrJS)
  
  /**
   * NoSsr purposely removes components from the subject of Server Side Rendering (SSR).
   * 
   * This component can be useful in a variety of situations:
   * - Escape hatch for broken dependencies not supporting SSR.
   * - Improve the time-to-first paint on the client by only rendering above the fold.
   * - Reduce the rendering time on the server.
   * - Under too heavy server load, you can turn on service degradation.
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
    
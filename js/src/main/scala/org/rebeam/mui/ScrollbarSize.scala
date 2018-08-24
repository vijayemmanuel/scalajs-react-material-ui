
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object ScrollbarSize {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/ScrollbarSize", JSImport.Default)
  @js.native
  object ScrollbarSizeJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](ScrollbarSizeJS)
  
  /**
   * @ignore - internal component.
   * The component is originates from https://github.com/STORIS/react-scrollbar-size.
   * It has been moved into the core in order to minimize the bundle size.
   */
  def apply(
    
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)()
  }

}
    
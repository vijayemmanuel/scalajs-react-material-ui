
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Portal {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/Portal", JSImport.Default)
  @js.native
  object PortalJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](PortalJS)
  
  /**
   * Portals provide a first-class way to render children into a DOM node
   * that exists outside the DOM hierarchy of the parent component.
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
        
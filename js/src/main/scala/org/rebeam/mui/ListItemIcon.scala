
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object ListItemIcon {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/ListItemIcon", JSImport.Default)
  @js.native
  object ListItemIconJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](ListItemIconJS)
  
  /**
   * A simple wrapper to apply `List` styles to an `Icon` or `SvgIcon`.
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
        
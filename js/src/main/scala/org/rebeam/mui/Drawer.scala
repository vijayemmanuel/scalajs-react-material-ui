
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Drawer {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/Drawer", JSImport.Default)
  @js.native
  object DrawerJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](DrawerJS)
  
  /**
   * The properties of the [Modal](/api/modal) component are available
   * when `variant="temporary"` is set.
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
    
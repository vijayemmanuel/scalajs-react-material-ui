
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object BottomNavigation {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/BottomNavigation", JSImport.Default)
  @js.native
  object BottomNavigationJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](BottomNavigationJS)
  
  /**
   * 
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
        
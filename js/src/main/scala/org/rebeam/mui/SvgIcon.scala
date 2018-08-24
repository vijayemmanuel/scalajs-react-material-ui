
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object SvgIcon {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/SvgIcon", JSImport.Default)
  @js.native
  object SvgIconJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](SvgIconJS)
  
  /**
   * 
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
        

package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object GridList {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/GridList", JSImport.Default)
  @js.native
  object GridListJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](GridListJS)
  
  /**
   * 
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
    
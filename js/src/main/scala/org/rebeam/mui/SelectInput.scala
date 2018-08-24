
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object SelectInput {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/SelectInput", JSImport.Default)
  @js.native
  object SelectInputJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](SelectInputJS)
  
  /**
   * @ignore - internal component.
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
    
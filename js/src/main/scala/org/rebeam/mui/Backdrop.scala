
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Backdrop {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/Backdrop", JSImport.Default)
  @js.native
  object BackdropJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](BackdropJS)
  
  /**
   * 
   */
  def apply(
    
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)()
  }

}
        
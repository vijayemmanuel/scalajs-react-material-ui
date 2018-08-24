
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object CardMedia {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/CardMedia", JSImport.Default)
  @js.native
  object CardMediaJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](CardMediaJS)
  
  /**
   * 
   */
  def apply(
    
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)()
  }

}
        
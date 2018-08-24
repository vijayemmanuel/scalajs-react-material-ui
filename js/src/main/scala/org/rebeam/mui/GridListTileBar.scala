
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object GridListTileBar {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/GridListTileBar", JSImport.Default)
  @js.native
  object GridListTileBarJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](GridListTileBarJS)
  
  /**
   * 
   */
  def apply(
    
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)()
  }

}
        
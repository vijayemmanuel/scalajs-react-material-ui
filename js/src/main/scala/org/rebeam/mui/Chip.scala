
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Chip {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/Chip", JSImport.Default)
  @js.native
  object ChipJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](ChipJS)
  
  /**
   * Chips represent complex entities in small blocks, such as a contact.
   */
  def apply(
    
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)()
  }

}
    
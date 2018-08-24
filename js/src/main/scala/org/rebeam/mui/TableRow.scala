
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object TableRow {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/TableRow", JSImport.Default)
  @js.native
  object TableRowJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](TableRowJS)
  
  /**
   * Will automatically set dynamic row height
   * based on the material table element parent (head, body, etc).
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
        
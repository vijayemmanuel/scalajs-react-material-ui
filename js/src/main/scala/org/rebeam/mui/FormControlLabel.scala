
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object FormControlLabel {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/FormControlLabel", JSImport.Default)
  @js.native
  object FormControlLabelJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](FormControlLabelJS)
  
  /**
   * Drop in replacement of the `Radio`, `Switch` and `Checkbox` component.
   * Use this component if you want to display an extra label.
   */
  def apply(
    
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)()
  }

}
    
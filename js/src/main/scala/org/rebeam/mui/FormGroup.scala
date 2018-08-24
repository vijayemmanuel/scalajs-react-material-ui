
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object FormGroup {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/FormGroup", JSImport.Default)
  @js.native
  object FormGroupJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](FormGroupJS)
  
  /**
   * `FormGroup` wraps controls such as `Checkbox` and `Switch`.
   * It provides compact row layout.
   * For the `Radio`, you should be using the `RadioGroup` component instead of this one.
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
        
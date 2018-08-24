
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object FormControl {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/FormControl", JSImport.Default)
  @js.native
  object FormControlJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](FormControlJS)
  
  /**
   * Provides context such as filled/focused/error/required for form inputs.
   * Relying on the context provides high flexibilty and ensures that the state always stays
   * consistent across the children of the `FormControl`.
   * This context is used by the following components:
   *  - FormLabel
   *  - FormHelperText
   *  - Input
   *  - InputLabel
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
    
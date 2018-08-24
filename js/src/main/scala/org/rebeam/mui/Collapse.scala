
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Collapse {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/Collapse", JSImport.Default)
  @js.native
  object CollapseJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](CollapseJS)
  
  /**
   * The Collapse transition is used by the
   * [Vertical Stepper](/demos/steppers#vertical-stepper) StepContent component.
   * It uses [react-transition-group](https://github.com/reactjs/react-transition-group) internally.
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
        
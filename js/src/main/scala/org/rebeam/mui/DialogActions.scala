
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object DialogActions {
  
  @js.native
  trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var disableActionSpacing: js.UndefOr[Boolean] = js.native
  }

  @JSImport("@material-ui/core/DialogActions", JSImport.Default)
  @js.native
  object DialogActionsJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](DialogActionsJS)
  
  /**
   * 
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param disableActionSpacing
   *        If `true`, the dialog actions do not have additional margin.
   */
  def apply(
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    disableActionSpacing: js.UndefOr[Boolean] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.className = className
    p.classes = classes
    p.disableActionSpacing = disableActionSpacing

    jsFnComponent(p)(children: _*)
  }

}
        
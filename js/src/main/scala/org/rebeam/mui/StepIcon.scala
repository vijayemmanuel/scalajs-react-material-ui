
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object StepIcon {
  
  @js.native
  trait Props extends js.Object {
    var active: js.UndefOr[Boolean] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var completed: js.UndefOr[Boolean] = js.native
    var error: js.UndefOr[Boolean] = js.native
    var icon: japgolly.scalajs.react.raw.React.Node = js.native
  }

  @JSImport("@material-ui/core/StepIcon", JSImport.Default)
  @js.native
  object StepIconJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](StepIconJS)
  
  /**
   * 
   * @param active
   *        Whether this step is active.
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param completed
   *        Mark the step as completed. Is passed to child components.
   * @param error
   *        Mark the step as failed.
   * @param icon
   *        The icon displayed by the step label.
   */
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    completed: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    icon: VdomNode
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (active.isDefined) {p.active = active}
    if (classes.isDefined) {p.classes = classes}
    if (completed.isDefined) {p.completed = completed}
    if (error.isDefined) {p.error = error}
    p.icon = icon.rawNode

    jsFnComponent(p)()
  }

}
        

package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Step {
  
  sealed trait Orientation{ val value: String }

  object Orientation {
    case object Horizontal extends Orientation { val value: String = "horizontal" }
    case object Vertical extends Orientation { val value: String = "vertical" }
  }
          
  @js.native
  trait Props extends js.Object {
    var key: js.UndefOr[String] = js.native
    var active: js.UndefOr[Boolean] = js.native
    var alternativeLabel: js.UndefOr[Boolean] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var completed: js.UndefOr[Boolean] = js.native
    var connector: js.UndefOr[japgolly.scalajs.react.raw.React.Element] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var index: js.UndefOr[Double] = js.native
    var last: js.UndefOr[Boolean] = js.native
    var orientation: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/Step", JSImport.Default)
  @js.native
  object StepJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](StepJS)
  
  /**
   * 
   * @param key
   *        React key
   * @param active
   *        Sets the step as active. Is passed to child components.
   * @param alternativeLabel
   *        Property spread to root element
   *        Set internally by Stepper when it's supplied with the alternativeLabel property.
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param completed
   *        Mark the step as completed. Is passed to child components.
   * @param connector
   *        Property spread to root element
   *        Passed down from Stepper if alternativeLabel is also set.
   * @param disabled
   *        Mark the step as disabled, will also disable the button if
   *        `StepButton` is a child of `Step`. Is passed to child components.
   * @param index
   *        Property spread to root element
   *        Used internally for numbering.
   * @param last
   *        Property spread to root element
   * @param orientation
   *        Property spread to root element
   */
  def apply(
    key: js.UndefOr[String] = js.undefined,
    active: js.UndefOr[Boolean] = js.undefined,
    alternativeLabel: js.UndefOr[Boolean] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    completed: js.UndefOr[Boolean] = js.undefined,
    connector: js.UndefOr[VdomElement] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    last: js.UndefOr[Boolean] = js.undefined,
    orientation: js.UndefOr[Orientation] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (key.isDefined) {p.key = key}
    if (active.isDefined) {p.active = active}
    if (alternativeLabel.isDefined) {p.alternativeLabel = alternativeLabel}
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (completed.isDefined) {p.completed = completed}
    if (connector.isDefined) {p.connector = connector.map(v => v.rawElement)}
    if (disabled.isDefined) {p.disabled = disabled}
    if (index.isDefined) {p.index = index}
    if (last.isDefined) {p.last = last}
    if (orientation.isDefined) {p.orientation = orientation.map(v => v.value)}

    jsFnComponent(p)(children: _*)
  }

}
        
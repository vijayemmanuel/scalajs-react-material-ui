
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object StepLabel {
  
  sealed trait Orientation{ val value: String }

  object Orientation {
    case object Horizontal extends Orientation { val value: String = "horizontal" }
    case object Vertical extends Orientation { val value: String = "vertical" }
  }
          
  @js.native
  trait Props extends js.Object {
    var key: js.UndefOr[String] = js.native
    var StepIconProps: js.UndefOr[js.Any] = js.native
    var active: js.UndefOr[Boolean] = js.native
    var alternativeLabel: js.UndefOr[Boolean] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var completed: js.UndefOr[Boolean] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var error: js.UndefOr[Boolean] = js.native
    var icon: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var last: js.UndefOr[Boolean] = js.native
    var optional: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var orientation: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/StepLabel", JSImport.Default)
  @js.native
  object StepLabelJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](StepLabelJS)
  
  /**
   * 
   * @param key
   *        React key
   * @param StepIconProps
   *        Properties applied to the [`StepIcon`](/api/step-icon) element.
   * @param active
   *        Property spread to root element
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
   *        Property spread to root element
   *        Mark the step as completed. Is passed to child components.
   * @param disabled
   *        Mark the step as disabled, will also disable the button if
   *        `StepLabelButton` is a child of `StepLabel`. Is passed to child components.
   * @param error
   *        Mark the step as failed.
   * @param icon
   *        Override the default icon.
   * @param last
   *        Property spread to root element
   * @param optional
   *        The optional node to display.
   * @param orientation
   *        Property spread to root element
   */
  def apply(
    key: js.UndefOr[String] = js.undefined,
    StepIconProps: js.UndefOr[js.Any] = js.undefined,
    active: js.UndefOr[Boolean] = js.undefined,
    alternativeLabel: js.UndefOr[Boolean] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    completed: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    icon: js.UndefOr[VdomNode] = js.undefined,
    last: js.UndefOr[Boolean] = js.undefined,
    optional: js.UndefOr[VdomNode] = js.undefined,
    orientation: js.UndefOr[Orientation] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (key.isDefined) {p.key = key}
    if (StepIconProps.isDefined) {p.StepIconProps = StepIconProps}
    if (active.isDefined) {p.active = active}
    if (alternativeLabel.isDefined) {p.alternativeLabel = alternativeLabel}
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (completed.isDefined) {p.completed = completed}
    if (disabled.isDefined) {p.disabled = disabled}
    if (error.isDefined) {p.error = error}
    if (icon.isDefined) {p.icon = icon.map(v => v.rawNode)}
    if (last.isDefined) {p.last = last}
    if (optional.isDefined) {p.optional = optional.map(v => v.rawNode)}
    if (orientation.isDefined) {p.orientation = orientation.map(v => v.value)}

    jsFnComponent(p)(children: _*)
  }

}
        
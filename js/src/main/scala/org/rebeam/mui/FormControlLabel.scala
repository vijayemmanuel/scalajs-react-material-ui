
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object FormControlLabel {
  
  sealed trait LabelPlacement{ val value: String }

  object LabelPlacement {
    case object End extends LabelPlacement { val value: String = "end" }
    case object Start extends LabelPlacement { val value: String = "start" }
  }
          
  @js.native
  trait Props extends js.Object {
    var checked: js.UndefOr[js.Any] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var control: js.UndefOr[japgolly.scalajs.react.raw.React.Element] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var inputRef: js.UndefOr[js.Any] = js.native
    var label: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var labelPlacement: js.UndefOr[String] = js.native
    var name: js.UndefOr[String] = js.native
    var onChange: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var value: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/FormControlLabel", JSImport.Default)
  @js.native
  object FormControlLabelJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](FormControlLabelJS)
  
  /**
   * Drop in replacement of the `Radio`, `Switch` and `Checkbox` component.
   * Use this component if you want to display an extra label.
   * @param checked
   *        If `true`, the component appears selected.
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param control
   *        A control element. For instance, it can be be a `Radio`, a `Switch` or a `Checkbox`.
   * @param disabled
   *        If `true`, the control will be disabled.
   * @param inputRef
   *        Use that property to pass a ref callback to the native input component.
   * @param label
   *        The text to be used in an enclosing label element.
   * @param labelPlacement
   *        The position of the label.
   * @param name
   *        
   * @param onChange
   *        Callback fired when the state is changed.
   *        
   *        parameter {object} event The event source of the callback.
   *        You can pull out the new value by accessing `event.target.checked`.
   *        parameter {boolean} checked The `checked` value of the switch
   * @param value
   *        The value of the component.
   */
  def apply(
    checked: js.UndefOr[js.Any] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    control: js.UndefOr[VdomElement] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inputRef: js.UndefOr[js.Any] = js.undefined,
    label: js.UndefOr[VdomNode] = js.undefined,
    labelPlacement: js.UndefOr[LabelPlacement] = js.undefined,
    name: js.UndefOr[String] = js.undefined,
    onChange: js.UndefOr[Callback] = js.undefined,
    value: js.UndefOr[String] = js.undefined
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (checked.isDefined) {p.checked = checked}
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (control.isDefined) {p.control = control.map(v => v.rawElement)}
    if (disabled.isDefined) {p.disabled = disabled}
    if (inputRef.isDefined) {p.inputRef = inputRef}
    if (label.isDefined) {p.label = label.map(v => v.rawNode)}
    if (labelPlacement.isDefined) {p.labelPlacement = labelPlacement.map(v => v.value)}
    if (name.isDefined) {p.name = name}
    if (onChange.isDefined) {p.onChange = onChange.map(v => v.toJsFn)}
    if (value.isDefined) {p.value = value}

    jsFnComponent(p)()
  }

}
        
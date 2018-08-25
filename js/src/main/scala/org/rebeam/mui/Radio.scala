
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Radio {
  
  sealed trait Color{ val value: String }

  object Color {
    case object Primary extends Color { val value: String = "primary" }
    case object Secondary extends Color { val value: String = "secondary" }
    case object Default extends Color { val value: String = "default" }
  }
          
  @js.native
  trait Props extends js.Object {
    var checked: js.UndefOr[js.Any] = js.native
    var checkedIcon: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var color: js.UndefOr[String] = js.native
    var disableRipple: js.UndefOr[Boolean] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var icon: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var id: js.UndefOr[String] = js.native
    var inputProps: js.UndefOr[js.Any] = js.native
    var inputRef: js.UndefOr[js.Any] = js.native
    var onChange: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var `type`: js.UndefOr[String] = js.native
    var value: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/Radio", JSImport.Default)
  @js.native
  object RadioJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](RadioJS)
  
  /**
   * 
   * @param checked
   *        If `true`, the component is checked.
   * @param checkedIcon
   *        The icon to display when the component is checked.
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param color
   *        The color of the component. It supports those theme colors that make sense for this component.
   * @param disableRipple
   *        If `true`, the ripple effect will be disabled.
   * @param disabled
   *        If `true`, the switch will be disabled.
   * @param icon
   *        The icon to display when the component is unchecked.
   * @param id
   *        The id of the `input` element.
   * @param inputProps
   *        Attributes applied to the `input` element.
   * @param inputRef
   *        Use that property to pass a ref callback to the native input component.
   * @param onChange
   *        Callback fired when the state is changed.
   *        
   *        parameter {object} event The event source of the callback.
   *        You can pull out the new value by accessing `event.target.value`.
   *        parameter {boolean} checked The `checked` value of the switch
   * @param `type`
   *        The input component property `type`.
   * @param value
   *        The value of the component.
   */
  def apply(
    checked: js.UndefOr[js.Any] = js.undefined,
    checkedIcon: js.UndefOr[VdomNode] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    color: js.UndefOr[Color] = js.undefined,
    disableRipple: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: js.UndefOr[VdomNode] = js.undefined,
    id: js.UndefOr[String] = js.undefined,
    inputProps: js.UndefOr[js.Any] = js.undefined,
    inputRef: js.UndefOr[js.Any] = js.undefined,
    onChange: js.UndefOr[Callback] = js.undefined,
    `type`: js.UndefOr[String] = js.undefined,
    value: js.UndefOr[String] = js.undefined
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.checked = checked
    p.checkedIcon = checkedIcon.map(v => v.rawNode)
    p.classes = classes
    p.color = color.map(v => v.value)
    p.disableRipple = disableRipple
    p.disabled = disabled
    p.icon = icon.map(v => v.rawNode)
    p.id = id
    p.inputProps = inputProps
    p.inputRef = inputRef
    p.onChange = onChange.map(v => v.toJsFn)
    p.`type` = `type`
    p.value = value

    jsFnComponent(p)()
  }

}
        
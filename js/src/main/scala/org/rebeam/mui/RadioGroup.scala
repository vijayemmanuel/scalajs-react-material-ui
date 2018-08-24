
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object RadioGroup {
  
  @js.native
  trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var name: js.UndefOr[String] = js.native
    var onBlur: js.UndefOr[scalajs.js.Function1[ReactFocusEvent, Unit]] = js.native
    var onChange: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onKeyDown: js.UndefOr[scalajs.js.Function1[ReactKeyboardEvent, Unit]] = js.native
    var row: js.UndefOr[Boolean] = js.native
    var value: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/RadioGroup", JSImport.Default)
  @js.native
  object RadioGroupJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](RadioGroupJS)
  
  /**
   * 
   * @param className
   *        @ignore
   *        Passed to FormGroup
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   *        Passed to FormGroup
   * @param name
   *        The name used to reference the value of the control.
   * @param onBlur
   *        @ignore
   * @param onChange
   *        Callback fired when a radio button is selected.
   *        
   *        @param {object} event The event source of the callback.
   *        You can pull out the new value by accessing `event.target.value`.
   *        @param {string} value The `value` of the selected radio button
   * @param onKeyDown
   *        @ignore
   * @param row
   *        Display group of elements in a compact row.
   *        Passed to FormGroup
   * @param value
   *        Value of the selected radio button.
   */
  def apply(
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    name: js.UndefOr[String] = js.undefined,
    onBlur: js.UndefOr[ReactFocusEvent => Callback] = js.undefined,
    onChange: js.UndefOr[Callback] = js.undefined,
    onKeyDown: js.UndefOr[ReactKeyboardEvent => Callback] = js.undefined,
    row: js.UndefOr[Boolean] = js.undefined,
    value: js.UndefOr[String] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.className = className
    p.classes = classes
    p.name = name
    p.onBlur = onBlur.map(v => (e: ReactFocusEvent) => v(e).runNow())
    p.onChange = onChange.map(v => v.toJsFn)
    p.onKeyDown = onKeyDown.map(v => (e: ReactKeyboardEvent) => v(e).runNow())
    p.row = row
    p.value = value

    jsFnComponent(p)(children: _*)
  }

}
    
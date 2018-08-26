
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object FormLabel {
  
  @js.native
  trait Props extends js.Object {
    var key: js.UndefOr[String] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var error: js.UndefOr[Boolean] = js.native
    var filled: js.UndefOr[Boolean] = js.native
    var focused: js.UndefOr[Boolean] = js.native
    var required: js.UndefOr[Boolean] = js.native
  }

  @JSImport("@material-ui/core/FormLabel", JSImport.Default)
  @js.native
  object FormLabelJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](FormLabelJS)
  
  /**
   * 
   * @param key
   *        React key
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   * @param disabled
   *        If `true`, the label should be displayed in a disabled state.
   * @param error
   *        If `true`, the label should be displayed in an error state.
   * @param filled
   *        If `true`, the label should use filled classes key.
   * @param focused
   *        If `true`, the input of this label is focused (used by `FormGroup` components).
   * @param required
   *        If `true`, the label will indicate that the input is required.
   */
  def apply(
    key: js.UndefOr[String] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    filled: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (key.isDefined) {p.key = key}
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (component.isDefined) {p.component = component}
    if (disabled.isDefined) {p.disabled = disabled}
    if (error.isDefined) {p.error = error}
    if (filled.isDefined) {p.filled = filled}
    if (focused.isDefined) {p.focused = focused}
    if (required.isDefined) {p.required = required}

    jsFnComponent(p)(children: _*)
  }

}
        
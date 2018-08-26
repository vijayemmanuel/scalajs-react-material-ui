
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object FormControl {
  
  sealed trait Margin{ val value: String }

  object Margin {
    case object None extends Margin { val value: String = "none" }
    case object Dense extends Margin { val value: String = "dense" }
    case object Normal extends Margin { val value: String = "normal" }
  }
          
  @js.native
  trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var error: js.UndefOr[Boolean] = js.native
    var fullWidth: js.UndefOr[Boolean] = js.native
    var key: js.UndefOr[String] = js.native
    var margin: js.UndefOr[String] = js.native
    var required: js.UndefOr[Boolean] = js.native
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
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   * @param disabled
   *        If `true`, the label, input and helper text should be displayed in a disabled state.
   * @param error
   *        If `true`, the label should be displayed in an error state.
   * @param fullWidth
   *        If `true`, the component will take up the full width of its container.
   * @param key
   *        React key
   * @param margin
   *        If `dense` or `normal`, will adjust vertical spacing of this and contained components.
   * @param required
   *        If `true`, the label will indicate that the input is required.
   */
  def apply(
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[String] = js.undefined,
    margin: js.UndefOr[Margin] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (component.isDefined) {p.component = component}
    if (disabled.isDefined) {p.disabled = disabled}
    if (error.isDefined) {p.error = error}
    if (fullWidth.isDefined) {p.fullWidth = fullWidth}
    if (key.isDefined) {p.key = key}
    if (margin.isDefined) {p.margin = margin.map(v => v.value)}
    if (required.isDefined) {p.required = required}

    jsFnComponent(p)(children: _*)
  }

}
        
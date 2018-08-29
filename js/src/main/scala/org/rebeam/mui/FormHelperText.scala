
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object FormHelperText {
  
  sealed trait Margin{ val value: String }

  object Margin {
    case object Dense extends Margin { val value: String = "dense" }
  }
          
  @js.native
  trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var error: js.UndefOr[Boolean] = js.native
    var filled: js.UndefOr[Boolean] = js.native
    var focused: js.UndefOr[Boolean] = js.native
    var key: js.UndefOr[String] = js.native
    var margin: js.UndefOr[String] = js.native
    var required: js.UndefOr[Boolean] = js.native
  }

  @JSImport("@material-ui/core/FormHelperText", JSImport.Default)
  @js.native
  object FormHelperTextJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](FormHelperTextJS)
  
  /**
   * 
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   * @param disabled
   *        If `true`, the helper text should be displayed in a disabled state.
   * @param error
   *        If `true`, helper text should be displayed in an error state.
   * @param filled
   *        If `true`, the helper text should use filled classes key.
   * @param focused
   *        If `true`, the helper text should use focused classes key.
   * @param key
   *        React key
   * @param margin
   *        If `dense`, will adjust vertical spacing. This is normally obtained via context from
   *        FormControl.
   * @param required
   *        If `true`, the helper text should use required classes key.
   * @param additionalProps
   *        Optional parameter - if specified, this must be a js.Object containing additional props
   *        to pass to the underlying JS component. Each field of additionalProps will be added to the
   *        JS props object, if a field with the same name is not already present (from one of the other
   *        parameters of this function). This functions like `...additionalProps` at the beginning of the
   *        component in JS. Used for e.g. Downshift integration, where Downshift will provide properties
   *        in this format to be added to rendered components.
   *        Since this is untyped, use with care - e.g. make sure props are in the correct format for JS components
   */
  def apply(
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    filled: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[String] = js.undefined,
    margin: js.UndefOr[Margin] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    additionalProps: js.UndefOr[js.Object] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (component.isDefined) {p.component = component}
    if (disabled.isDefined) {p.disabled = disabled}
    if (error.isDefined) {p.error = error}
    if (filled.isDefined) {p.filled = filled}
    if (focused.isDefined) {p.focused = focused}
    if (key.isDefined) {p.key = key}
    if (margin.isDefined) {p.margin = margin.map(v => v.value)}
    if (required.isDefined) {p.required = required}

    additionalProps.foreach {
      a => {
        val dict = a.asInstanceOf[js.Dictionary[js.Any]]
        val pDict = p.asInstanceOf[js.Dictionary[js.Any]]
        for ((prop, value) <- dict) {
          if (!p.hasOwnProperty(prop)) pDict(prop) = value
        }
      }
    }
    
    jsFnComponent(p)(children: _*)
  }

}
        
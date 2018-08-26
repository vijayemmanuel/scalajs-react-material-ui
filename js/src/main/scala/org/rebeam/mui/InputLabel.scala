
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object InputLabel {
  
  sealed trait Margin{ val value: String }

  object Margin {
    case object Dense extends Margin { val value: String = "dense" }
  }
          
  @js.native
  trait Props extends js.Object {
    var key: js.UndefOr[String] = js.native
    var FormLabelClasses: js.UndefOr[js.Any] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var disableAnimation: js.UndefOr[Boolean] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var error: js.UndefOr[Boolean] = js.native
    var filled: js.UndefOr[Boolean] = js.native
    var focused: js.UndefOr[Boolean] = js.native
    var margin: js.UndefOr[String] = js.native
    var required: js.UndefOr[Boolean] = js.native
    var shrink: js.UndefOr[Boolean] = js.native
  }

  @JSImport("@material-ui/core/InputLabel", JSImport.Default)
  @js.native
  object InputLabelJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](InputLabelJS)
  
  /**
   * 
   * @param key
   *        React key
   * @param FormLabelClasses
   *        `classes` property applied to the [`FormLabel`](/api/form-label) element.
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   *        Passed to FormLabel
   * @param disableAnimation
   *        If `true`, the transition animation is disabled.
   * @param disabled
   *        If `true`, apply disabled class.
   * @param error
   *        If `true`, the label will be displayed in an error state.
   * @param filled
   *        If `true`, the label should use filled classes key.
   *        Passed to FormLabel
   * @param focused
   *        If `true`, the input of this label is focused.
   * @param margin
   *        If `dense`, will adjust vertical spacing. This is normally obtained via context from
   *        FormControl.
   * @param required
   *        if `true`, the label will indicate that the input is required.
   * @param shrink
   *        If `true`, the label is shrunk.
   */
  def apply(
    key: js.UndefOr[String] = js.undefined,
    FormLabelClasses: js.UndefOr[js.Any] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    disableAnimation: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    filled: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    margin: js.UndefOr[Margin] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    shrink: js.UndefOr[Boolean] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (key.isDefined) {p.key = key}
    if (FormLabelClasses.isDefined) {p.FormLabelClasses = FormLabelClasses}
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (component.isDefined) {p.component = component}
    if (disableAnimation.isDefined) {p.disableAnimation = disableAnimation}
    if (disabled.isDefined) {p.disabled = disabled}
    if (error.isDefined) {p.error = error}
    if (filled.isDefined) {p.filled = filled}
    if (focused.isDefined) {p.focused = focused}
    if (margin.isDefined) {p.margin = margin.map(v => v.value)}
    if (required.isDefined) {p.required = required}
    if (shrink.isDefined) {p.shrink = shrink}

    jsFnComponent(p)(children: _*)
  }

}
        
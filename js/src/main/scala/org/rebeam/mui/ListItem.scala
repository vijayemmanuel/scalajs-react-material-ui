
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object ListItem {
  
  @js.native
  trait Props extends js.Object {
    var key: js.UndefOr[String] = js.native
    var ContainerComponent: js.UndefOr[js.Any] = js.native
    var ContainerProps: js.UndefOr[js.Any] = js.native
    var button: js.UndefOr[Boolean] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var dense: js.UndefOr[Boolean] = js.native
    var disableGutters: js.UndefOr[Boolean] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var divider: js.UndefOr[Boolean] = js.native
    var focusVisibleClassName: js.UndefOr[String] = js.native
    var onClick: js.UndefOr[scalajs.js.Function1[ReactMouseEvent, Unit]] = js.native
  }

  @JSImport("@material-ui/core/ListItem", JSImport.Default)
  @js.native
  object ListItemJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](ListItemJS)
  
  /**
   * 
   * @param key
   *        React key
   * @param ContainerComponent
   *        The container component used when a `ListItemSecondaryAction` is rendered.
   * @param ContainerProps
   *        Properties applied to the container element when the component
   *        is used to display a `ListItemSecondaryAction`.
   * @param button
   *        If `true`, the list item will be a button (using `ButtonBase`).
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   *        By default, it's a `li` when `button` is `false` and a `div` when `button` is `true`.
   * @param dense
   *        If `true`, compact vertical padding designed for keyboard and mouse input will be used.
   * @param disableGutters
   *        If `true`, the left and right padding is removed.
   * @param disabled
   *        If `true`, the list item will be disabled.
   * @param divider
   *        If `true`, a 1px light border is added to the bottom of the list item.
   * @param focusVisibleClassName
   *        Property spread to root element
   * @param onClick
   *        ReactMouseEvent on click
   *        Passed to DOCGEN_OnClickBase
   */
  def apply(
    key: js.UndefOr[String] = js.undefined,
    ContainerComponent: js.UndefOr[js.Any] = js.undefined,
    ContainerProps: js.UndefOr[js.Any] = js.undefined,
    button: js.UndefOr[Boolean] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    dense: js.UndefOr[Boolean] = js.undefined,
    disableGutters: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    divider: js.UndefOr[Boolean] = js.undefined,
    focusVisibleClassName: js.UndefOr[String] = js.undefined,
    onClick: js.UndefOr[ReactMouseEvent => Callback] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (key.isDefined) {p.key = key}
    if (ContainerComponent.isDefined) {p.ContainerComponent = ContainerComponent}
    if (ContainerProps.isDefined) {p.ContainerProps = ContainerProps}
    if (button.isDefined) {p.button = button}
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (component.isDefined) {p.component = component}
    if (dense.isDefined) {p.dense = dense}
    if (disableGutters.isDefined) {p.disableGutters = disableGutters}
    if (disabled.isDefined) {p.disabled = disabled}
    if (divider.isDefined) {p.divider = divider}
    if (focusVisibleClassName.isDefined) {p.focusVisibleClassName = focusVisibleClassName}
    if (onClick.isDefined) {p.onClick = onClick.map(v => (e: ReactMouseEvent) => v(e).runNow())}

    jsFnComponent(p)(children: _*)
  }

}
        

package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object MenuItem {
  
  @js.native
  trait Props extends js.Object {
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
    var key: js.UndefOr[String] = js.native
    var onClick: js.UndefOr[scalajs.js.Function1[ReactMouseEvent, Unit]] = js.native
    var role: js.UndefOr[String] = js.native
    var selected: js.UndefOr[Boolean] = js.native
  }

  @JSImport("@material-ui/core/MenuItem", JSImport.Default)
  @js.native
  object MenuItemJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](MenuItemJS)
  
  /**
   * 
   * @param ContainerComponent
   *        The container component used when a `ListItemSecondaryAction` is rendered.
   *        Passed to ListItem
   * @param ContainerProps
   *        Properties applied to the container element when the component
   *        is used to display a `ListItemSecondaryAction`.
   *        Passed to ListItem
   * @param button
   *        If `true`, the list item will be a button (using `ButtonBase`).
   *        Passed to ListItem
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   * @param dense
   *        If `true`, compact vertical padding designed for keyboard and mouse input will be used.
   *        Passed to ListItem
   * @param disableGutters
   *        If `true`, the left and right padding is removed.
   *        Passed to ListItem
   * @param disabled
   *        If `true`, the list item will be disabled.
   *        Passed to ListItem
   * @param divider
   *        If `true`, a 1px light border is added to the bottom of the list item.
   *        Passed to ListItem
   * @param focusVisibleClassName
   *        Property spread to root element
   *        Passed to ListItem
   * @param key
   *        React key
   * @param onClick
   *        ReactMouseEvent on click
   *        Passed to DOCGEN_OnClickBase
   * @param role
   *        Property spread to root element
   * @param selected
   *        Use to apply selected styling.
   */
  def apply(
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
    key: js.UndefOr[String] = js.undefined,
    onClick: js.UndefOr[ReactMouseEvent => Callback] = js.undefined,
    role: js.UndefOr[String] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
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
    if (key.isDefined) {p.key = key}
    if (onClick.isDefined) {p.onClick = onClick.map(v => (e: ReactMouseEvent) => v(e).runNow())}
    if (role.isDefined) {p.role = role}
    if (selected.isDefined) {p.selected = selected}

    jsFnComponent(p)(children: _*)
  }

}
        

package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Chip {
  
  sealed trait Color{ val value: String }

  object Color {
    case object Default extends Color { val value: String = "default" }
    case object Primary extends Color { val value: String = "primary" }
    case object Secondary extends Color { val value: String = "secondary" }
  }
          
  @js.native
  trait Props extends js.Object {
    var avatar: js.UndefOr[japgolly.scalajs.react.raw.React.Element] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var clickable: js.UndefOr[Boolean] = js.native
    var color: js.UndefOr[String] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var deleteIcon: js.UndefOr[japgolly.scalajs.react.raw.React.Element] = js.native
    var key: js.UndefOr[String] = js.native
    var label: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var onClick: js.UndefOr[scalajs.js.Function1[ReactMouseEvent, Unit]] = js.native
    var onDelete: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onKeyDown: js.UndefOr[scalajs.js.Function1[ReactKeyboardEvent, Unit]] = js.native
    var tabIndex: js.UndefOr[js.Any] = js.native
  }

  @JSImport("@material-ui/core/Chip", JSImport.Default)
  @js.native
  object ChipJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](ChipJS)
  
  /**
   * Chips represent complex entities in small blocks, such as a contact.
   * @param avatar
   *        Avatar element.
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param clickable
   *        If true, the chip will appear clickable, and will raise when pressed,
   *        even if the onClick property is not defined. This can be used, for example,
   *        along with the component property to indicate an anchor Chip is clickable.
   * @param color
   *        The color of the component. It supports those theme colors that make sense for this component.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   * @param deleteIcon
   *        Override the default delete icon element. Shown only if `onDelete` is set.
   * @param key
   *        React key
   * @param label
   *        The content of the label.
   * @param onClick
   *        Property spread to root element
   * @param onDelete
   *        Callback function fired when the delete icon is clicked.
   *        If set, the delete icon will be shown.
   * @param onKeyDown
   *        Property spread to root element
   * @param tabIndex
   *        Property spread to root element
   */
  def apply(
    avatar: js.UndefOr[VdomElement] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    clickable: js.UndefOr[Boolean] = js.undefined,
    color: js.UndefOr[Color] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    deleteIcon: js.UndefOr[VdomElement] = js.undefined,
    key: js.UndefOr[String] = js.undefined,
    label: js.UndefOr[VdomNode] = js.undefined,
    onClick: js.UndefOr[ReactMouseEvent => Callback] = js.undefined,
    onDelete: js.UndefOr[Callback] = js.undefined,
    onKeyDown: js.UndefOr[ReactKeyboardEvent => Callback] = js.undefined,
    tabIndex: js.UndefOr[js.Any] = js.undefined
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (avatar.isDefined) {p.avatar = avatar.map(v => v.rawElement)}
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (clickable.isDefined) {p.clickable = clickable}
    if (color.isDefined) {p.color = color.map(v => v.value)}
    if (component.isDefined) {p.component = component}
    if (deleteIcon.isDefined) {p.deleteIcon = deleteIcon.map(v => v.rawElement)}
    if (key.isDefined) {p.key = key}
    if (label.isDefined) {p.label = label.map(v => v.rawNode)}
    if (onClick.isDefined) {p.onClick = onClick.map(v => (e: ReactMouseEvent) => v(e).runNow())}
    if (onDelete.isDefined) {p.onDelete = onDelete.map(v => v.toJsFn)}
    if (onKeyDown.isDefined) {p.onKeyDown = onKeyDown.map(v => (e: ReactKeyboardEvent) => v(e).runNow())}
    if (tabIndex.isDefined) {p.tabIndex = tabIndex}

    jsFnComponent(p)()
  }

}
        
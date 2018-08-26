
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object BottomNavigation {
  
  @js.native
  trait Props extends js.Object {
    var key: js.UndefOr[String] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var onChange: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var showLabels: js.UndefOr[Boolean] = js.native
    var value: js.UndefOr[js.Any] = js.native
  }

  @JSImport("@material-ui/core/BottomNavigation", JSImport.Default)
  @js.native
  object BottomNavigationJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](BottomNavigationJS)
  
  /**
   * 
   * @param key
   *        React key
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param onChange
   *        Callback fired when the value changes.
   *        
   *        parameter {object} event The event source of the callback
   *        parameter {any} value We default to the index of the child
   * @param showLabels
   *        If `true`, all `BottomNavigationAction`s will show their labels.
   *        By default, only the selected `BottomNavigationAction` will show its label.
   * @param value
   *        The value of the currently selected `BottomNavigationAction`.
   */
  def apply(
    key: js.UndefOr[String] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    onChange: js.UndefOr[Callback] = js.undefined,
    showLabels: js.UndefOr[Boolean] = js.undefined,
    value: js.UndefOr[js.Any] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (key.isDefined) {p.key = key}
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (onChange.isDefined) {p.onChange = onChange.map(v => v.toJsFn)}
    if (showLabels.isDefined) {p.showLabels = showLabels}
    if (value.isDefined) {p.value = value}

    jsFnComponent(p)(children: _*)
  }

}
        
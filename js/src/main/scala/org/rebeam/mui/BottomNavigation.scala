
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object BottomNavigation {
  
  @js.native
  trait Props extends js.Object {
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
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    onChange: js.UndefOr[Callback] = js.undefined,
    showLabels: js.UndefOr[Boolean] = js.undefined,
    value: js.UndefOr[js.Any] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.className = className
    p.classes = classes
    p.onChange = onChange.map(v => v.toJsFn)
    p.showLabels = showLabels
    p.value = value

    jsFnComponent(p)(children: _*)
  }

}
        
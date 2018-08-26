
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object ListItemIcon {
  
  @js.native
  trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
  }

  @JSImport("@material-ui/core/ListItemIcon", JSImport.Default)
  @js.native
  object ListItemIconJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](ListItemIconJS)
  
  /**
   * A simple wrapper to apply `List` styles to an `Icon` or `SvgIcon`.
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   */
  def apply(
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}

    jsFnComponent(p)(children: _*)
  }

}
        
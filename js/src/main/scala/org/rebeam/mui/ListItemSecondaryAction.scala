
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object ListItemSecondaryAction {
  
  @js.native
  trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var key: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/ListItemSecondaryAction", JSImport.Default)
  @js.native
  object ListItemSecondaryActionJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](ListItemSecondaryActionJS)
  
  /**
   * 
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param key
   *        React key
   */
  def apply(
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    key: js.UndefOr[String] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (key.isDefined) {p.key = key}

    jsFnComponent(p)(children: _*)
  }

}
        
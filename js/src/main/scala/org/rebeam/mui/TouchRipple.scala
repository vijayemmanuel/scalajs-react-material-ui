
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object TouchRipple {
  
  @js.native
  trait Props extends js.Object {
    var center: js.UndefOr[Boolean] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var key: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/TouchRipple", JSImport.Default)
  @js.native
  object TouchRippleJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](TouchRippleJS)
  
  /**
   * 
   * @param center
   *        If `true`, the ripple starts at the center of the component
   *        rather than at the point of interaction.
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param key
   *        React key
   */
  def apply(
    center: js.UndefOr[Boolean] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    key: js.UndefOr[String] = js.undefined
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (center.isDefined) {p.center = center}
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (key.isDefined) {p.key = key}

    jsFnComponent(p)()
  }

}
        
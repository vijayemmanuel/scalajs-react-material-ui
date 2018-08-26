
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Fade {
  
  @js.native
  trait Props extends js.Object {
    var in: js.UndefOr[Boolean] = js.native
    var key: js.UndefOr[String] = js.native
    var onEnter: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onExit: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var style: js.UndefOr[js.Any] = js.native
    var theme: js.Any = js.native
    var timeout: js.UndefOr[js.Any] = js.native
  }

  @JSImport("@material-ui/core/Fade", JSImport.Default)
  @js.native
  object FadeJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](FadeJS)
  
  /**
   * The Fade transition is used by the [Modal](/utils/modal) component.
   * It uses [react-transition-group](https://github.com/reactjs/react-transition-group) internally.
   * @param in
   *        If `true`, the component will transition in.
   * @param key
   *        React key
   * @param onEnter
   *        Property spread to root element
   * @param onExit
   *        Property spread to root element
   * @param style
   *        Property spread to root element
   * @param theme
   *        Property spread to root element
   * @param timeout
   *        The duration for the transition, in milliseconds.
   *        You may specify a single timeout for all transitions, or individually with an object.
   */
  def apply(
    in: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[String] = js.undefined,
    onEnter: js.UndefOr[Callback] = js.undefined,
    onExit: js.UndefOr[Callback] = js.undefined,
    style: js.UndefOr[js.Any] = js.undefined,
    theme: js.Any,
    timeout: js.UndefOr[js.Any] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (in.isDefined) {p.in = in}
    if (key.isDefined) {p.key = key}
    if (onEnter.isDefined) {p.onEnter = onEnter.map(v => v.toJsFn)}
    if (onExit.isDefined) {p.onExit = onExit.map(v => v.toJsFn)}
    if (style.isDefined) {p.style = style}
    p.theme = theme
    if (timeout.isDefined) {p.timeout = timeout}

    jsFnComponent(p)(children: _*)
  }

}
        
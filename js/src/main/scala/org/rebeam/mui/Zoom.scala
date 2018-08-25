
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Zoom {
  
  @js.native
  trait Props extends js.Object {
    var in: js.UndefOr[Boolean] = js.native
    var onEnter: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onExit: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var style: js.UndefOr[js.Any] = js.native
    var theme: js.Any = js.native
    var timeout: js.UndefOr[js.Any] = js.native
  }

  @JSImport("@material-ui/core/Zoom", JSImport.Default)
  @js.native
  object ZoomJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](ZoomJS)
  
  /**
   * The Zoom transition can be used for the floating variant of the
   * [Button](https://material-ui.com/demos/buttons/#floating-action-buttons) component.
   * It uses [react-transition-group](https://github.com/reactjs/react-transition-group) internally.
   * @param in
   *        If `true`, the component will transition in.
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
    onEnter: js.UndefOr[Callback] = js.undefined,
    onExit: js.UndefOr[Callback] = js.undefined,
    style: js.UndefOr[js.Any] = js.undefined,
    theme: js.Any,
    timeout: js.UndefOr[js.Any] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.in = in
    p.onEnter = onEnter.map(v => v.toJsFn)
    p.onExit = onExit.map(v => v.toJsFn)
    p.style = style
    p.theme = theme
    p.timeout = timeout

    jsFnComponent(p)(children: _*)
  }

}
        
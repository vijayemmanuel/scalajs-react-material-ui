
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Grow {
  
  @js.native
  trait Props extends js.Object {
    var in: js.UndefOr[Boolean] = js.native
    var onEnter: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onExit: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var style: js.UndefOr[js.Any] = js.native
    var theme: js.Any = js.native
    var timeout: js.UndefOr[js.Any] = js.native
  }

  @JSImport("@material-ui/core/Grow", JSImport.Default)
  @js.native
  object GrowJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](GrowJS)
  
  /**
   * The Grow transition is used by the [Tooltip](/demos/tooltips) and
   * [Popover](/utils/popover) components.
   * It uses [react-transition-group](https://github.com/reactjs/react-transition-group) internally.
   * @param in
   *        If `true`, show the component; triggers the enter or exit animation.
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
   *        
   *        Set to 'auto' to automatically calculate transition time based on height.
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
    if (in.isDefined) {p.in = in}
    if (onEnter.isDefined) {p.onEnter = onEnter.map(v => v.toJsFn)}
    if (onExit.isDefined) {p.onExit = onExit.map(v => v.toJsFn)}
    if (style.isDefined) {p.style = style}
    p.theme = theme
    if (timeout.isDefined) {p.timeout = timeout}

    jsFnComponent(p)(children: _*)
  }

}
        
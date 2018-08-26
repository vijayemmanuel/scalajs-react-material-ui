
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Slide {
  
  sealed trait Direction{ val value: String }

  object Direction {
    case object Left extends Direction { val value: String = "left" }
    case object Right extends Direction { val value: String = "right" }
    case object Up extends Direction { val value: String = "up" }
    case object Down extends Direction { val value: String = "down" }
  }
          
  @js.native
  trait Props extends js.Object {
    var direction: js.UndefOr[String] = js.native
    var in: js.UndefOr[Boolean] = js.native
    var onEnter: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onEntering: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onExit: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onExited: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var style: js.UndefOr[js.Any] = js.native
    var theme: js.Any = js.native
    var timeout: js.UndefOr[js.Any] = js.native
  }

  @JSImport("@material-ui/core/Slide", JSImport.Default)
  @js.native
  object SlideJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](SlideJS)
  
  /**
   * The Slide transition is used by the [Snackbar](/demos/snackbars) component.
   * It uses [react-transition-group](https://github.com/reactjs/react-transition-group) internally.
   * @param direction
   *        Direction the child node will enter from.
   * @param in
   *        If `true`, show the component; triggers the enter or exit animation.
   * @param onEnter
   *        Property spread to root element
   * @param onEntering
   *        Property spread to root element
   * @param onExit
   *        Property spread to root element
   * @param onExited
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
    direction: js.UndefOr[Direction] = js.undefined,
    in: js.UndefOr[Boolean] = js.undefined,
    onEnter: js.UndefOr[Callback] = js.undefined,
    onEntering: js.UndefOr[Callback] = js.undefined,
    onExit: js.UndefOr[Callback] = js.undefined,
    onExited: js.UndefOr[Callback] = js.undefined,
    style: js.UndefOr[js.Any] = js.undefined,
    theme: js.Any,
    timeout: js.UndefOr[js.Any] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (direction.isDefined) {p.direction = direction.map(v => v.value)}
    if (in.isDefined) {p.in = in}
    if (onEnter.isDefined) {p.onEnter = onEnter.map(v => v.toJsFn)}
    if (onEntering.isDefined) {p.onEntering = onEntering.map(v => v.toJsFn)}
    if (onExit.isDefined) {p.onExit = onExit.map(v => v.toJsFn)}
    if (onExited.isDefined) {p.onExited = onExited.map(v => v.toJsFn)}
    if (style.isDefined) {p.style = style}
    p.theme = theme
    if (timeout.isDefined) {p.timeout = timeout}

    jsFnComponent(p)(children: _*)
  }

}
        
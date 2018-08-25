
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Collapse {
  
  @js.native
  trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var collapsedHeight: js.UndefOr[String] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var in: js.UndefOr[Boolean] = js.native
    var onEnter: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onEntered: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onEntering: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onExit: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onExiting: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var style: js.UndefOr[js.Any] = js.native
    var theme: js.Any = js.native
    var timeout: js.UndefOr[js.Any] = js.native
  }

  @JSImport("@material-ui/core/Collapse", JSImport.Default)
  @js.native
  object CollapseJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](CollapseJS)
  
  /**
   * The Collapse transition is used by the
   * [Vertical Stepper](/demos/steppers#vertical-stepper) StepContent component.
   * It uses [react-transition-group](https://github.com/reactjs/react-transition-group) internally.
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param collapsedHeight
   *        The height of the container when collapsed.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   * @param in
   *        If `true`, the component will transition in.
   * @param onEnter
   *        Property spread to root element
   * @param onEntered
   *        Property spread to root element
   * @param onEntering
   *        Property spread to root element
   * @param onExit
   *        Property spread to root element
   * @param onExiting
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
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    collapsedHeight: js.UndefOr[String] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    in: js.UndefOr[Boolean] = js.undefined,
    onEnter: js.UndefOr[Callback] = js.undefined,
    onEntered: js.UndefOr[Callback] = js.undefined,
    onEntering: js.UndefOr[Callback] = js.undefined,
    onExit: js.UndefOr[Callback] = js.undefined,
    onExiting: js.UndefOr[Callback] = js.undefined,
    style: js.UndefOr[js.Any] = js.undefined,
    theme: js.Any,
    timeout: js.UndefOr[js.Any] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.className = className
    p.classes = classes
    p.collapsedHeight = collapsedHeight
    p.component = component
    p.in = in
    p.onEnter = onEnter.map(v => v.toJsFn)
    p.onEntered = onEntered.map(v => v.toJsFn)
    p.onEntering = onEntering.map(v => v.toJsFn)
    p.onExit = onExit.map(v => v.toJsFn)
    p.onExiting = onExiting.map(v => v.toJsFn)
    p.style = style
    p.theme = theme
    p.timeout = timeout

    jsFnComponent(p)(children: _*)
  }

}
        
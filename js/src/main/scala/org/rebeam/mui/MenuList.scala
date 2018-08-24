
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object MenuList {
  
  @js.native
  trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var dense: js.UndefOr[Boolean] = js.native
    var disablePadding: js.UndefOr[Boolean] = js.native
    var onBlur: js.UndefOr[scalajs.js.Function1[ReactFocusEvent, Unit]] = js.native
    var onKeyDown: js.UndefOr[scalajs.js.Function1[ReactKeyboardEvent, Unit]] = js.native
    var subheader: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
  }

  @JSImport("@material-ui/core/MenuList", JSImport.Default)
  @js.native
  object MenuListJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](MenuListJS)
  
  /**
   * 
   * @param className
   *        @ignore
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   *        Passed to List
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   *        Passed to List
   * @param dense
   *        If `true`, compact vertical padding designed for keyboard and mouse input will be used for
   *        the list and list items. The property is available to descendant components as the
   *        `dense` context.
   *        Passed to List
   * @param disablePadding
   *        If `true`, vertical padding will be removed from the list.
   *        Passed to List
   * @param onBlur
   *        @ignore
   * @param onKeyDown
   *        @ignore
   * @param subheader
   *        The content of the subheader, normally `ListSubheader`.
   *        Passed to List
   */
  def apply(
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    dense: js.UndefOr[Boolean] = js.undefined,
    disablePadding: js.UndefOr[Boolean] = js.undefined,
    onBlur: js.UndefOr[ReactFocusEvent => Callback] = js.undefined,
    onKeyDown: js.UndefOr[ReactKeyboardEvent => Callback] = js.undefined,
    subheader: js.UndefOr[VdomNode] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.className = className
    p.classes = classes
    p.component = component
    p.dense = dense
    p.disablePadding = disablePadding
    p.onBlur = onBlur.map(v => (e: ReactFocusEvent) => v(e).runNow())
    p.onKeyDown = onKeyDown.map(v => (e: ReactKeyboardEvent) => v(e).runNow())
    p.subheader = subheader.map(v => v.rawNode)

    jsFnComponent(p)(children: _*)
  }

}
    
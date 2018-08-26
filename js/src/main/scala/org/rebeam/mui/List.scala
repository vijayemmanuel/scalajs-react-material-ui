
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object List {
  
  @js.native
  trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var dense: js.UndefOr[Boolean] = js.native
    var disablePadding: js.UndefOr[Boolean] = js.native
    var key: js.UndefOr[String] = js.native
    var subheader: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
  }

  @JSImport("@material-ui/core/List", JSImport.Default)
  @js.native
  object ListJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](ListJS)
  
  /**
   * 
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   * @param dense
   *        If `true`, compact vertical padding designed for keyboard and mouse input will be used for
   *        the list and list items. The property is available to descendant components as the
   *        `dense` context.
   * @param disablePadding
   *        If `true`, vertical padding will be removed from the list.
   * @param key
   *        React key
   * @param subheader
   *        The content of the subheader, normally `ListSubheader`.
   */
  def apply(
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    dense: js.UndefOr[Boolean] = js.undefined,
    disablePadding: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[String] = js.undefined,
    subheader: js.UndefOr[VdomNode] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (component.isDefined) {p.component = component}
    if (dense.isDefined) {p.dense = dense}
    if (disablePadding.isDefined) {p.disablePadding = disablePadding}
    if (key.isDefined) {p.key = key}
    if (subheader.isDefined) {p.subheader = subheader.map(v => v.rawNode)}

    jsFnComponent(p)(children: _*)
  }

}
        

package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object TableRow {
  
  @js.native
  trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var hover: js.UndefOr[Boolean] = js.native
    var selected: js.UndefOr[Boolean] = js.native
  }

  @JSImport("@material-ui/core/TableRow", JSImport.Default)
  @js.native
  object TableRowJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](TableRowJS)
  
  /**
   * Will automatically set dynamic row height
   * based on the material table element parent (head, body, etc).
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   * @param hover
   *        If `true`, the table row will shade on hover.
   * @param selected
   *        If `true`, the table row will have the selected shading.
   */
  def apply(
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    hover: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.className = className
    p.classes = classes
    p.component = component
    p.hover = hover
    p.selected = selected

    jsFnComponent(p)(children: _*)
  }

}
        
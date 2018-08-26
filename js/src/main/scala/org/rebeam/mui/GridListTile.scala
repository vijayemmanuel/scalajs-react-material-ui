
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object GridListTile {
  
  @js.native
  trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var cols: js.UndefOr[Double] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var key: js.UndefOr[String] = js.native
    var rows: js.UndefOr[Double] = js.native
  }

  @JSImport("@material-ui/core/GridListTile", JSImport.Default)
  @js.native
  object GridListTileJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](GridListTileJS)
  
  /**
   * 
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param cols
   *        Width of the tile in number of grid cells.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   * @param key
   *        React key
   * @param rows
   *        Height of the tile in number of grid cells.
   */
  def apply(
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    cols: js.UndefOr[Double] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    key: js.UndefOr[String] = js.undefined,
    rows: js.UndefOr[Double] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (cols.isDefined) {p.cols = cols}
    if (component.isDefined) {p.component = component}
    if (key.isDefined) {p.key = key}
    if (rows.isDefined) {p.rows = rows}

    jsFnComponent(p)(children: _*)
  }

}
        
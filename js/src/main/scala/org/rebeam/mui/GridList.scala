
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object GridList {
  
  @js.native
  trait Props extends js.Object {
    var key: js.UndefOr[String] = js.native
    var cellHeight: js.UndefOr[js.Any] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var cols: js.UndefOr[Double] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var spacing: js.UndefOr[Double] = js.native
    var style: js.UndefOr[js.Any] = js.native
  }

  @JSImport("@material-ui/core/GridList", JSImport.Default)
  @js.native
  object GridListJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](GridListJS)
  
  /**
   * 
   * @param key
   *        React key
   * @param cellHeight
   *        Number of px for one cell height.
   *        You can set `'auto'` if you want to let the children determine the height.
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param cols
   *        Number of columns.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   * @param spacing
   *        Number of px for the spacing between tiles.
   * @param style
   *        Property spread to root element
   */
  def apply(
    key: js.UndefOr[String] = js.undefined,
    cellHeight: js.UndefOr[js.Any] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    cols: js.UndefOr[Double] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    spacing: js.UndefOr[Double] = js.undefined,
    style: js.UndefOr[js.Any] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (key.isDefined) {p.key = key}
    if (cellHeight.isDefined) {p.cellHeight = cellHeight}
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (cols.isDefined) {p.cols = cols}
    if (component.isDefined) {p.component = component}
    if (spacing.isDefined) {p.spacing = spacing}
    if (style.isDefined) {p.style = style}

    jsFnComponent(p)(children: _*)
  }

}
        

package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object ListSubheader {
  
  sealed trait Color{ val value: String }

  object Color {
    case object Default extends Color { val value: String = "default" }
    case object Primary extends Color { val value: String = "primary" }
    case object Inherit extends Color { val value: String = "inherit" }
  }
          
  @js.native
  trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var color: js.UndefOr[String] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var disableGutters: js.UndefOr[Boolean] = js.native
    var disableSticky: js.UndefOr[Boolean] = js.native
    var inset: js.UndefOr[Boolean] = js.native
  }

  @JSImport("@material-ui/core/ListSubheader", JSImport.Default)
  @js.native
  object ListSubheaderJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](ListSubheaderJS)
  
  /**
   * 
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param color
   *        The color of the component. It supports those theme colors that make sense for this component.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   * @param disableGutters
   *        If `true`, the List Subheader will not have gutters.
   * @param disableSticky
   *        If `true`, the List Subheader will not stick to the top during scroll.
   * @param inset
   *        If `true`, the List Subheader will be indented.
   */
  def apply(
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    color: js.UndefOr[Color] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    disableGutters: js.UndefOr[Boolean] = js.undefined,
    disableSticky: js.UndefOr[Boolean] = js.undefined,
    inset: js.UndefOr[Boolean] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (color.isDefined) {p.color = color.map(v => v.value)}
    if (component.isDefined) {p.component = component}
    if (disableGutters.isDefined) {p.disableGutters = disableGutters}
    if (disableSticky.isDefined) {p.disableSticky = disableSticky}
    if (inset.isDefined) {p.inset = inset}

    jsFnComponent(p)(children: _*)
  }

}
        
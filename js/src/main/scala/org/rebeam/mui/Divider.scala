
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Divider {
  
  @js.native
  trait Props extends js.Object {
    var absolute: js.UndefOr[Boolean] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var inset: js.UndefOr[Boolean] = js.native
    var light: js.UndefOr[Boolean] = js.native
  }

  @JSImport("@material-ui/core/Divider", JSImport.Default)
  @js.native
  object DividerJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](DividerJS)
  
  /**
   * 
   * @param absolute
   *        
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   * @param inset
   *        If `true`, the divider will be indented.
   * @param light
   *        If `true`, the divider will have a lighter color.
   */
  def apply(
    absolute: js.UndefOr[Boolean] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    inset: js.UndefOr[Boolean] = js.undefined,
    light: js.UndefOr[Boolean] = js.undefined
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.absolute = absolute
    p.className = className
    p.classes = classes
    p.component = component
    p.inset = inset
    p.light = light

    jsFnComponent(p)()
  }

}
        
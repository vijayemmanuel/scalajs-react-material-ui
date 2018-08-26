
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Icon {
  
  sealed trait Color{ val value: String }

  object Color {
    case object Secondary extends Color { val value: String = "secondary" }
    case object Primary extends Color { val value: String = "primary" }
    case object Disabled extends Color { val value: String = "disabled" }
    case object Action extends Color { val value: String = "action" }
    case object Error extends Color { val value: String = "error" }
    case object Inherit extends Color { val value: String = "inherit" }
  }
            
  sealed trait FontSize{ val value: String }

  object FontSize {
    case object Inherit extends FontSize { val value: String = "inherit" }
    case object Default extends FontSize { val value: String = "default" }
  }
          
  @js.native
  trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var color: js.UndefOr[String] = js.native
    var fontSize: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/Icon", JSImport.Default)
  @js.native
  object IconJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](IconJS)
  
  /**
   * 
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param color
   *        The color of the component. It supports those theme colors that make sense for this component.
   * @param fontSize
   *        The fontSize applied to the icon. Defaults to 24px, but can be configure to inherit font size.
   */
  def apply(
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    color: js.UndefOr[Color] = js.undefined,
    fontSize: js.UndefOr[FontSize] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (color.isDefined) {p.color = color.map(v => v.value)}
    if (fontSize.isDefined) {p.fontSize = fontSize.map(v => v.value)}

    jsFnComponent(p)(children: _*)
  }

}
        
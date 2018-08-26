
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Toolbar {
  
  sealed trait Variant{ val value: String }

  object Variant {
    case object Regular extends Variant { val value: String = "regular" }
    case object Dense extends Variant { val value: String = "dense" }
  }
          
  @js.native
  trait Props extends js.Object {
    var key: js.UndefOr[String] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var disableGutters: js.UndefOr[Boolean] = js.native
    var variant: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/Toolbar", JSImport.Default)
  @js.native
  object ToolbarJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](ToolbarJS)
  
  /**
   * 
   * @param key
   *        React key
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param disableGutters
   *        If `true`, disables gutter padding.
   * @param variant
   *        The variant to use.
   */
  def apply(
    key: js.UndefOr[String] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    disableGutters: js.UndefOr[Boolean] = js.undefined,
    variant: js.UndefOr[Variant] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (key.isDefined) {p.key = key}
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (disableGutters.isDefined) {p.disableGutters = disableGutters}
    if (variant.isDefined) {p.variant = variant.map(v => v.value)}

    jsFnComponent(p)(children: _*)
  }

}
        
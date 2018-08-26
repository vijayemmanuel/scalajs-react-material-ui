
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object DialogTitle {
  
  @js.native
  trait Props extends js.Object {
    var key: js.UndefOr[String] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var disableTypography: js.UndefOr[Boolean] = js.native
  }

  @JSImport("@material-ui/core/DialogTitle", JSImport.Default)
  @js.native
  object DialogTitleJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](DialogTitleJS)
  
  /**
   * 
   * @param key
   *        React key
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param disableTypography
   *        If `true`, the children won't be wrapped by a typography component.
   *        For instance, this can be useful to render an h4 instead of the default h2.
   */
  def apply(
    key: js.UndefOr[String] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    disableTypography: js.UndefOr[Boolean] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (key.isDefined) {p.key = key}
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (disableTypography.isDefined) {p.disableTypography = disableTypography}

    jsFnComponent(p)(children: _*)
  }

}
        
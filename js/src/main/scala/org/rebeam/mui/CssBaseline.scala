
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object CssBaseline {
  
  @js.native
  trait Props extends js.Object {
    var classes: js.UndefOr[js.Any] = js.native
    var key: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/CssBaseline", JSImport.Default)
  @js.native
  object CssBaselineJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](CssBaselineJS)
  
  /**
   * Kickstart an elegant, consistent, and simple baseline to build upon.
   * @param classes
   *        Property spread to root element
   * @param key
   *        React key
   */
  def apply(
    classes: js.UndefOr[js.Any] = js.undefined,
    key: js.UndefOr[String] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (classes.isDefined) {p.classes = classes}
    if (key.isDefined) {p.key = key}

    jsFnComponent(p)(children: _*)
  }

}
        
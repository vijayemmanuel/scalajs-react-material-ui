
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object FormGroup {
  
  @js.native
  trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var key: js.UndefOr[String] = js.native
    var row: js.UndefOr[Boolean] = js.native
  }

  @JSImport("@material-ui/core/FormGroup", JSImport.Default)
  @js.native
  object FormGroupJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](FormGroupJS)
  
  /**
   * `FormGroup` wraps controls such as `Checkbox` and `Switch`.
   * It provides compact row layout.
   * For the `Radio`, you should be using the `RadioGroup` component instead of this one.
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param key
   *        React key
   * @param row
   *        Display group of elements in a compact row.
   */
  def apply(
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    key: js.UndefOr[String] = js.undefined,
    row: js.UndefOr[Boolean] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (key.isDefined) {p.key = key}
    if (row.isDefined) {p.row = row}

    jsFnComponent(p)(children: _*)
  }

}
        
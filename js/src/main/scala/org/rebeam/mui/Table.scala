
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Table {
  
  sealed trait Padding{ val value: String }

  object Padding {
    case object Default extends Padding { val value: String = "default" }
    case object Checkbox extends Padding { val value: String = "checkbox" }
    case object Dense extends Padding { val value: String = "dense" }
    case object None extends Padding { val value: String = "none" }
  }
          
  @js.native
  trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var padding: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/Table", JSImport.Default)
  @js.native
  object TableJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](TableJS)
  
  /**
   * 
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   * @param padding
   *        Allows TableCells to inherit padding of the Table.
   */
  def apply(
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    padding: js.UndefOr[Padding] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.className = className
    p.classes = classes
    p.component = component
    p.padding = padding.map(v => v.value)

    jsFnComponent(p)(children: _*)
  }

}
        
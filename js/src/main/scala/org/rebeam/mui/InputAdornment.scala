
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object InputAdornment {
  
  sealed trait Position{ val value: String }

  object Position {
    case object Start extends Position { val value: String = "start" }
    case object End extends Position { val value: String = "end" }
  }
          
  @js.native
  trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var disableTypography: js.UndefOr[Boolean] = js.native
    var position: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/InputAdornment", JSImport.Default)
  @js.native
  object InputAdornmentJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](InputAdornmentJS)
  
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
   * @param disableTypography
   *        If children is a string then disable wrapping in a Typography component.
   * @param position
   *        The position this adornment should appear relative to the `Input`.
   */
  def apply(
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    disableTypography: js.UndefOr[Boolean] = js.undefined,
    position: js.UndefOr[Position] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.className = className
    p.classes = classes
    p.component = component
    p.disableTypography = disableTypography
    p.position = position.map(v => v.value)

    jsFnComponent(p)(children: _*)
  }

}
        
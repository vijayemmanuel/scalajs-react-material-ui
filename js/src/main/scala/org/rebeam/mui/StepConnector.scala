
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object StepConnector {
  
  sealed trait Orientation{ val value: String }

  object Orientation {
    case object Horizontal extends Orientation { val value: String = "horizontal" }
    case object Vertical extends Orientation { val value: String = "vertical" }
  }
          
  @js.native
  trait Props extends js.Object {
    var alternativeLabel: js.UndefOr[Boolean] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var orientation: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/StepConnector", JSImport.Default)
  @js.native
  object StepConnectorJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](StepConnectorJS)
  
  /**
   * 
   * @param alternativeLabel
   *        Property spread to root element
   *        Set internally by Step when it's supplied with the alternativeLabel property.
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param orientation
   *        Property spread to root element
   */
  def apply(
    alternativeLabel: js.UndefOr[Boolean] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    orientation: js.UndefOr[Orientation] = js.undefined
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (alternativeLabel.isDefined) {p.alternativeLabel = alternativeLabel}
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (orientation.isDefined) {p.orientation = orientation.map(v => v.value)}

    jsFnComponent(p)()
  }

}
        

package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Stepper {
  
  sealed trait Orientation{ val value: String }

  object Orientation {
    case object Horizontal extends Orientation { val value: String = "horizontal" }
    case object Vertical extends Orientation { val value: String = "vertical" }
  }
          
  @js.native
  trait Props extends js.Object {
    var activeStep: js.UndefOr[Double] = js.native
    var alternativeLabel: js.UndefOr[Boolean] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var connector: js.UndefOr[japgolly.scalajs.react.raw.React.Element] = js.native
    var elevation: js.UndefOr[Double] = js.native
    var nonLinear: js.UndefOr[Boolean] = js.native
    var orientation: js.UndefOr[String] = js.native
    var square: js.UndefOr[Boolean] = js.native
  }

  @JSImport("@material-ui/core/Stepper", JSImport.Default)
  @js.native
  object StepperJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](StepperJS)
  
  /**
   * 
   * @param activeStep
   *        Set the active step (zero based index).
   * @param alternativeLabel
   *        If set to 'true' and orientation is horizontal,
   *        then the step label will be positioned under the icon.
   * @param className
   *        @ignore
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   *        Passed to Paper
   * @param connector
   *        A component to be placed between each step.
   * @param elevation
   *        Shadow depth, corresponds to `dp` in the spec.
   *        It's accepting values between 0 and 24 inclusive.
   *        Passed to Paper
   * @param nonLinear
   *        If set the `Stepper` will not assist in controlling steps for linear flow.
   * @param orientation
   *        The stepper orientation (layout flow direction).
   * @param square
   *        If `true`, rounded corners are disabled.
   *        Passed to Paper
   */
  def apply(
    activeStep: js.UndefOr[Double] = js.undefined,
    alternativeLabel: js.UndefOr[Boolean] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    connector: js.UndefOr[VdomElement] = js.undefined,
    elevation: js.UndefOr[Double] = js.undefined,
    nonLinear: js.UndefOr[Boolean] = js.undefined,
    orientation: js.UndefOr[Orientation] = js.undefined,
    square: js.UndefOr[Boolean] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.activeStep = activeStep
    p.alternativeLabel = alternativeLabel
    p.className = className
    p.classes = classes
    p.component = component
    p.connector = connector.map(v => v.rawElement)
    p.elevation = elevation
    p.nonLinear = nonLinear
    p.orientation = orientation.map(v => v.value)
    p.square = square

    jsFnComponent(p)(children: _*)
  }

}
    
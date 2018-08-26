
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object MobileStepper {
  
  sealed trait Position{ val value: String }

  object Position {
    case object Bottom extends Position { val value: String = "bottom" }
    case object Top extends Position { val value: String = "top" }
    case object Static extends Position { val value: String = "static" }
  }
            
  sealed trait Variant{ val value: String }

  object Variant {
    case object Text extends Variant { val value: String = "text" }
    case object Dots extends Variant { val value: String = "dots" }
    case object Progress extends Variant { val value: String = "progress" }
  }
          
  @js.native
  trait Props extends js.Object {
    var LinearProgressProps: js.UndefOr[js.Any] = js.native
    var activeStep: js.UndefOr[Double] = js.native
    var backButton: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var elevation: js.UndefOr[Double] = js.native
    var nextButton: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var position: js.UndefOr[String] = js.native
    var square: js.UndefOr[Boolean] = js.native
    var steps: Double = js.native
    var variant: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/MobileStepper", JSImport.Default)
  @js.native
  object MobileStepperJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](MobileStepperJS)
  
  /**
   * 
   * @param LinearProgressProps
   *        Properties applied to the `LinearProgress` element.
   * @param activeStep
   *        Set the active step (zero based index).
   *        Defines which dot is highlighted when the variant is 'dots'.
   * @param backButton
   *        A back button element. For instance, it can be be a `Button` or a `IconButton`.
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   *        Passed to Paper
   * @param elevation
   *        Shadow depth, corresponds to `dp` in the spec.
   *        It's accepting values between 0 and 24 inclusive.
   *        Passed to Paper
   * @param nextButton
   *        A next button element. For instance, it can be be a `Button` or a `IconButton`.
   * @param position
   *        Set the positioning type.
   * @param square
   *        If `true`, rounded corners are disabled.
   *        Passed to Paper
   * @param steps
   *        The total steps.
   * @param variant
   *        The variant to use.
   */
  def apply(
    LinearProgressProps: js.UndefOr[js.Any] = js.undefined,
    activeStep: js.UndefOr[Double] = js.undefined,
    backButton: js.UndefOr[VdomNode] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    elevation: js.UndefOr[Double] = js.undefined,
    nextButton: js.UndefOr[VdomNode] = js.undefined,
    position: js.UndefOr[Position] = js.undefined,
    square: js.UndefOr[Boolean] = js.undefined,
    steps: Double,
    variant: js.UndefOr[Variant] = js.undefined
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (LinearProgressProps.isDefined) {p.LinearProgressProps = LinearProgressProps}
    if (activeStep.isDefined) {p.activeStep = activeStep}
    if (backButton.isDefined) {p.backButton = backButton.map(v => v.rawNode)}
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (component.isDefined) {p.component = component}
    if (elevation.isDefined) {p.elevation = elevation}
    if (nextButton.isDefined) {p.nextButton = nextButton.map(v => v.rawNode)}
    if (position.isDefined) {p.position = position.map(v => v.value)}
    if (square.isDefined) {p.square = square}
    p.steps = steps
    if (variant.isDefined) {p.variant = variant.map(v => v.value)}

    jsFnComponent(p)()
  }

}
        
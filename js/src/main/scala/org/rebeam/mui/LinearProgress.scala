
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object LinearProgress {
  
  sealed trait Color{ val value: String }

  object Color {
    case object Primary extends Color { val value: String = "primary" }
    case object Secondary extends Color { val value: String = "secondary" }
  }
            
  sealed trait Variant{ val value: String }

  object Variant {
    case object Determinate extends Variant { val value: String = "determinate" }
    case object Indeterminate extends Variant { val value: String = "indeterminate" }
    case object Buffer extends Variant { val value: String = "buffer" }
    case object Query extends Variant { val value: String = "query" }
  }
          
  @js.native
  trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var color: js.UndefOr[String] = js.native
    var key: js.UndefOr[String] = js.native
    var value: js.UndefOr[Double] = js.native
    var valueBuffer: js.UndefOr[Double] = js.native
    var variant: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/LinearProgress", JSImport.Default)
  @js.native
  object LinearProgressJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](LinearProgressJS)
  
  /**
   * ## ARIA
   * 
   * If the progress bar is describing the loading progress of a particular region of a page,
   * you should use `aria-describedby` to point to the progress bar, and set the `aria-busy`
   * attribute to `true` on that region until it has finished loading.
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param color
   *        The color of the component. It supports those theme colors that make sense for this component.
   * @param key
   *        React key
   * @param value
   *        The value of the progress indicator for the determinate and buffer variants.
   *        Value between 0 and 100.
   * @param valueBuffer
   *        The value for the buffer variant.
   *        Value between 0 and 100.
   * @param variant
   *        The variant to use.
   *        Use indeterminate or query when there is no progress value.
   */
  def apply(
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    color: js.UndefOr[Color] = js.undefined,
    key: js.UndefOr[String] = js.undefined,
    value: js.UndefOr[Double] = js.undefined,
    valueBuffer: js.UndefOr[Double] = js.undefined,
    variant: js.UndefOr[Variant] = js.undefined
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (color.isDefined) {p.color = color.map(v => v.value)}
    if (key.isDefined) {p.key = key}
    if (value.isDefined) {p.value = value}
    if (valueBuffer.isDefined) {p.valueBuffer = valueBuffer}
    if (variant.isDefined) {p.variant = variant.map(v => v.value)}

    jsFnComponent(p)()
  }

}
        
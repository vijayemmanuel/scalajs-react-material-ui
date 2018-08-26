
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Backdrop {
  
  @js.native
  trait Props extends js.Object {
    var key: js.UndefOr[String] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var invisible: js.UndefOr[Boolean] = js.native
    var open: Boolean = js.native
    var transitionDuration: js.UndefOr[js.Any] = js.native
  }

  @JSImport("@material-ui/core/Backdrop", JSImport.Default)
  @js.native
  object BackdropJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](BackdropJS)
  
  /**
   * 
   * @param key
   *        React key
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param invisible
   *        If `true`, the backdrop is invisible.
   *        It can be used when rendering a popover or a custom select component.
   * @param open
   *        If `true`, the backdrop is open.
   * @param transitionDuration
   *        The duration for the transition, in milliseconds.
   *        You may specify a single timeout for all transitions, or individually with an object.
   */
  def apply(
    key: js.UndefOr[String] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    invisible: js.UndefOr[Boolean] = js.undefined,
    open: Boolean,
    transitionDuration: js.UndefOr[js.Any] = js.undefined
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (key.isDefined) {p.key = key}
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (invisible.isDefined) {p.invisible = invisible}
    p.open = open
    if (transitionDuration.isDefined) {p.transitionDuration = transitionDuration}

    jsFnComponent(p)()
  }

}
        
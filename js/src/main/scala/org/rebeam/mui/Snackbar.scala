
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Snackbar {
  
  @js.native
  trait Props extends js.Object {
    var ContentProps: js.UndefOr[js.Any] = js.native
    var TransitionComponent: js.UndefOr[js.Any] = js.native
    var TransitionProps: js.UndefOr[js.Any] = js.native
    var action: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var anchorOrigin: js.UndefOr[js.Any] = js.native
    var autoHideDuration: js.UndefOr[Double] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var disableWindowBlurListener: js.UndefOr[Boolean] = js.native
    var key: js.UndefOr[js.Any] = js.native
    var message: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var onClose: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onEnter: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onEntered: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onEntering: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onExit: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onExited: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onExiting: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onMouseEnter: js.UndefOr[scalajs.js.Function1[ReactMouseEvent, Unit]] = js.native
    var onMouseLeave: js.UndefOr[scalajs.js.Function1[ReactMouseEvent, Unit]] = js.native
    var open: js.UndefOr[Boolean] = js.native
    var resumeHideDuration: js.UndefOr[Double] = js.native
    var transitionDuration: js.UndefOr[js.Any] = js.native
  }

  @JSImport("@material-ui/core/Snackbar", JSImport.Default)
  @js.native
  object SnackbarJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](SnackbarJS)
  
  /**
   * 
   * @param ContentProps
   *        Properties applied to the [`SnackbarContent`](/api/snackbar-content) element.
   * @param TransitionComponent
   *        Transition component.
   * @param TransitionProps
   *        Properties applied to the `Transition` element.
   * @param action
   *        The action to display.
   * @param anchorOrigin
   *        The anchor of the `Snackbar`.
   * @param autoHideDuration
   *        The number of milliseconds to wait before automatically calling the
   *        `onClose` function. `onClose` should then set the state of the `open`
   *        prop to hide the Snackbar. This behavior is disabled by default with
   *        the `null` value.
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param disableWindowBlurListener
   *        If `true`, the `autoHideDuration` timer will expire even if the window is not focused.
   * @param key
   *        When displaying multiple consecutive Snackbars from a parent rendering a single
   *        <Snackbar/>, add the key property to ensure independent treatment of each message.
   *        e.g. <Snackbar key={message} />, otherwise, the message may update-in-place and
   *        features such as autoHideDuration may be canceled.
   * @param message
   *        The message to display.
   * @param onClose
   *        Callback fired when the component requests to be closed.
   *        Typically `onClose` is used to set state in the parent component,
   *        which is used to control the `Snackbar` `open` prop.
   *        The `reason` parameter can optionally be used to control the response to `onClose`,
   *        for example ignoring `clickaway`.
   *        
   *        parameter {object} event The event source of the callback
   *        parameter {string} reason Can be:`"timeout"` (`autoHideDuration` expired) or: `"clickaway"`
   * @param onEnter
   *        Callback fired before the transition is entering.
   * @param onEntered
   *        Callback fired when the transition has entered.
   * @param onEntering
   *        Callback fired when the transition is entering.
   * @param onExit
   *        Callback fired before the transition is exiting.
   * @param onExited
   *        Callback fired when the transition has exited.
   * @param onExiting
   *        Callback fired when the transition is exiting.
   * @param onMouseEnter
   *        Property spread to root element
   * @param onMouseLeave
   *        Property spread to root element
   * @param open
   *        If true, `Snackbar` is open.
   * @param resumeHideDuration
   *        The number of milliseconds to wait before dismissing after user interaction.
   *        If `autoHideDuration` property isn't specified, it does nothing.
   *        If `autoHideDuration` property is specified but `resumeHideDuration` isn't,
   *        we default to `autoHideDuration / 2` ms.
   * @param transitionDuration
   *        The duration for the transition, in milliseconds.
   *        You may specify a single timeout for all transitions, or individually with an object.
   */
  def apply(
    ContentProps: js.UndefOr[js.Any] = js.undefined,
    TransitionComponent: js.UndefOr[js.Any] = js.undefined,
    TransitionProps: js.UndefOr[js.Any] = js.undefined,
    action: js.UndefOr[VdomNode] = js.undefined,
    anchorOrigin: js.UndefOr[js.Any] = js.undefined,
    autoHideDuration: js.UndefOr[Double] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    disableWindowBlurListener: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[js.Any] = js.undefined,
    message: js.UndefOr[VdomNode] = js.undefined,
    onClose: js.UndefOr[Callback] = js.undefined,
    onEnter: js.UndefOr[Callback] = js.undefined,
    onEntered: js.UndefOr[Callback] = js.undefined,
    onEntering: js.UndefOr[Callback] = js.undefined,
    onExit: js.UndefOr[Callback] = js.undefined,
    onExited: js.UndefOr[Callback] = js.undefined,
    onExiting: js.UndefOr[Callback] = js.undefined,
    onMouseEnter: js.UndefOr[ReactMouseEvent => Callback] = js.undefined,
    onMouseLeave: js.UndefOr[ReactMouseEvent => Callback] = js.undefined,
    open: js.UndefOr[Boolean] = js.undefined,
    resumeHideDuration: js.UndefOr[Double] = js.undefined,
    transitionDuration: js.UndefOr[js.Any] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (ContentProps.isDefined) {p.ContentProps = ContentProps}
    if (TransitionComponent.isDefined) {p.TransitionComponent = TransitionComponent}
    if (TransitionProps.isDefined) {p.TransitionProps = TransitionProps}
    if (action.isDefined) {p.action = action.map(v => v.rawNode)}
    if (anchorOrigin.isDefined) {p.anchorOrigin = anchorOrigin}
    if (autoHideDuration.isDefined) {p.autoHideDuration = autoHideDuration}
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (disableWindowBlurListener.isDefined) {p.disableWindowBlurListener = disableWindowBlurListener}
    if (key.isDefined) {p.key = key}
    if (message.isDefined) {p.message = message.map(v => v.rawNode)}
    if (onClose.isDefined) {p.onClose = onClose.map(v => v.toJsFn)}
    if (onEnter.isDefined) {p.onEnter = onEnter.map(v => v.toJsFn)}
    if (onEntered.isDefined) {p.onEntered = onEntered.map(v => v.toJsFn)}
    if (onEntering.isDefined) {p.onEntering = onEntering.map(v => v.toJsFn)}
    if (onExit.isDefined) {p.onExit = onExit.map(v => v.toJsFn)}
    if (onExited.isDefined) {p.onExited = onExited.map(v => v.toJsFn)}
    if (onExiting.isDefined) {p.onExiting = onExiting.map(v => v.toJsFn)}
    if (onMouseEnter.isDefined) {p.onMouseEnter = onMouseEnter.map(v => (e: ReactMouseEvent) => v(e).runNow())}
    if (onMouseLeave.isDefined) {p.onMouseLeave = onMouseLeave.map(v => (e: ReactMouseEvent) => v(e).runNow())}
    if (open.isDefined) {p.open = open}
    if (resumeHideDuration.isDefined) {p.resumeHideDuration = resumeHideDuration}
    if (transitionDuration.isDefined) {p.transitionDuration = transitionDuration}

    jsFnComponent(p)(children: _*)
  }

}
        
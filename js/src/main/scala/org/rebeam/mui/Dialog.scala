
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Dialog {
  
  sealed trait MaxWidth{ val value: String }

  object MaxWidth {
    case object Xs extends MaxWidth { val value: String = "xs" }
    case object Sm extends MaxWidth { val value: String = "sm" }
    case object Md extends MaxWidth { val value: String = "md" }
    case object False extends MaxWidth { val value: String = "false" }
  }
            
  sealed trait Scroll{ val value: String }

  object Scroll {
    case object Body extends Scroll { val value: String = "body" }
    case object Paper extends Scroll { val value: String = "paper" }
  }
          
  @js.native
  trait Props extends js.Object {
    var BackdropComponent: js.UndefOr[js.Any] = js.native
    var BackdropProps: js.UndefOr[js.Any] = js.native
    var PaperProps: js.UndefOr[js.Any] = js.native
    var TransitionComponent: js.UndefOr[js.Any] = js.native
    var TransitionProps: js.UndefOr[js.Any] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var container: js.UndefOr[js.Any] = js.native
    var disableAutoFocus: js.UndefOr[Boolean] = js.native
    var disableBackdropClick: js.UndefOr[Boolean] = js.native
    var disableEnforceFocus: js.UndefOr[Boolean] = js.native
    var disableEscapeKeyDown: js.UndefOr[Boolean] = js.native
    var disablePortal: js.UndefOr[Boolean] = js.native
    var disableRestoreFocus: js.UndefOr[Boolean] = js.native
    var fullScreen: js.UndefOr[Boolean] = js.native
    var fullWidth: js.UndefOr[Boolean] = js.native
    var hideBackdrop: js.UndefOr[Boolean] = js.native
    var keepMounted: js.UndefOr[Boolean] = js.native
    var manager: js.UndefOr[js.Any] = js.native
    var maxWidth: js.UndefOr[String] = js.native
    var onBackdropClick: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onClose: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onEnter: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onEntered: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onEntering: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onEscapeKeyDown: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onExit: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onExited: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onExiting: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onRendered: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var open: Boolean = js.native
    var scroll: js.UndefOr[String] = js.native
    var transitionDuration: js.UndefOr[js.Any] = js.native
  }

  @JSImport("@material-ui/core/Dialog", JSImport.Default)
  @js.native
  object DialogJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](DialogJS)
  
  /**
   * Dialogs are overlaid modal paper based components with a backdrop.
   * @param BackdropComponent
   *        A backdrop component. This property enables custom backdrop rendering.
   *        Passed to Modal
   * @param BackdropProps
   *        @ignore
   * @param PaperProps
   *        Properties applied to the [`Paper`](/api/paper) element.
   * @param TransitionComponent
   *        Transition component.
   * @param TransitionProps
   *        Properties applied to the `Transition` element.
   * @param className
   *        @ignore
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param container
   *        A node, component instance, or function that returns either.
   *        The `container` will have the portal children appended to it.
   *        Passed to Modal
   * @param disableAutoFocus
   *        If `true`, the modal will not automatically shift focus to itself when it opens, and
   *        replace it to the last focused element when it closes.
   *        This also works correctly with any modal children that have the `disableAutoFocus` prop.
   *        
   *        Generally this should never be set to `true` as it makes the modal less
   *        accessible to assistive technologies, like screen readers.
   *        Passed to Modal
   * @param disableBackdropClick
   *        If `true`, clicking the backdrop will not fire the `onClose` callback.
   * @param disableEnforceFocus
   *        If `true`, the modal will not prevent focus from leaving the modal while open.
   *        
   *        Generally this should never be set to `true` as it makes the modal less
   *        accessible to assistive technologies, like screen readers.
   *        Passed to Modal
   * @param disableEscapeKeyDown
   *        If `true`, hitting escape will not fire the `onClose` callback.
   * @param disablePortal
   *        Disable the portal behavior.
   *        The children stay within it's parent DOM hierarchy.
   *        Passed to Modal
   * @param disableRestoreFocus
   *        If `true`, the modal will not restore focus to previously focused element once
   *        modal is hidden.
   *        Passed to Modal
   * @param fullScreen
   *        If `true`, the dialog will be full-screen
   * @param fullWidth
   *        If `true`, the dialog stretches to `maxWidth`.
   * @param hideBackdrop
   *        If `true`, the backdrop is not rendered.
   *        Passed to Modal
   * @param keepMounted
   *        Always keep the children in the DOM.
   *        This property can be useful in SEO situation or
   *        when you want to maximize the responsiveness of the Modal.
   *        Passed to Modal
   * @param manager
   *        A modal manager used to track and manage the state of open
   *        Modals. This enables customizing how modals interact within a container.
   *        Passed to Modal
   * @param maxWidth
   *        Determine the max width of the dialog.
   *        The dialog width grows with the size of the screen, this property is useful
   *        on the desktop where you might need some coherent different width size across your
   *        application. Set to `false` to disable `maxWidth`.
   * @param onBackdropClick
   *        Callback fired when the backdrop is clicked.
   * @param onClose
   *        Callback fired when the component requests to be closed.
   *        
   *        @param {object} event The event source of the callback
   * @param onEnter
   *        Callback fired before the dialog enters.
   * @param onEntered
   *        Callback fired when the dialog has entered.
   * @param onEntering
   *        Callback fired when the dialog is entering.
   * @param onEscapeKeyDown
   *        Callback fired when the escape key is pressed,
   *        `disableKeyboard` is false and the modal is in focus.
   * @param onExit
   *        Callback fired before the dialog exits.
   * @param onExited
   *        Callback fired when the dialog has exited.
   * @param onExiting
   *        Callback fired when the dialog is exiting.
   * @param onRendered
   *        Callback fired once the children has been mounted into the `container`.
   *        It signals that the `open={true}` property took effect.
   *        Passed to Modal
   * @param open
   *        If `true`, the Dialog is open.
   * @param scroll
   *        Determine the container for scrolling the dialog.
   * @param transitionDuration
   *        The duration for the transition, in milliseconds.
   *        You may specify a single timeout for all transitions, or individually with an object.
   */
  def apply(
    BackdropComponent: js.UndefOr[js.Any] = js.undefined,
    BackdropProps: js.UndefOr[js.Any] = js.undefined,
    PaperProps: js.UndefOr[js.Any] = js.undefined,
    TransitionComponent: js.UndefOr[js.Any] = js.undefined,
    TransitionProps: js.UndefOr[js.Any] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    container: js.UndefOr[js.Any] = js.undefined,
    disableAutoFocus: js.UndefOr[Boolean] = js.undefined,
    disableBackdropClick: js.UndefOr[Boolean] = js.undefined,
    disableEnforceFocus: js.UndefOr[Boolean] = js.undefined,
    disableEscapeKeyDown: js.UndefOr[Boolean] = js.undefined,
    disablePortal: js.UndefOr[Boolean] = js.undefined,
    disableRestoreFocus: js.UndefOr[Boolean] = js.undefined,
    fullScreen: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    hideBackdrop: js.UndefOr[Boolean] = js.undefined,
    keepMounted: js.UndefOr[Boolean] = js.undefined,
    manager: js.UndefOr[js.Any] = js.undefined,
    maxWidth: js.UndefOr[MaxWidth] = js.undefined,
    onBackdropClick: js.UndefOr[Callback] = js.undefined,
    onClose: js.UndefOr[Callback] = js.undefined,
    onEnter: js.UndefOr[Callback] = js.undefined,
    onEntered: js.UndefOr[Callback] = js.undefined,
    onEntering: js.UndefOr[Callback] = js.undefined,
    onEscapeKeyDown: js.UndefOr[Callback] = js.undefined,
    onExit: js.UndefOr[Callback] = js.undefined,
    onExited: js.UndefOr[Callback] = js.undefined,
    onExiting: js.UndefOr[Callback] = js.undefined,
    onRendered: js.UndefOr[Callback] = js.undefined,
    open: Boolean,
    scroll: js.UndefOr[Scroll] = js.undefined,
    transitionDuration: js.UndefOr[js.Any] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.BackdropComponent = BackdropComponent
    p.BackdropProps = BackdropProps
    p.PaperProps = PaperProps
    p.TransitionComponent = TransitionComponent
    p.TransitionProps = TransitionProps
    p.className = className
    p.classes = classes
    p.container = container
    p.disableAutoFocus = disableAutoFocus
    p.disableBackdropClick = disableBackdropClick
    p.disableEnforceFocus = disableEnforceFocus
    p.disableEscapeKeyDown = disableEscapeKeyDown
    p.disablePortal = disablePortal
    p.disableRestoreFocus = disableRestoreFocus
    p.fullScreen = fullScreen
    p.fullWidth = fullWidth
    p.hideBackdrop = hideBackdrop
    p.keepMounted = keepMounted
    p.manager = manager
    p.maxWidth = maxWidth.map(v => v.value)
    p.onBackdropClick = onBackdropClick.map(v => v.toJsFn)
    p.onClose = onClose.map(v => v.toJsFn)
    p.onEnter = onEnter.map(v => v.toJsFn)
    p.onEntered = onEntered.map(v => v.toJsFn)
    p.onEntering = onEntering.map(v => v.toJsFn)
    p.onEscapeKeyDown = onEscapeKeyDown.map(v => v.toJsFn)
    p.onExit = onExit.map(v => v.toJsFn)
    p.onExited = onExited.map(v => v.toJsFn)
    p.onExiting = onExiting.map(v => v.toJsFn)
    p.onRendered = onRendered.map(v => v.toJsFn)
    p.open = open
    p.scroll = scroll.map(v => v.value)
    p.transitionDuration = transitionDuration

    jsFnComponent(p)(children: _*)
  }

}
    
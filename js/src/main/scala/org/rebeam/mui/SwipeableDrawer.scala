
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object SwipeableDrawer {
  
  sealed trait Anchor{ val value: String }

  object Anchor {
    case object Left extends Anchor { val value: String = "left" }
    case object Top extends Anchor { val value: String = "top" }
    case object Right extends Anchor { val value: String = "right" }
    case object Bottom extends Anchor { val value: String = "bottom" }
  }
            
  sealed trait Variant{ val value: String }

  object Variant {
    case object Permanent extends Variant { val value: String = "permanent" }
    case object Persistent extends Variant { val value: String = "persistent" }
    case object Temporary extends Variant { val value: String = "temporary" }
  }
          
  @js.native
  trait Props extends js.Object {
    var ModalProps: js.UndefOr[js.Any] = js.native
    var PaperProps: js.UndefOr[js.Any] = js.native
    var SlideProps: js.UndefOr[js.Any] = js.native
    var anchor: js.UndefOr[String] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var disableBackdropTransition: js.UndefOr[Boolean] = js.native
    var disableDiscovery: js.UndefOr[Boolean] = js.native
    var disableSwipeToOpen: js.UndefOr[Boolean] = js.native
    var elevation: js.UndefOr[Double] = js.native
    var onClose: scalajs.js.Function0[Unit] = js.native
    var onOpen: scalajs.js.Function0[Unit] = js.native
    var open: Boolean = js.native
    var swipeAreaWidth: js.UndefOr[Double] = js.native
    var theme: js.Any = js.native
    var transitionDuration: js.UndefOr[js.Any] = js.native
    var variant: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/SwipeableDrawer", JSImport.Default)
  @js.native
  object SwipeableDrawerJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](SwipeableDrawerJS)
  
  /**
   * 
   * @param ModalProps
   *        @ignore
   * @param PaperProps
   *        @ignore
   * @param SlideProps
   *        Properties applied to the [`Slide`](/api/slide) element.
   *        Passed to Drawer
   * @param anchor
   *        @ignore
   * @param className
   *        @ignore
   *        Passed to Drawer
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   *        Passed to Drawer
   * @param disableBackdropTransition
   *        Disable the backdrop transition.
   *        This can improve the FPS on low-end devices.
   * @param disableDiscovery
   *        If `true`, touching the screen near the edge of the drawer will not slide in the drawer a bit
   *        to promote accidental discovery of the swipe gesture.
   * @param disableSwipeToOpen
   *        If `true`, swipe to open is disabled. This is useful in browsers where swiping triggers
   *        navigation actions. Swipe to open is disabled on iOS browsers by default.
   * @param elevation
   *        The elevation of the drawer.
   *        Passed to Drawer
   * @param onClose
   *        Callback fired when the component requests to be closed.
   *        
   *        @param {object} event The event source of the callback
   * @param onOpen
   *        Callback fired when the component requests to be opened.
   *        
   *        @param {object} event The event source of the callback
   * @param open
   *        If `true`, the drawer is open.
   * @param swipeAreaWidth
   *        The width of the left most (or right most) area in pixels where the
   *        drawer can be swiped open from.
   * @param theme
   *        @ignore
   * @param transitionDuration
   *        The duration for the transition, in milliseconds.
   *        You may specify a single timeout for all transitions, or individually with an object.
   * @param variant
   *        @ignore
   */
  def apply(
    ModalProps: js.UndefOr[js.Any] = js.undefined,
    PaperProps: js.UndefOr[js.Any] = js.undefined,
    SlideProps: js.UndefOr[js.Any] = js.undefined,
    anchor: js.UndefOr[Anchor] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    disableBackdropTransition: js.UndefOr[Boolean] = js.undefined,
    disableDiscovery: js.UndefOr[Boolean] = js.undefined,
    disableSwipeToOpen: js.UndefOr[Boolean] = js.undefined,
    elevation: js.UndefOr[Double] = js.undefined,
    onClose: Callback,
    onOpen: Callback,
    open: Boolean,
    swipeAreaWidth: js.UndefOr[Double] = js.undefined,
    theme: js.Any,
    transitionDuration: js.UndefOr[js.Any] = js.undefined,
    variant: js.UndefOr[Variant] = js.undefined
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.ModalProps = ModalProps
    p.PaperProps = PaperProps
    p.SlideProps = SlideProps
    p.anchor = anchor.map(v => v.value)
    p.className = className
    p.classes = classes
    p.disableBackdropTransition = disableBackdropTransition
    p.disableDiscovery = disableDiscovery
    p.disableSwipeToOpen = disableSwipeToOpen
    p.elevation = elevation
    p.onClose = onClose.toJsFn
    p.onOpen = onOpen.toJsFn
    p.open = open
    p.swipeAreaWidth = swipeAreaWidth
    p.theme = theme
    p.transitionDuration = transitionDuration
    p.variant = variant.map(v => v.value)

    jsFnComponent(p)()
  }

}
    
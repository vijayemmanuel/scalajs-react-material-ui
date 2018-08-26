
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object ClickAwayListener {
  
  sealed trait MouseEvent{ val value: String }

  object MouseEvent {
    case object OnClick extends MouseEvent { val value: String = "onClick" }
    case object OnMouseDown extends MouseEvent { val value: String = "onMouseDown" }
    case object OnMouseUp extends MouseEvent { val value: String = "onMouseUp" }
    case object False extends MouseEvent { val value: String = "false" }
  }
            
  sealed trait TouchEvent{ val value: String }

  object TouchEvent {
    case object OnTouchStart extends TouchEvent { val value: String = "onTouchStart" }
    case object OnTouchEnd extends TouchEvent { val value: String = "onTouchEnd" }
    case object False extends TouchEvent { val value: String = "false" }
  }
          
  @js.native
  trait Props extends js.Object {
    var key: js.UndefOr[String] = js.native
    var mouseEvent: js.UndefOr[String] = js.native
    var onClickAway: scalajs.js.Function0[Unit] = js.native
    var touchEvent: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/ClickAwayListener", JSImport.Default)
  @js.native
  object ClickAwayListenerJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](ClickAwayListenerJS)
  
  /**
   * Listen for click events that occur somewhere in the document, outside of the element itself.
   * For instance, if you need to hide a menu when people click anywhere else on your page.
   * @param key
   *        React key
   * @param mouseEvent
   *        The mouse event to listen to. You can disable the listener by providing `false`.
   * @param onClickAway
   *        Callback fired when a "click away" event is detected.
   * @param touchEvent
   *        The touch event to listen to. You can disable the listener by providing `false`.
   */
  def apply(
    key: js.UndefOr[String] = js.undefined,
    mouseEvent: js.UndefOr[MouseEvent] = js.undefined,
    onClickAway: Callback,
    touchEvent: js.UndefOr[TouchEvent] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (key.isDefined) {p.key = key}
    if (mouseEvent.isDefined) {p.mouseEvent = mouseEvent.map(v => v.value)}
    p.onClickAway = onClickAway.toJsFn
    if (touchEvent.isDefined) {p.touchEvent = touchEvent.map(v => v.value)}

    jsFnComponent(p)(children: _*)
  }

}
        
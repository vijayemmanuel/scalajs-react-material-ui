
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object GridListTileBar {
  
  sealed trait ActionPosition{ val value: String }

  object ActionPosition {
    case object Left extends ActionPosition { val value: String = "left" }
    case object Right extends ActionPosition { val value: String = "right" }
  }
            
  sealed trait TitlePosition{ val value: String }

  object TitlePosition {
    case object Top extends TitlePosition { val value: String = "top" }
    case object Bottom extends TitlePosition { val value: String = "bottom" }
  }
          
  @js.native
  trait Props extends js.Object {
    var actionIcon: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var actionPosition: js.UndefOr[String] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var subtitle: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var title: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var titlePosition: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/GridListTileBar", JSImport.Default)
  @js.native
  object GridListTileBarJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](GridListTileBarJS)
  
  /**
   * 
   * @param actionIcon
   *        An IconButton element to be used as secondary action target
   *        (primary action target is the tile itself).
   * @param actionPosition
   *        Position of secondary action IconButton.
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param subtitle
   *        String or element serving as subtitle (support text).
   * @param title
   *        Title to be displayed on tile.
   * @param titlePosition
   *        Position of the title bar.
   */
  def apply(
    actionIcon: js.UndefOr[VdomNode] = js.undefined,
    actionPosition: js.UndefOr[ActionPosition] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    subtitle: js.UndefOr[VdomNode] = js.undefined,
    title: js.UndefOr[VdomNode] = js.undefined,
    titlePosition: js.UndefOr[TitlePosition] = js.undefined
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.actionIcon = actionIcon.map(v => v.rawNode)
    p.actionPosition = actionPosition.map(v => v.value)
    p.className = className
    p.classes = classes
    p.subtitle = subtitle.map(v => v.rawNode)
    p.title = title.map(v => v.rawNode)
    p.titlePosition = titlePosition.map(v => v.value)

    jsFnComponent(p)()
  }

}
        
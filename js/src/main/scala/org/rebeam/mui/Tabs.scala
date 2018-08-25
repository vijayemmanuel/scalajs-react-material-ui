
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Tabs {
  
  sealed trait IndicatorColor{ val value: String }

  object IndicatorColor {
    case object Secondary extends IndicatorColor { val value: String = "secondary" }
    case object Primary extends IndicatorColor { val value: String = "primary" }
  }
            
  sealed trait ScrollButtons{ val value: String }

  object ScrollButtons {
    case object Auto extends ScrollButtons { val value: String = "auto" }
    case object On extends ScrollButtons { val value: String = "on" }
    case object Off extends ScrollButtons { val value: String = "off" }
  }
            
  sealed trait TextColor{ val value: String }

  object TextColor {
    case object Secondary extends TextColor { val value: String = "secondary" }
    case object Primary extends TextColor { val value: String = "primary" }
    case object Inherit extends TextColor { val value: String = "inherit" }
  }
          
  @js.native
  trait Props extends js.Object {
    var ScrollButtonComponent: js.UndefOr[js.Any] = js.native
    var TabIndicatorProps: js.UndefOr[js.Any] = js.native
    var action: js.UndefOr[js.Any] = js.native
    var centered: js.UndefOr[Boolean] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var fullWidth: js.UndefOr[Boolean] = js.native
    var indicatorColor: js.UndefOr[String] = js.native
    var onChange: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var scrollButtons: js.UndefOr[String] = js.native
    var scrollable: js.UndefOr[Boolean] = js.native
    var textColor: js.UndefOr[String] = js.native
    var theme: js.Any = js.native
    var value: js.UndefOr[js.Any] = js.native
  }

  @JSImport("@material-ui/core/Tabs", JSImport.Default)
  @js.native
  object TabsJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](TabsJS)
  
  /**
   * 
   * @param ScrollButtonComponent
   *        The component used to render the scroll buttons.
   * @param TabIndicatorProps
   *        Properties applied to the `TabIndicator` element.
   * @param action
   *        Callback fired when the component mounts.
   *        This is useful when you want to trigger an action programmatically.
   *        It currently only supports `updateIndicator()` action.
   *        
   *        parameter {object} actions This object contains all possible actions
   *        that can be triggered programmatically.
   * @param centered
   *        If `true`, the tabs will be centered.
   *        This property is intended for large views.
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   * @param fullWidth
   *        If `true`, the tabs will grow to use all the available space.
   *        This property is intended for small views, like on mobile.
   * @param indicatorColor
   *        Determines the color of the indicator.
   * @param onChange
   *        Callback fired when the value changes.
   *        
   *        parameter {object} event The event source of the callback
   *        parameter {number} value We default to the index of the child
   * @param scrollButtons
   *        Determine behavior of scroll buttons when tabs are set to scroll
   *        `auto` will only present them on medium and larger viewports
   *        `on` will always present them
   *        `off` will never present them
   * @param scrollable
   *        True invokes scrolling properties and allow for horizontally scrolling
   *        (or swiping) the tab bar.
   * @param textColor
   *        Determines the color of the `Tab`.
   * @param theme
   *        Property spread to root element
   * @param value
   *        The value of the currently selected `Tab`.
   *        If you don't want any selected `Tab`, you can set this property to `false`.
   */
  def apply(
    ScrollButtonComponent: js.UndefOr[js.Any] = js.undefined,
    TabIndicatorProps: js.UndefOr[js.Any] = js.undefined,
    action: js.UndefOr[js.Any] = js.undefined,
    centered: js.UndefOr[Boolean] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    indicatorColor: js.UndefOr[IndicatorColor] = js.undefined,
    onChange: js.UndefOr[Callback] = js.undefined,
    scrollButtons: js.UndefOr[ScrollButtons] = js.undefined,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    textColor: js.UndefOr[TextColor] = js.undefined,
    theme: js.Any,
    value: js.UndefOr[js.Any] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.ScrollButtonComponent = ScrollButtonComponent
    p.TabIndicatorProps = TabIndicatorProps
    p.action = action
    p.centered = centered
    p.className = className
    p.classes = classes
    p.component = component
    p.fullWidth = fullWidth
    p.indicatorColor = indicatorColor.map(v => v.value)
    p.onChange = onChange.map(v => v.toJsFn)
    p.scrollButtons = scrollButtons.map(v => v.value)
    p.scrollable = scrollable
    p.textColor = textColor.map(v => v.value)
    p.theme = theme
    p.value = value

    jsFnComponent(p)(children: _*)
  }

}
        
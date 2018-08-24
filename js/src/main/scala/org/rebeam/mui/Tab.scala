
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Tab {
  
  sealed trait TextColor{ val value: String }

  object TextColor {
    case object Secondary extends TextColor { val value: String = "secondary" }
    case object Primary extends TextColor { val value: String = "primary" }
    case object Inherit extends TextColor { val value: String = "inherit" }
  }
          
  @js.native
  trait Props extends js.Object {
    var TouchRippleProps: js.UndefOr[js.Any] = js.native
    var action: js.UndefOr[js.Any] = js.native
    var buttonRef: js.UndefOr[js.Any] = js.native
    var centerRipple: js.UndefOr[Boolean] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var disableRipple: js.UndefOr[Boolean] = js.native
    var disableTouchRipple: js.UndefOr[Boolean] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var focusRipple: js.UndefOr[Boolean] = js.native
    var focusVisibleClassName: js.UndefOr[String] = js.native
    var fullWidth: js.UndefOr[Boolean] = js.native
    var icon: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var indicator: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var label: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var onBlur: js.UndefOr[scalajs.js.Function1[ReactFocusEvent, Unit]] = js.native
    var onChange: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onClick: js.UndefOr[scalajs.js.Function1[ReactMouseEvent, Unit]] = js.native
    var onFocus: js.UndefOr[scalajs.js.Function1[ReactFocusEvent, Unit]] = js.native
    var onFocusVisible: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onKeyDown: js.UndefOr[scalajs.js.Function1[ReactKeyboardEvent, Unit]] = js.native
    var onKeyUp: js.UndefOr[scalajs.js.Function1[ReactKeyboardEvent, Unit]] = js.native
    var onMouseDown: js.UndefOr[scalajs.js.Function1[ReactMouseEvent, Unit]] = js.native
    var onMouseLeave: js.UndefOr[scalajs.js.Function1[ReactMouseEvent, Unit]] = js.native
    var onMouseUp: js.UndefOr[scalajs.js.Function1[ReactMouseEvent, Unit]] = js.native
    var onTouchEnd: js.UndefOr[scalajs.js.Function1[ReactTouchEvent, Unit]] = js.native
    var onTouchMove: js.UndefOr[scalajs.js.Function1[ReactTouchEvent, Unit]] = js.native
    var onTouchStart: js.UndefOr[scalajs.js.Function1[ReactTouchEvent, Unit]] = js.native
    var role: js.UndefOr[String] = js.native
    var selected: js.UndefOr[Boolean] = js.native
    var tabIndex: js.UndefOr[js.Any] = js.native
    var textColor: js.UndefOr[String] = js.native
    var `type`: js.UndefOr[String] = js.native
    var value: js.UndefOr[js.Any] = js.native
  }

  @JSImport("@material-ui/core/Tab", JSImport.Default)
  @js.native
  object TabJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](TabJS)
  
  /**
   * 
   * @param TouchRippleProps
   *        Properties applied to the `TouchRipple` element.
   *        Passed to ButtonBase
   * @param action
   *        Callback fired when the component mounts.
   *        This is useful when you want to trigger an action programmatically.
   *        It currently only supports `focusVisible()` action.
   *        
   *        parameter {object} actions This object contains all possible actions
   *        that can be triggered programmatically.
   *        Passed to ButtonBase
   * @param buttonRef
   *        Use that property to pass a ref callback to the native button component.
   *        Passed to ButtonBase
   * @param centerRipple
   *        If `true`, the ripples will be centered.
   *        They won't start at the cursor interaction position.
   *        Passed to ButtonBase
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   *        Passed to ButtonBase
   * @param disableRipple
   *        If `true`, the ripple effect will be disabled.
   *        Passed to ButtonBase
   * @param disableTouchRipple
   *        If `true`, the touch ripple effect will be disabled.
   *        Passed to ButtonBase
   * @param disabled
   *        If `true`, the tab will be disabled.
   * @param focusRipple
   *        If `true`, the base button will have a keyboard focus ripple.
   *        `disableRipple` must also be `false`.
   *        Passed to ButtonBase
   * @param focusVisibleClassName
   *        This property can help a person know which element has the keyboard focus.
   *        The class name will be applied when the element gain the focus through a keyboard interaction.
   *        It's a polyfill for the [CSS :focus-visible feature](https://drafts.csswg.org/selectors-4/#the-focus-visible-pseudo).
   *        The rational for using this feature [is explain here](https://github.com/WICG/focus-visible/blob/master/explainer.md).
   *        Passed to ButtonBase
   * @param fullWidth
   *        Property spread to root element
   * @param icon
   *        The icon element.
   * @param indicator
   *        Property spread to root element
   *        For server side rendering consideration, we let the selected tab
   *        render the indicator.
   * @param label
   *        The label element.
   * @param onBlur
   *        Property spread to root element
   *        Passed to ButtonBase
   * @param onChange
   *        Property spread to root element
   * @param onClick
   *        Property spread to root element
   * @param onFocus
   *        Property spread to root element
   *        Passed to ButtonBase
   * @param onFocusVisible
   *        Callback fired when the component is focused with a keyboard.
   *        We trigger a `onFocus` callback too.
   *        Passed to ButtonBase
   * @param onKeyDown
   *        Property spread to root element
   *        Passed to ButtonBase
   * @param onKeyUp
   *        Property spread to root element
   *        Passed to ButtonBase
   * @param onMouseDown
   *        Property spread to root element
   *        Passed to ButtonBase
   * @param onMouseLeave
   *        Property spread to root element
   *        Passed to ButtonBase
   * @param onMouseUp
   *        Property spread to root element
   *        Passed to ButtonBase
   * @param onTouchEnd
   *        Property spread to root element
   *        Passed to ButtonBase
   * @param onTouchMove
   *        Property spread to root element
   *        Passed to ButtonBase
   * @param onTouchStart
   *        Property spread to root element
   *        Passed to ButtonBase
   * @param role
   *        Property spread to root element
   *        Passed to ButtonBase
   * @param selected
   *        Property spread to root element
   * @param tabIndex
   *        Property spread to root element
   *        Passed to ButtonBase
   * @param textColor
   *        Property spread to root element
   * @param `type`
   *        Used to control the button's purpose.
   *        This property passes the value to the `type` attribute of the native button component.
   *        Valid property values include `button`, `submit`, and `reset`.
   *        Passed to ButtonBase
   * @param value
   *        You can provide your own value. Otherwise, we fallback to the child position index.
   */
  def apply(
    TouchRippleProps: js.UndefOr[js.Any] = js.undefined,
    action: js.UndefOr[js.Any] = js.undefined,
    buttonRef: js.UndefOr[js.Any] = js.undefined,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    disableRipple: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focusRipple: js.UndefOr[Boolean] = js.undefined,
    focusVisibleClassName: js.UndefOr[String] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    icon: js.UndefOr[VdomNode] = js.undefined,
    indicator: js.UndefOr[VdomNode] = js.undefined,
    label: js.UndefOr[VdomNode] = js.undefined,
    onBlur: js.UndefOr[ReactFocusEvent => Callback] = js.undefined,
    onChange: js.UndefOr[Callback] = js.undefined,
    onClick: js.UndefOr[ReactMouseEvent => Callback] = js.undefined,
    onFocus: js.UndefOr[ReactFocusEvent => Callback] = js.undefined,
    onFocusVisible: js.UndefOr[Callback] = js.undefined,
    onKeyDown: js.UndefOr[ReactKeyboardEvent => Callback] = js.undefined,
    onKeyUp: js.UndefOr[ReactKeyboardEvent => Callback] = js.undefined,
    onMouseDown: js.UndefOr[ReactMouseEvent => Callback] = js.undefined,
    onMouseLeave: js.UndefOr[ReactMouseEvent => Callback] = js.undefined,
    onMouseUp: js.UndefOr[ReactMouseEvent => Callback] = js.undefined,
    onTouchEnd: js.UndefOr[ReactTouchEvent => Callback] = js.undefined,
    onTouchMove: js.UndefOr[ReactTouchEvent => Callback] = js.undefined,
    onTouchStart: js.UndefOr[ReactTouchEvent => Callback] = js.undefined,
    role: js.UndefOr[String] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    tabIndex: js.UndefOr[js.Any] = js.undefined,
    textColor: js.UndefOr[TextColor] = js.undefined,
    `type`: js.UndefOr[String] = js.undefined,
    value: js.UndefOr[js.Any] = js.undefined
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.TouchRippleProps = TouchRippleProps
    p.action = action
    p.buttonRef = buttonRef
    p.centerRipple = centerRipple
    p.className = className
    p.classes = classes
    p.component = component
    p.disableRipple = disableRipple
    p.disableTouchRipple = disableTouchRipple
    p.disabled = disabled
    p.focusRipple = focusRipple
    p.focusVisibleClassName = focusVisibleClassName
    p.fullWidth = fullWidth
    p.icon = icon.map(v => v.rawNode)
    p.indicator = indicator.map(v => v.rawNode)
    p.label = label.map(v => v.rawNode)
    p.onBlur = onBlur.map(v => (e: ReactFocusEvent) => v(e).runNow())
    p.onChange = onChange.map(v => v.toJsFn)
    p.onClick = onClick.map(v => (e: ReactMouseEvent) => v(e).runNow())
    p.onFocus = onFocus.map(v => (e: ReactFocusEvent) => v(e).runNow())
    p.onFocusVisible = onFocusVisible.map(v => v.toJsFn)
    p.onKeyDown = onKeyDown.map(v => (e: ReactKeyboardEvent) => v(e).runNow())
    p.onKeyUp = onKeyUp.map(v => (e: ReactKeyboardEvent) => v(e).runNow())
    p.onMouseDown = onMouseDown.map(v => (e: ReactMouseEvent) => v(e).runNow())
    p.onMouseLeave = onMouseLeave.map(v => (e: ReactMouseEvent) => v(e).runNow())
    p.onMouseUp = onMouseUp.map(v => (e: ReactMouseEvent) => v(e).runNow())
    p.onTouchEnd = onTouchEnd.map(v => (e: ReactTouchEvent) => v(e).runNow())
    p.onTouchMove = onTouchMove.map(v => (e: ReactTouchEvent) => v(e).runNow())
    p.onTouchStart = onTouchStart.map(v => (e: ReactTouchEvent) => v(e).runNow())
    p.role = role
    p.selected = selected
    p.tabIndex = tabIndex
    p.textColor = textColor.map(v => v.value)
    p.`type` = `type`
    p.value = value

    jsFnComponent(p)()
  }

}
        

package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object TableSortLabel {
  
  sealed trait Direction{ val value: String }

  object Direction {
    case object Asc extends Direction { val value: String = "asc" }
    case object Desc extends Direction { val value: String = "desc" }
  }
          
  @js.native
  trait Props extends js.Object {
    var TouchRippleProps: js.UndefOr[js.Any] = js.native
    var action: js.UndefOr[js.Any] = js.native
    var active: js.UndefOr[Boolean] = js.native
    var buttonRef: js.UndefOr[js.Any] = js.native
    var centerRipple: js.UndefOr[Boolean] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var direction: js.UndefOr[String] = js.native
    var disableRipple: js.UndefOr[Boolean] = js.native
    var disableTouchRipple: js.UndefOr[Boolean] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var focusRipple: js.UndefOr[Boolean] = js.native
    var focusVisibleClassName: js.UndefOr[String] = js.native
    var onBlur: js.UndefOr[scalajs.js.Function1[ReactFocusEvent, Unit]] = js.native
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
    var tabIndex: js.UndefOr[js.Any] = js.native
    var `type`: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/TableSortLabel", JSImport.Default)
  @js.native
  object TableSortLabelJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](TableSortLabelJS)
  
  /**
   * A button based label for placing inside `TableCell` for column sorting.
   * @param TouchRippleProps
   *        Properties applied to the `TouchRipple` element.
   *        Passed to ButtonBase
   * @param action
   *        Callback fired when the component mounts.
   *        This is useful when you want to trigger an action programmatically.
   *        It currently only supports `focusVisible()` action.
   *        
   *        @param {object} actions This object contains all possible actions
   *        that can be triggered programmatically.
   *        Passed to ButtonBase
   * @param active
   *        If `true`, the label will have the active styling (should be true for the sorted column).
   * @param buttonRef
   *        Use that property to pass a ref callback to the native button component.
   *        Passed to ButtonBase
   * @param centerRipple
   *        If `true`, the ripples will be centered.
   *        They won't start at the cursor interaction position.
   *        Passed to ButtonBase
   * @param className
   *        @ignore
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   *        Passed to ButtonBase
   * @param direction
   *        The current sort direction.
   * @param disableRipple
   *        If `true`, the ripple effect will be disabled.
   *        Passed to ButtonBase
   * @param disableTouchRipple
   *        If `true`, the touch ripple effect will be disabled.
   *        Passed to ButtonBase
   * @param disabled
   *        If `true`, the base button will be disabled.
   *        Passed to ButtonBase
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
   * @param onBlur
   *        @ignore
   *        Passed to ButtonBase
   * @param onClick
   *        @ignore
   *        Passed to ButtonBase
   * @param onFocus
   *        @ignore
   *        Passed to ButtonBase
   * @param onFocusVisible
   *        Callback fired when the component is focused with a keyboard.
   *        We trigger a `onFocus` callback too.
   *        Passed to ButtonBase
   * @param onKeyDown
   *        @ignore
   *        Passed to ButtonBase
   * @param onKeyUp
   *        @ignore
   *        Passed to ButtonBase
   * @param onMouseDown
   *        @ignore
   *        Passed to ButtonBase
   * @param onMouseLeave
   *        @ignore
   *        Passed to ButtonBase
   * @param onMouseUp
   *        @ignore
   *        Passed to ButtonBase
   * @param onTouchEnd
   *        @ignore
   *        Passed to ButtonBase
   * @param onTouchMove
   *        @ignore
   *        Passed to ButtonBase
   * @param onTouchStart
   *        @ignore
   *        Passed to ButtonBase
   * @param role
   *        @ignore
   *        Passed to ButtonBase
   * @param tabIndex
   *        @ignore
   *        Passed to ButtonBase
   * @param `type`
   *        Used to control the button's purpose.
   *        This property passes the value to the `type` attribute of the native button component.
   *        Valid property values include `button`, `submit`, and `reset`.
   *        Passed to ButtonBase
   */
  def apply(
    TouchRippleProps: js.UndefOr[js.Any] = js.undefined,
    action: js.UndefOr[js.Any] = js.undefined,
    active: js.UndefOr[Boolean] = js.undefined,
    buttonRef: js.UndefOr[js.Any] = js.undefined,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    direction: js.UndefOr[Direction] = js.undefined,
    disableRipple: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focusRipple: js.UndefOr[Boolean] = js.undefined,
    focusVisibleClassName: js.UndefOr[String] = js.undefined,
    onBlur: js.UndefOr[ReactFocusEvent => Callback] = js.undefined,
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
    tabIndex: js.UndefOr[js.Any] = js.undefined,
    `type`: js.UndefOr[String] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.TouchRippleProps = TouchRippleProps
    p.action = action
    p.active = active
    p.buttonRef = buttonRef
    p.centerRipple = centerRipple
    p.className = className
    p.classes = classes
    p.component = component
    p.direction = direction.map(v => v.value)
    p.disableRipple = disableRipple
    p.disableTouchRipple = disableTouchRipple
    p.disabled = disabled
    p.focusRipple = focusRipple
    p.focusVisibleClassName = focusVisibleClassName
    p.onBlur = onBlur.map(v => (e: ReactFocusEvent) => v(e).runNow())
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
    p.tabIndex = tabIndex
    p.`type` = `type`

    jsFnComponent(p)(children: _*)
  }

}
    

package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Button {
  
  sealed trait Color{ val value: String }

  object Color {
    case object Default extends Color { val value: String = "default" }
    case object Inherit extends Color { val value: String = "inherit" }
    case object Primary extends Color { val value: String = "primary" }
    case object Secondary extends Color { val value: String = "secondary" }
  }
            
  sealed trait Size{ val value: String }

  object Size {
    case object Small extends Size { val value: String = "small" }
    case object Medium extends Size { val value: String = "medium" }
    case object Large extends Size { val value: String = "large" }
  }
            
  sealed trait Variant{ val value: String }

  object Variant {
    case object Fab extends Variant { val value: String = "fab" }
    case object Raised extends Variant { val value: String = "raised" }
    case object Outlined extends Variant { val value: String = "outlined" }
    case object Flat extends Variant { val value: String = "flat" }
    case object Contained extends Variant { val value: String = "contained" }
    case object Text extends Variant { val value: String = "text" }
    case object ExtendedFab extends Variant { val value: String = "extendedFab" }
  }
          
  @js.native
  trait Props extends js.Object {
    var TouchRippleProps: js.UndefOr[js.Any] = js.native
    var action: js.UndefOr[js.Any] = js.native
    var buttonRef: js.UndefOr[js.Any] = js.native
    var centerRipple: js.UndefOr[Boolean] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var color: js.UndefOr[String] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var disableFocusRipple: js.UndefOr[Boolean] = js.native
    var disableRipple: js.UndefOr[Boolean] = js.native
    var disableTouchRipple: js.UndefOr[Boolean] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var focusRipple: js.UndefOr[Boolean] = js.native
    var focusVisibleClassName: js.UndefOr[String] = js.native
    var fullWidth: js.UndefOr[Boolean] = js.native
    var href: js.UndefOr[String] = js.native
    var mini: js.UndefOr[Boolean] = js.native
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
    var size: js.UndefOr[String] = js.native
    var tabIndex: js.UndefOr[js.Any] = js.native
    var `type`: js.UndefOr[String] = js.native
    var variant: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/Button", JSImport.Default)
  @js.native
  object ButtonJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](ButtonJS)
  
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
   *        @param {object} actions This object contains all possible actions
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
   *        @ignore
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param color
   *        The color of the component. It supports those theme colors that make sense for this component.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   * @param disableFocusRipple
   *        If `true`, the  keyboard focus ripple will be disabled.
   *        `disableRipple` must also be true.
   * @param disableRipple
   *        If `true`, the ripple effect will be disabled.
   * @param disableTouchRipple
   *        If `true`, the touch ripple effect will be disabled.
   *        Passed to ButtonBase
   * @param disabled
   *        If `true`, the button will be disabled.
   * @param focusRipple
   *        If `true`, the base button will have a keyboard focus ripple.
   *        `disableRipple` must also be `false`.
   *        Passed to ButtonBase
   * @param focusVisibleClassName
   *        @ignore
   * @param fullWidth
   *        If `true`, the button will take up the full width of its container.
   * @param href
   *        The URL to link to when the button is clicked.
   *        If defined, an `a` element will be used as the root node.
   * @param mini
   *        If `true`, and `variant` is `'fab'`, will use mini floating action button styling.
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
   * @param size
   *        The size of the button.
   *        `small` is equivalent to the dense button styling.
   * @param tabIndex
   *        @ignore
   *        Passed to ButtonBase
   * @param `type`
   *        @ignore
   * @param variant
   *        The variant to use.
   */
  def apply(
    TouchRippleProps: js.UndefOr[js.Any] = js.undefined,
    action: js.UndefOr[js.Any] = js.undefined,
    buttonRef: js.UndefOr[js.Any] = js.undefined,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    color: js.UndefOr[Color] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disableRipple: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focusRipple: js.UndefOr[Boolean] = js.undefined,
    focusVisibleClassName: js.UndefOr[String] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    href: js.UndefOr[String] = js.undefined,
    mini: js.UndefOr[Boolean] = js.undefined,
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
    size: js.UndefOr[Size] = js.undefined,
    tabIndex: js.UndefOr[js.Any] = js.undefined,
    `type`: js.UndefOr[String] = js.undefined,
    variant: js.UndefOr[Variant] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.TouchRippleProps = TouchRippleProps
    p.action = action
    p.buttonRef = buttonRef
    p.centerRipple = centerRipple
    p.className = className
    p.classes = classes
    p.color = color.map(v => v.value)
    p.component = component
    p.disableFocusRipple = disableFocusRipple
    p.disableRipple = disableRipple
    p.disableTouchRipple = disableTouchRipple
    p.disabled = disabled
    p.focusRipple = focusRipple
    p.focusVisibleClassName = focusVisibleClassName
    p.fullWidth = fullWidth
    p.href = href
    p.mini = mini
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
    p.size = size.map(v => v.value)
    p.tabIndex = tabIndex
    p.`type` = `type`
    p.variant = variant.map(v => v.value)

    jsFnComponent(p)(children: _*)
  }

}
    

package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object TextField {
  
  sealed trait Margin{ val value: String }

  object Margin {
    case object None extends Margin { val value: String = "none" }
    case object Dense extends Margin { val value: String = "dense" }
    case object Normal extends Margin { val value: String = "normal" }
  }
          
  @js.native
  trait Props extends js.Object {
    var FormHelperTextProps: js.UndefOr[js.Any] = js.native
    var InputLabelProps: js.UndefOr[js.Any] = js.native
    var InputProps: js.UndefOr[js.Any] = js.native
    var SelectProps: js.UndefOr[js.Any] = js.native
    var autoComplete: js.UndefOr[String] = js.native
    var autoFocus: js.UndefOr[Boolean] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var defaultValue: js.UndefOr[js.Any] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var error: js.UndefOr[Boolean] = js.native
    var fullWidth: js.UndefOr[Boolean] = js.native
    var helperText: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var id: js.UndefOr[String] = js.native
    var inputProps: js.UndefOr[js.Any] = js.native
    var inputRef: js.UndefOr[js.Any] = js.native
    var label: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var margin: js.UndefOr[String] = js.native
    var multiline: js.UndefOr[Boolean] = js.native
    var name: js.UndefOr[String] = js.native
    var onBlur: js.UndefOr[scalajs.js.Function1[ReactFocusEvent, Unit]] = js.native
    var onChange: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var onFocus: js.UndefOr[scalajs.js.Function1[ReactFocusEvent, Unit]] = js.native
    var placeholder: js.UndefOr[String] = js.native
    var required: js.UndefOr[Boolean] = js.native
    var rows: js.UndefOr[js.Any] = js.native
    var rowsMax: js.UndefOr[js.Any] = js.native
    var select: js.UndefOr[Boolean] = js.native
    var `type`: js.UndefOr[String] = js.native
    var value: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/TextField", JSImport.Default)
  @js.native
  object TextFieldJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](TextFieldJS)
  
  /**
   * The `TextField` is a convenience wrapper for the most common cases (80%).
   * It cannot be all things to all people, otherwise the API would grow out of control.
   * 
   * ## Advanced Configuration
   * 
   * It's important to understand that the text field is a simple abstraction
   * on top of the following components:
   * - [FormControl](/api/form-control)
   * - [InputLabel](/api/input-label)
   * - [Input](/api/input)
   * - [FormHelperText](/api/form-helper-text)
   * 
   * If you wish to alter the properties applied to the native input, you can do so as follows:
   * 
   * ```jsx
   * const inputProps = {
   *   step: 300,
   * };
   * 
   * return <TextField id="time" type="time" inputProps={inputProps} />;
   * ```
   * 
   * For advanced cases, please look at the source of TextField by clicking on the
   * "Edit this page" button above. Consider either:
   * - using the upper case props for passing values directly to the components
   * - using the underlying components directly as shown in the demos
   * @param FormHelperTextProps
   *        Properties applied to the [`FormHelperText`](/api/form-helper-text) element.
   * @param InputLabelProps
   *        Properties applied to the [`InputLabel`](/api/input-label) element.
   * @param InputProps
   *        Properties applied to the `Input` element.
   * @param SelectProps
   *        Properties applied to the [`Select`](/api/select) element.
   * @param autoComplete
   *        This property helps users to fill forms faster, especially on mobile devices.
   *        The name can be confusing, as it's more like an autofill.
   *        You can learn more about it here:
   *        https://html.spec.whatwg.org/multipage/form-control-infrastructure.html#autofill
   * @param autoFocus
   *        If `true`, the input will be focused during the first mount.
   * @param className
   *        @ignore
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   *        Passed to FormControl
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   *        Passed to FormControl
   * @param defaultValue
   *        The default value of the `Input` element.
   * @param disabled
   *        If `true`, the input will be disabled.
   * @param error
   *        If `true`, the label will be displayed in an error state.
   * @param fullWidth
   *        If `true`, the input will take up the full width of its container.
   * @param helperText
   *        The helper text content.
   * @param id
   *        The id of the `input` element.
   *        Use that property to make `label` and `helperText` accessible for screen readers.
   * @param inputProps
   *        Attributes applied to the native `input` element.
   * @param inputRef
   *        Use that property to pass a ref callback to the native input component.
   * @param label
   *        The label content.
   * @param margin
   *        If `dense` or `normal`, will adjust vertical spacing of this and contained components.
   * @param multiline
   *        If `true`, a textarea element will be rendered instead of an input.
   * @param name
   *        Name attribute of the `input` element.
   * @param onBlur
   *        Passed to underlying input element
   * @param onChange
   *        Callback fired when the value is changed.
   *        
   *        @param {object} event The event source of the callback.
   *        You can pull out the new value by accessing `event.target.value`.
   * @param onFocus
   *        Passed to underlying input element
   * @param placeholder
   *        The short hint displayed in the input before the user enters a value.
   * @param required
   *        If `true`, the label is displayed as required and the input will be required.
   * @param rows
   *        Number of rows to display when multiline option is set to true.
   * @param rowsMax
   *        Maximum number of rows to display when multiline option is set to true.
   * @param select
   *        Render a `Select` element while passing the `Input` element to `Select` as `input` parameter.
   *        If this option is set you must pass the options of the select as children.
   * @param `type`
   *        Type attribute of the `Input` element. It should be a valid HTML5 input type.
   * @param value
   *        The value of the `Input` element, required for a controlled component.
   */
  def apply(
    FormHelperTextProps: js.UndefOr[js.Any] = js.undefined,
    InputLabelProps: js.UndefOr[js.Any] = js.undefined,
    InputProps: js.UndefOr[js.Any] = js.undefined,
    SelectProps: js.UndefOr[js.Any] = js.undefined,
    autoComplete: js.UndefOr[String] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    defaultValue: js.UndefOr[js.Any] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    helperText: js.UndefOr[VdomNode] = js.undefined,
    id: js.UndefOr[String] = js.undefined,
    inputProps: js.UndefOr[js.Any] = js.undefined,
    inputRef: js.UndefOr[js.Any] = js.undefined,
    label: js.UndefOr[VdomNode] = js.undefined,
    margin: js.UndefOr[Margin] = js.undefined,
    multiline: js.UndefOr[Boolean] = js.undefined,
    name: js.UndefOr[String] = js.undefined,
    onBlur: js.UndefOr[ReactFocusEvent => Callback] = js.undefined,
    onChange: js.UndefOr[Callback] = js.undefined,
    onFocus: js.UndefOr[ReactFocusEvent => Callback] = js.undefined,
    placeholder: js.UndefOr[String] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    rows: js.UndefOr[js.Any] = js.undefined,
    rowsMax: js.UndefOr[js.Any] = js.undefined,
    select: js.UndefOr[Boolean] = js.undefined,
    `type`: js.UndefOr[String] = js.undefined,
    value: js.UndefOr[String] = js.undefined
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.FormHelperTextProps = FormHelperTextProps
    p.InputLabelProps = InputLabelProps
    p.InputProps = InputProps
    p.SelectProps = SelectProps
    p.autoComplete = autoComplete
    p.autoFocus = autoFocus
    p.className = className
    p.classes = classes
    p.component = component
    p.defaultValue = defaultValue
    p.disabled = disabled
    p.error = error
    p.fullWidth = fullWidth
    p.helperText = helperText.map(v => v.rawNode)
    p.id = id
    p.inputProps = inputProps
    p.inputRef = inputRef
    p.label = label.map(v => v.rawNode)
    p.margin = margin.map(v => v.value)
    p.multiline = multiline
    p.name = name
    p.onBlur = onBlur.map(v => (e: ReactFocusEvent) => v(e).runNow())
    p.onChange = onChange.map(v => v.toJsFn)
    p.onFocus = onFocus.map(v => (e: ReactFocusEvent) => v(e).runNow())
    p.placeholder = placeholder
    p.required = required
    p.rows = rows
    p.rowsMax = rowsMax
    p.select = select
    p.`type` = `type`
    p.value = value

    jsFnComponent(p)()
  }

}
    
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

//import japgolly.scalajs.react.vdom.html_<^._

object DatePicker {

  sealed trait InputVariant{ val value: String }

  object InputVariant {
    case object Standard extends InputVariant { val value: String = "standard" }
    case object Outlined extends InputVariant { val value: String = "outlined" }
    case object Filled extends InputVariant { val value: String = "filled" }
  }

  @js.native
  trait Props extends js.Object {
    var onChange: js.UndefOr[scalajs.js.Function1[ReactEvent, Unit]] = js.native
    var value: js.UndefOr[js.Any] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var format: js.UndefOr[String] = js.native
    var initialFocusedDate: js.UndefOr[js.Any] = js.native
    var inputVariant: js.UndefOr[String] = js.native

    var id: js.UndefOr[String] = js.native
    var key: js.UndefOr[String] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Object] = js.native

  }

  @JSImport("material-ui-pickers", JSImport.Default)
  @js.native
  object DatePickerJS extends js.Object

  val jsComponent = JsFnComponent[Props, Children.None](DatePickerJS)

  /**
   *
   * @param autoComplete
   *        This property helps users to fill forms faster, especially on mobile devices.
   *        The name can be confusing, as it's more like an autofill.
   *        You can learn more about it here:
   *        https://html.spec.whatwg.org/multipage/form-control-infrastructure.html#autofill
   * @param autoFocus
   *        If `true`, the input will be focused during the first mount.
   * @param className
   *        The CSS class name of the wrapper element.
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param defaultValue
   *        The default input value, useful when not controlling the component.
   * @param disabled
   *        If `true`, the input will be disabled.
   * @param endAdornment
   *        End `InputAdornment` for this component.
   * @param error
   *        If `true`, the input will indicate an error. This is normally obtained via context from
   *        FormControl.
   * @param fullWidth
   *        If `true`, the input will take up the full width of its container.
   * @param id
   *        The id of the `input` element.
   * @param inputComponent
   *        The component used for the native input.
   *        Either a string to use a DOM element or a component.
   * @param inputProps
   *        Attributes applied to the `input` element.
   * @param inputRef
   *        Use that property to pass a ref callback to the native input component.
   * @param key
   *        React key
   * @param labelWidth
   *        The width of the legend.
   * @param margin
   *        If `dense`, will adjust vertical spacing. This is normally obtained via context from
   *        FormControl.
   * @param multiline
   *        If `true`, a textarea element will be rendered.
   * @param name
   *        Name attribute of the `input` element.
   * @param notched
   *        If `true`, the outline is notched to accommodate the label.
   * @param onChange
   *        Callback fired when the value is changed.
   *
   *        parameter {object} event The event source of the callback.
   *        You can pull out the new value by accessing `event.target.value`.
   * @param placeholder
   *        The short hint displayed in the input before the user enters a value.
   * @param readOnly
   *        It prevents the user from changing the value of the field
   *        (not from interacting with the field).
   * @param required
   *        If `true`, the input will be required.
   * @param rows
   *        Number of rows to display when multiline option is set to true.
   * @param rowsMax
   *        Maximum number of rows to display when multiline option is set to true.
   * @param startAdornment
   *        Start `InputAdornment` for this component.
   * @param style
   *        React element CSS style
   * @param `type`
   *        Type of the input element. It should be a valid HTML5 input type.
   * @param value
   *        The input value, required for a controlled component.
   * @param additionalProps
   *        Optional parameter - if specified, this must be a js.Object containing additional props
   *        to pass to the underlying JS component. Each field of additionalProps will be added to the
   *        JS props object, if a field with the same name is not already present (from one of the other
   *        parameters of this function). This functions like `...additionalProps` at the beginning of the
   *        component in JS. Used for e.g. Downshift integration, where Downshift will provide properties
   *        in this format to be added to rendered components.
   *        Since this is untyped, use with care - e.g. make sure props are in the correct format for JS components
   */
  def apply(
             onChange: js.UndefOr[ReactEvent => Callback] = js.undefined,
             value: js.UndefOr[js.Any] = js.undefined,
             disabled: js.UndefOr[Boolean] = js.undefined,
             format: js.UndefOr[String] = js.undefined,
             initialFocusedDate: js.UndefOr[js.Any] = js.undefined,
             inputVariant: js.UndefOr[InputVariant] = js.undefined,
             id: js.UndefOr[String] = js.undefined,
             key: js.UndefOr[String] = js.undefined,
             className: js.UndefOr[String] = js.undefined,
             classes: js.UndefOr[js.Object] = js.undefined,
             additionalProps: js.UndefOr[js.Object] = js.undefined
           ) = {

    val p = (new js.Object).asInstanceOf[Props]

    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (disabled.isDefined) {p.disabled = disabled}
    if (id.isDefined) {p.id = id}
    if (key.isDefined) {p.key = key}
    if (onChange.isDefined) {p.onChange = onChange.map(v => (e: ReactEvent) => v(e).runNow())}
    if (value.isDefined) {p.value = value}
    if (format.isDefined) {p.format = format}
    if (initialFocusedDate.isDefined) {p.initialFocusedDate = initialFocusedDate}
    if (inputVariant.isDefined) {p.inputVariant = inputVariant.map(v => v.value)}

    additionalProps.foreach {
      a => {
        val dict = a.asInstanceOf[js.Dictionary[js.Any]]
        val pDict = p.asInstanceOf[js.Dictionary[js.Any]]
        for ((prop, value) <- dict) {
          if (!p.hasOwnProperty(prop)) pDict(prop) = value
        }
      }
    }

    jsComponent(p)
  }

}

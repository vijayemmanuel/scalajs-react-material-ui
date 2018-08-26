
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object ListItemText {
  
  @js.native
  trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var disableTypography: js.UndefOr[Boolean] = js.native
    var inset: js.UndefOr[Boolean] = js.native
    var primary: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var primaryTypographyProps: js.UndefOr[js.Any] = js.native
    var secondary: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var secondaryTypographyProps: js.UndefOr[js.Any] = js.native
  }

  @JSImport("@material-ui/core/ListItemText", JSImport.Default)
  @js.native
  object ListItemTextJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](ListItemTextJS)
  
  /**
   * 
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param disableTypography
   *        If `true`, the children won't be wrapped by a Typography component.
   *        This can be useful to render an alternative Typography variant by wrapping
   *        the `children` (or `primary`) text, and optional `secondary` text
   *        with the Typography component.
   * @param inset
   *        If `true`, the children will be indented.
   *        This should be used if there is no left avatar or left icon.
   * @param primary
   *        The main content element.
   * @param primaryTypographyProps
   *        These props will be forwarded to the primary typography component
   *        (as long as disableTypography is not `true`).
   * @param secondary
   *        The secondary content element.
   * @param secondaryTypographyProps
   *        These props will be forwarded to the secondary typography component
   *        (as long as disableTypography is not `true`).
   */
  def apply(
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    disableTypography: js.UndefOr[Boolean] = js.undefined,
    inset: js.UndefOr[Boolean] = js.undefined,
    primary: js.UndefOr[VdomNode] = js.undefined,
    primaryTypographyProps: js.UndefOr[js.Any] = js.undefined,
    secondary: js.UndefOr[VdomNode] = js.undefined,
    secondaryTypographyProps: js.UndefOr[js.Any] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (disableTypography.isDefined) {p.disableTypography = disableTypography}
    if (inset.isDefined) {p.inset = inset}
    if (primary.isDefined) {p.primary = primary.map(v => v.rawNode)}
    if (primaryTypographyProps.isDefined) {p.primaryTypographyProps = primaryTypographyProps}
    if (secondary.isDefined) {p.secondary = secondary.map(v => v.rawNode)}
    if (secondaryTypographyProps.isDefined) {p.secondaryTypographyProps = secondaryTypographyProps}

    jsFnComponent(p)(children: _*)
  }

}
        

package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object CardHeader {
  
  @js.native
  trait Props extends js.Object {
    var action: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var avatar: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var disableTypography: js.UndefOr[Boolean] = js.native
    var subheader: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var subheaderTypographyProps: js.UndefOr[js.Any] = js.native
    var title: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var titleTypographyProps: js.UndefOr[js.Any] = js.native
  }

  @JSImport("@material-ui/core/CardHeader", JSImport.Default)
  @js.native
  object CardHeaderJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](CardHeaderJS)
  
  /**
   * 
   * @param action
   *        The action to display in the card header.
   * @param avatar
   *        The Avatar for the Card Header.
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   * @param disableTypography
   *        If `true`, the children won't be wrapped by a Typography component.
   *        This can be useful to render an alternative Typography variant by wrapping
   *        the `title` text, and optional `subheader` text
   *        with the Typography component.
   * @param subheader
   *        The content of the component.
   * @param subheaderTypographyProps
   *        These props will be forwarded to the subheader
   *        (as long as disableTypography is not `true`).
   * @param title
   *        The content of the Card Title.
   * @param titleTypographyProps
   *        These props will be forwarded to the title
   *        (as long as disableTypography is not `true`).
   */
  def apply(
    action: js.UndefOr[VdomNode] = js.undefined,
    avatar: js.UndefOr[VdomNode] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    disableTypography: js.UndefOr[Boolean] = js.undefined,
    subheader: js.UndefOr[VdomNode] = js.undefined,
    subheaderTypographyProps: js.UndefOr[js.Any] = js.undefined,
    title: js.UndefOr[VdomNode] = js.undefined,
    titleTypographyProps: js.UndefOr[js.Any] = js.undefined
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.action = action.map(v => v.rawNode)
    p.avatar = avatar.map(v => v.rawNode)
    p.className = className
    p.classes = classes
    p.component = component
    p.disableTypography = disableTypography
    p.subheader = subheader.map(v => v.rawNode)
    p.subheaderTypographyProps = subheaderTypographyProps
    p.title = title.map(v => v.rawNode)
    p.titleTypographyProps = titleTypographyProps

    jsFnComponent(p)()
  }

}
        
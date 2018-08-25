
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Avatar {
  
  @js.native
  trait Props extends js.Object {
    var alt: js.UndefOr[String] = js.native
    var childrenClassName: js.UndefOr[String] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var imgProps: js.UndefOr[js.Any] = js.native
    var sizes: js.UndefOr[String] = js.native
    var src: js.UndefOr[String] = js.native
    var srcSet: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/Avatar", JSImport.Default)
  @js.native
  object AvatarJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](AvatarJS)
  
  /**
   * 
   * @param alt
   *        Used in combination with `src` or `srcSet` to
   *        provide an alt attribute for the rendered `img` element.
   * @param childrenClassName
   *        Property spread to root element
   *        The className of the child element.
   *        Used by Chip and ListItemIcon to style the Avatar icon.
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   * @param imgProps
   *        Attributes applied to the `img` element if the component
   *        is used to display an image.
   * @param sizes
   *        The `sizes` attribute for the `img` element.
   * @param src
   *        The `src` attribute for the `img` element.
   * @param srcSet
   *        The `srcSet` attribute for the `img` element.
   */
  def apply(
    alt: js.UndefOr[String] = js.undefined,
    childrenClassName: js.UndefOr[String] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    imgProps: js.UndefOr[js.Any] = js.undefined,
    sizes: js.UndefOr[String] = js.undefined,
    src: js.UndefOr[String] = js.undefined,
    srcSet: js.UndefOr[String] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.alt = alt
    p.childrenClassName = childrenClassName
    p.className = className
    p.classes = classes
    p.component = component
    p.imgProps = imgProps
    p.sizes = sizes
    p.src = src
    p.srcSet = srcSet

    jsFnComponent(p)(children: _*)
  }

}
        
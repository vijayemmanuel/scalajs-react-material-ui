
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Portal {
  
  @js.native
  trait Props extends js.Object {
    var key: js.UndefOr[String] = js.native
    var container: js.UndefOr[js.Any] = js.native
    var disablePortal: js.UndefOr[Boolean] = js.native
    var onRendered: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
  }

  @JSImport("@material-ui/core/Portal", JSImport.Default)
  @js.native
  object PortalJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](PortalJS)
  
  /**
   * Portals provide a first-class way to render children into a DOM node
   * that exists outside the DOM hierarchy of the parent component.
   * @param key
   *        React key
   * @param container
   *        A node, component instance, or function that returns either.
   *        The `container` will have the portal children appended to it.
   *        By default, it uses the body of the top-level document object,
   *        so it's simply `document.body` most of the time.
   * @param disablePortal
   *        Disable the portal behavior.
   *        The children stay within it's parent DOM hierarchy.
   * @param onRendered
   *        Callback fired once the children has been mounted into the `container`.
   */
  def apply(
    key: js.UndefOr[String] = js.undefined,
    container: js.UndefOr[js.Any] = js.undefined,
    disablePortal: js.UndefOr[Boolean] = js.undefined,
    onRendered: js.UndefOr[Callback] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (key.isDefined) {p.key = key}
    if (container.isDefined) {p.container = container}
    if (disablePortal.isDefined) {p.disablePortal = disablePortal}
    if (onRendered.isDefined) {p.onRendered = onRendered.map(v => v.toJsFn)}

    jsFnComponent(p)(children: _*)
  }

}
        
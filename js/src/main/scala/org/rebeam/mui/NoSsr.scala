
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object NoSsr {
  
  @js.native
  trait Props extends js.Object {
    var defer: js.UndefOr[Boolean] = js.native
    var fallback: js.UndefOr[japgolly.scalajs.react.raw.React.Node] = js.native
    var key: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/NoSsr", JSImport.Default)
  @js.native
  object NoSsrJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](NoSsrJS)
  
  /**
   * NoSsr purposely removes components from the subject of Server Side Rendering (SSR).
   * 
   * This component can be useful in a variety of situations:
   * - Escape hatch for broken dependencies not supporting SSR.
   * - Improve the time-to-first paint on the client by only rendering above the fold.
   * - Reduce the rendering time on the server.
   * - Under too heavy server load, you can turn on service degradation.
   * @param defer
   *        If `true`, the component will not only prevent server side rendering.
   *        It will also defer the rendering of the children into a different screen frame.
   * @param fallback
   *        The fallback content to display.
   * @param key
   *        React key
   */
  def apply(
    defer: js.UndefOr[Boolean] = js.undefined,
    fallback: js.UndefOr[VdomNode] = js.undefined,
    key: js.UndefOr[String] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (defer.isDefined) {p.defer = defer}
    if (fallback.isDefined) {p.fallback = fallback.map(v => v.rawNode)}
    if (key.isDefined) {p.key = key}

    jsFnComponent(p)(children: _*)
  }

}
        
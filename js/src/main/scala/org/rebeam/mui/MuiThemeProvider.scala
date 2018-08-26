
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object MuiThemeProvider {
  
  @js.native
  trait Props extends js.Object {
    var disableStylesGeneration: js.UndefOr[Boolean] = js.native
    var key: js.UndefOr[String] = js.native
    var sheetsManager: js.UndefOr[js.Any] = js.native
    var theme: js.Any = js.native
  }

  @JSImport("@material-ui/core/MuiThemeProvider", JSImport.Default)
  @js.native
  object MuiThemeProviderJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](MuiThemeProviderJS)
  
  /**
   * This component takes a `theme` property.
   * It makes the `theme` available down the React tree thanks to React context.
   * This component should preferably be used at **the root of your component tree**.
   * @param disableStylesGeneration
   *        You can disable the generation of the styles with this option.
   *        It can be useful when traversing the React tree outside of the HTML
   *        rendering step on the server.
   *        Let's say you are using react-apollo to extract all
   *        the queries made by the interface server side.
   *        You can significantly speed up the traversal with this property.
   * @param key
   *        React key
   * @param sheetsManager
   *        The sheetsManager is used to deduplicate style sheet injection in the page.
   *        It's deduplicating using the (theme, styles) couple.
   *        On the server, you should provide a new instance for each request.
   * @param theme
   *        A theme object.
   */
  def apply(
    disableStylesGeneration: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[String] = js.undefined,
    sheetsManager: js.UndefOr[js.Any] = js.undefined,
    theme: js.Any
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (disableStylesGeneration.isDefined) {p.disableStylesGeneration = disableStylesGeneration}
    if (key.isDefined) {p.key = key}
    if (sheetsManager.isDefined) {p.sheetsManager = sheetsManager}
    p.theme = theme

    jsFnComponent(p)(children: _*)
  }

}
        

package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object MuiThemeProvider {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/MuiThemeProvider", JSImport.Default)
  @js.native
  object MuiThemeProviderJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](MuiThemeProviderJS)
  
  /**
   * This component takes a `theme` property.
   * It makes the `theme` available down the React tree thanks to React context.
   * This component should preferably be used at **the root of your component tree**.
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
        
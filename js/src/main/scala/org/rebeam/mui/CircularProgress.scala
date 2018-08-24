
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object CircularProgress {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/CircularProgress", JSImport.Default)
  @js.native
  object CircularProgressJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](CircularProgressJS)
  
  /**
   * ## ARIA
   * 
   * If the progress bar is describing the loading progress of a particular region of a page,
   * you should use `aria-describedby` to point to the progress bar, and set the `aria-busy`
   * attribute to `true` on that region until it has finished loading.
   */
  def apply(
    
  ) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)()
  }

}
    
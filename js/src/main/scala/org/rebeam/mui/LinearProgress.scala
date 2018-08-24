
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object LinearProgress {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/LinearProgress", JSImport.Default)
  @js.native
  object LinearProgressJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.None](LinearProgressJS)
  
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
        
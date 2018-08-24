
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object RootRef {
  
  @js.native
  trait Props extends js.Object {
    
  }

  @JSImport("@material-ui/core/RootRef", JSImport.Default)
  @js.native
  object RootRefJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](RootRefJS)
  
  /**
   * Helper component to allow attaching a ref to a
   * wrapped element to access the underlying DOM element.
   * 
   * It's highly inspired by https://github.com/facebook/react/issues/11401#issuecomment-340543801.
   * For example:
   * ```jsx
   * import React from 'react';
   * import RootRef from '@material-ui/core/RootRef';
   * 
   * class MyComponent extends React.Component {
   *   constructor() {
   *     super();
   *     this.domRef = React.createRef();
   *   }
   * 
   *   componentDidMount() {
   *     console.log(this.domRef.current); // DOM node
   *   }
   * 
   *   render() {
   *     return (
   *       <RootRef rootRef={this.domRef}>
   *         <SomeChildComponent />
   *       </RootRef>
   *     );
   *   }
   * }
   * ```
   */
  def apply(
    
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    

    jsFnComponent(p)(children: _*)
  }

}
    

package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object RootRef {
  
  @js.native
  trait Props extends js.Object {
    var rootRef: js.Any = js.native
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
   * @param rootRef
   *        Provide a way to access the DOM node of the wrapped element.
   *        You can provide a callback ref or a `React.createRef()` ref.
   */
  def apply(
    rootRef: js.Any
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.rootRef = rootRef

    jsFnComponent(p)(children: _*)
  }

}
        

package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object ExpansionPanel {
  
  @js.native
  trait Props extends js.Object {
    var CollapseProps: js.UndefOr[js.Any] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var defaultExpanded: js.UndefOr[Boolean] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var elevation: js.UndefOr[Double] = js.native
    var expanded: js.UndefOr[Boolean] = js.native
    var onChange: js.UndefOr[scalajs.js.Function0[Unit]] = js.native
    var square: js.UndefOr[Boolean] = js.native
  }

  @JSImport("@material-ui/core/ExpansionPanel", JSImport.Default)
  @js.native
  object ExpansionPanelJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](ExpansionPanelJS)
  
  /**
   * 
   * @param CollapseProps
   *        Properties applied to the [`Collapse`](/api/collapse) element.
   * @param className
   *        @ignore
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   *        Passed to Paper
   * @param defaultExpanded
   *        If `true`, expands the panel by default.
   * @param disabled
   *        If `true`, the panel will be displayed in a disabled state.
   * @param elevation
   *        Shadow depth, corresponds to `dp` in the spec.
   *        It's accepting values between 0 and 24 inclusive.
   *        Passed to Paper
   * @param expanded
   *        If `true`, expands the panel, otherwise collapse it.
   *        Setting this prop enables control over the panel.
   * @param onChange
   *        Callback fired when the expand/collapse state is changed.
   *        
   *        @param {object} event The event source of the callback
   *        @param {boolean} expanded The `expanded` state of the panel
   * @param square
   *        If `true`, rounded corners are disabled.
   *        Passed to Paper
   */
  def apply(
    CollapseProps: js.UndefOr[js.Any] = js.undefined,
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    defaultExpanded: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elevation: js.UndefOr[Double] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    onChange: js.UndefOr[Callback] = js.undefined,
    square: js.UndefOr[Boolean] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.CollapseProps = CollapseProps
    p.className = className
    p.classes = classes
    p.component = component
    p.defaultExpanded = defaultExpanded
    p.disabled = disabled
    p.elevation = elevation
    p.expanded = expanded
    p.onChange = onChange.map(v => v.toJsFn)
    p.square = square

    jsFnComponent(p)(children: _*)
  }

}
    
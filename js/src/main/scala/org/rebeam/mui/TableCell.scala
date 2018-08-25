
package org.rebeam.mui

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object TableCell {
  
  sealed trait Padding{ val value: String }

  object Padding {
    case object Default extends Padding { val value: String = "default" }
    case object Checkbox extends Padding { val value: String = "checkbox" }
    case object Dense extends Padding { val value: String = "dense" }
    case object None extends Padding { val value: String = "none" }
  }
            
  sealed trait SortDirection{ val value: String }

  object SortDirection {
    case object Asc extends SortDirection { val value: String = "asc" }
    case object Desc extends SortDirection { val value: String = "desc" }
    case object False extends SortDirection { val value: String = "false" }
  }
            
  sealed trait Variant{ val value: String }

  object Variant {
    case object Head extends Variant { val value: String = "head" }
    case object Body extends Variant { val value: String = "body" }
    case object Footer extends Variant { val value: String = "footer" }
  }
          
  @js.native
  trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Any] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var numeric: js.UndefOr[Boolean] = js.native
    var padding: js.UndefOr[String] = js.native
    var scope: js.UndefOr[String] = js.native
    var sortDirection: js.UndefOr[String] = js.native
    var variant: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/TableCell", JSImport.Default)
  @js.native
  object TableCellJS extends js.Object

  val jsFnComponent = JsFnComponent[Props, Children.Varargs](TableCellJS)
  
  /**
   * 
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   * @param numeric
   *        If `true`, content will align to the right.
   * @param padding
   *        Sets the padding applied to the cell.
   *        By default, the Table parent component set the value.
   * @param scope
   *        Set scope attribute.
   * @param sortDirection
   *        Set aria-sort direction.
   * @param variant
   *        Specify the cell type.
   *        By default, the TableHead, TableBody or TableFooter parent component set the value.
   */
  def apply(
    className: js.UndefOr[String] = js.undefined,
    classes: js.UndefOr[js.Any] = js.undefined,
    component: js.UndefOr[js.Any] = js.undefined,
    numeric: js.UndefOr[Boolean] = js.undefined,
    padding: js.UndefOr[Padding] = js.undefined,
    scope: js.UndefOr[String] = js.undefined,
    sortDirection: js.UndefOr[SortDirection] = js.undefined,
    variant: js.UndefOr[Variant] = js.undefined
  )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    p.className = className
    p.classes = classes
    p.component = component
    p.numeric = numeric
    p.padding = padding.map(v => v.value)
    p.scope = scope
    p.sortDirection = sortDirection.map(v => v.value)
    p.variant = variant.map(v => v.value)

    jsFnComponent(p)(children: _*)
  }

}
        
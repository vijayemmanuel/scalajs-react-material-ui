package org.rebeam

object IconGen {

  def genIcon(iconName: String): String = {

    val propAssignments = ""
    // val docs = s"Icon component, $iconName"

    // |  /*
    // |  sealed trait Color{ val value: String }
    // |
    // |  object Color {
    // |    case object Primary extends Color { val value: String = "primary" }
    // |    case object Secondary extends Color { val value: String = "secondary" }
    // |    case object Action extends Color { val value: String = "action" }
    // |    case object Error extends Color { val value: String = "error" }
    // |    case object Disabled extends Color { val value: String = "disabled" }
    // |  }
    // |  */
    // |  /*
    // |  @js.native
    // |  trait Props extends js.Object {
    // |    
    // |  }
    // |  */

  s"""
    |package org.rebeam.icons
    |
    |import japgolly.scalajs.react._
    |import scalajs.js
    |import scalajs.js.annotation.JSImport
    |
    |object $iconName {
    |
    |  @JSImport("@material-ui/icons/$iconName", JSImport.Default)
    |  @js.native
    |  object ${iconName}JS extends js.Object
    |
    |  val jsFnComponent = JsFnComponent[Null, Children.None](${iconName}JS)
    |  
    |  def apply() = jsFnComponent()
    |
    |}
    """.stripMargin('|')

  }

def genIcons(iconNames: List[String]): String = {

  val native = iconNames.map{
    iconName => 
      s"""val ${iconName}: js.Dynamic = js.native"""
  }.mkString("\n    ")

  val icons = iconNames.map{
    iconName => 
      s"""val ${iconName} = JsFnComponent[Null, Children.None](IconsJS.${iconName})"""
  }.mkString("\n  ")

  s"""
    |package org.rebeam.mui
    |
    |import japgolly.scalajs.react._
    |import scalajs.js
    |import scalajs.js.annotation.JSImport
    |
    |object Icons {
    |
    |  @js.native
    |  @JSImport("@material-ui/icons", JSImport.Namespace)
    |  private object IconsJS extends js.Object {
    |    $native  
    |  }
    |  
    |  $icons
    |
    |}
    """.stripMargin('|')

  }


}
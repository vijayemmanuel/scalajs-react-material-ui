package org.rebeam

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import org.scalajs.dom
import scala.scalajs.js.annotation._

// import cats.effect.IO

// import com.definitelyscala.node.net._
// import com.definitelyscala.node.fs._
// import com.definitelyscala.node.Buffer

@JSExportTopLevel("Main")
object Main {

  val DemoView = ScalaComponent.builder[Unit]("TopView")
    .renderStatic(
      <.div(
        mui.Button(
          color = mui.Button.Color.Primary, 
          variant = mui.Button.Variant.Contained,
          onClick = mui.EventCallback {
            println("Click!!!")
          },
          onMouseLeave = mui.EventCallback {
            println("Mouse left!!!")
          }

        )("Hello"),
        mui.TextField(
          value = "Text contents",
          onBlur = mui.EventCallback {
            println("TextField Blur")
          },
          onFocus = mui.EventCallback {
            println("TextField focus")
          }
        )()
      )
    )
    .build

  @JSExport
  def main(): Unit = {

    DemoView().renderIntoDOM(dom.document.getElementById("App"))

    ()
  }
}

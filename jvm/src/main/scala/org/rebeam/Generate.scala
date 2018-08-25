package org.rebeam

import DocGenGen._
import ComponentModel._
import ComponentModelDecoders._

import io.circe.parser.decode

import java.nio.charset.StandardCharsets
import java.nio.file._

object Generate {

  def writeToFile(filename: String, contents: String): Unit = {
    Files.write(Paths.get(filename), contents.getBytes(StandardCharsets.UTF_8))
    ()
  }

  def main(args: Array[String]): Unit = {

    implicit val context = DocGenContext.MaterialUI

    def component(all: Map[String, Component], c: Component): Unit = {
      val code = genComponent(all, c)
      val name = c.displayName
      code.foreach(s => writeToFile(s"./js/src/main/scala/org/rebeam/mui/$name.scala", s))
    }

    val s = scala.io.Source.fromInputStream(getClass.getResourceAsStream("/muiapi.json")).mkString

    val d = decode[Map[String, Component]](s).toOption.get

    // d.find(_._2.displayName == "Typography").foreach{
    //   c => component(d, c._2)
    // }

    d.map(_._2).foreach{
      c => component(d, c)
    }

    val icons: List[String] = scala.io.Source.fromInputStream(getClass.getResourceAsStream("/muiicons.csv")).getLines.toList
    val normalIcons = icons.filter(i => !i.endsWith("Rounded") && !i.endsWith("Outlined") && !i.endsWith("Sharp") && !i.endsWith("TwoTone"))

    // val iconsCode = IconGen.genIcons(normalIcons)
    // writeToFile(s"./js/src/main/scala/org/rebeam/mui/Icons.scala", iconsCode) 

    normalIcons.map(icon => (icon, IconGen.genIcon(icon))).foreach {
      case (icon, code) => writeToFile(s"./js/src/main/scala/org/rebeam/icons/$icon.scala", code) 
    }

  }
}
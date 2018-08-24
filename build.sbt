import sbtcrossproject.CrossPlugin.autoImport.crossProject

name := "scalajs-react-material-ui root"

version in ThisBuild := "0.0.1"

organization in ThisBuild := "org.rebeam"

scalaVersion in ThisBuild := "2.12.6"

// crossScalaVersions in ThisBuild := Seq("2.11.12", "2.12.6")

scalacOptions in ThisBuild ++= Seq(
  "-feature",
  "-deprecation",
  "-encoding", "UTF-8",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Xcheckinit",
  "-Xlint:-unused",
  "-Ywarn-unused:imports",
  "-Ypartial-unification",
  "-language:existentials",
  "-language:higherKinds",
  "-Yno-adapted-args",
  // "-Ywarn-dead-code",  //TODO restore for JVM and shared only
  // "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture"
  //"-Yno-predef" ?
)

lazy val catsVersion                = "1.2.0"
lazy val catsEffectVersion          = "0.10.1"
lazy val scalajsReactVersion        = "1.2.3"
lazy val circeVersion               = "0.9.3"

lazy val root = project.in(file(".")).
  aggregate(scalajsReactMaterialUIJS, scalajsReactMaterialUIJVM).
  settings(
    publish := {},
    publishLocal := {}
  )

lazy val scalajsReactMaterialUI = crossProject(JSPlatform, JVMPlatform).in(file(".")).
  //Settings for all projects
  settings(
    name := "scalajs-react-material-ui",
    libraryDependencies ++= Seq(

      "io.circe"                    %%% "circe-core"        % circeVersion,
      "io.circe"                    %%% "circe-generic"     % circeVersion,
      "io.circe"                    %%% "circe-parser"      % circeVersion,

      "org.typelevel"               %%% "cats-core"         % catsVersion,
      "org.typelevel"               %%% "cats-effect"       % catsEffectVersion,
      
      // "com.chuusai"                 %%% "shapeless"         % shapelessVersion,

      // "com.github.julien-truffaut"  %%% "monocle-core"      % monocleVersion,
      // "com.github.julien-truffaut"  %%% "monocle-generic"   % monocleVersion,
      // "com.github.julien-truffaut"  %%% "monocle-macro"     % monocleVersion,
      // "com.github.julien-truffaut"  %%% "monocle-state"     % monocleVersion,
      // "com.github.julien-truffaut"  %%% "monocle-refined"   % monocleVersion,
      // "com.github.julien-truffaut"  %%% "monocle-law"       % monocleVersion      % "test",

      // "org.scalactic"               %%% "scalactic"         % scalacticVersion    % "test",
      // "org.scalatest"               %%% "scalatest"         % scalatestVersion    % "test",
      // "org.scalacheck"              %%% "scalacheck"        % scalacheckVersion   % "test"

    ),

    //For @Lenses and Circe
    addCompilerPlugin("org.scalamacros" %% "paradise" % "2.1.0" cross CrossVersion.patch)
  ).jvmSettings(
      mainClass := Some("org.rebeam.Generate"),
  ).jsSettings(
    //Scalajs dependencies that are used on the client only
    resolvers += Resolver.jcenterRepo,

    libraryDependencies ++= Seq(
      "com.github.japgolly.scalajs-react" %%% "core" % scalajsReactVersion,
      "com.github.japgolly.scalajs-react" %%% "extra" % scalajsReactVersion
    ),
    
    //Produce a module, so we can use @JSImport.
    // scalaJSModuleKind := ModuleKind.CommonJSModule//,
    scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) }
  )

lazy val scalajsReactMaterialUIJVM = scalajsReactMaterialUI.jvm
lazy val scalajsReactMaterialUIJS = scalajsReactMaterialUI.js


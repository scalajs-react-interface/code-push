package sri.code.push

import sri.core.{ComponentConstructor, ReactClass}

import scala.scalajs.js
import scala.scalajs.js.{Promise, undefined, UndefOr => U}
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@JSImport("react-native-code-push", JSImport.Namespace)
@js.native
object CodePush extends js.Object {

  def apply(rootComponent: ComponentConstructor): ReactClass = js.native
  def apply(options: CodePushOptions)(rootComponent:ComponentConstructor): ReactClass = js.native

  val CheckFrequency:js.Dynamic = js.native
  val InstallMode:js.Dynamic = js.native

  def allowRestart(): Unit = js.native

  def disallowRestart(): Unit = js.native

  def getCurrentPackage(): Promise[LocalPackage] = js.native

  def notifyAppReady(): Promise[Unit] = js.native

  def getUpdateMetadata(updateState: UpdateState = ???): Promise[LocalPackage] = js.native

  def checkForUpdate(deploymentKey: String = null): Promise[RemotePackage] = js.native

  def restartApp(onlyIfUpdateIsPending: Boolean = false): Unit= js.native

  def sync(options : js.Object,syncStatusChangeCallback:js.Function,downloadProgressCallback:js.Function): Promise[Int] = js.native
}

@js.native
trait RemotePackage extends js.Object {

}

@js.native
trait UpdateState extends js.Object

object UpdateState {

}

@js.native
trait LocalPackage extends js.Object

@ScalaJSDefined
trait CodePushOptions extends js.Object {

  val checkFrequency : U[CheckFrequency] = undefined

  val deploymentKey:U[String] = undefined

  val minimumBackgroundDuration:U[Int] = undefined

  val installMode: U[InstallMode] = undefined

  val mandatoryInstallMode: U[InstallMode] = undefined

  val updateDialog: U[UpdateDialog] = undefined


}

@js.native
trait CheckFrequencyOption extends js.Object

@js.native
trait CheckFrequency extends js.Object

object CheckFrequency {

  @inline def ON_APP_START : CheckFrequency = CodePush.CheckFrequency.ON_APP_START.asInstanceOf[CheckFrequency]
  @inline def ON_APP_RESUME : CheckFrequency = CodePush.CheckFrequency.ON_APP_RESUME.asInstanceOf[CheckFrequency]
  @inline def MANUAL : CheckFrequency = CodePush.CheckFrequency.MANUAL.asInstanceOf[CheckFrequency]
}

@js.native
trait InstallMode extends js.Object

object InstallMode {
  @inline def IMMEDIATE : InstallMode = CodePush.InstallMode.IMMEDIATE.asInstanceOf[InstallMode]
  @inline def ON_NEXT_RESTART : InstallMode = CodePush.InstallMode.ON_NEXT_RESTART.asInstanceOf[InstallMode]
  @inline def ON_NEXT_RESUME : InstallMode = CodePush.InstallMode.ON_NEXT_RESUME.asInstanceOf[InstallMode]
}

@ScalaJSDefined
trait UpdateDialog extends js.Object {

  val appendReleaseDescription:U[Boolean] = undefined
  val descriptionPrefix:U[String] = undefined
  val mandatoryContinueButtonLabel:U[String] = undefined
  val mandatoryUpdateMessage:U[String] = undefined
  val optionalIgnoreButtonLabel:U[String] = undefined
  val optionalInstallButtonLabel:U[String] = undefined
  val optionalUpdateMessage:U[String] = undefined
  val title:U[String] = undefined
}

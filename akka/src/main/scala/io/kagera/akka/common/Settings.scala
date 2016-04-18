package io.kagera.akka.common

import com.typesafe.config.{ ConfigFactory, Config }

class Settings(config: Config) {

  object http {
    val interface = config.getString("http.interface")
    val port = config.getInt("http.port")
  }
}

trait SettingsProvider {
  def settings: Settings
}

trait DefaultSettingsProvider extends SettingsProvider {

  override val settings = new Settings(ConfigFactory.load())
}

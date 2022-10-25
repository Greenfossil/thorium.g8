package controllers

import com.greenfossil.thorium.{Action, Controller}
import com.linecorp.armeria.server.annotation.{Get, Param}

object SimpleController extends Controller:
  @Get("/sayHello/:name")
  def sayHello(@Param name: String) = Action {request =>
  s"Hello \$name"
  }
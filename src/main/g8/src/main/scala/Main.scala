import com.greenfossil.thorium.{Server, Action}
import controllers.{SimpleController}

@main def start: Unit =
  Server()
    .addService("/", Action(request => "Welcome to Thorium!"))
    .addServices(SimpleController)
    .addDocService("/docs")
    .start()

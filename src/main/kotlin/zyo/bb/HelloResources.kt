package zyo.bb
import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/api/hello")
class HelloResources {
    @GET
    fun hello() = "Hello"
}

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;

@Path("/")
public class HelloResource {

  private final HelloService helloService;

  @Inject
  public HelloResource(HelloService helloService) {
    this.helloService = helloService;
  }

  @GET
  @Path("hello/{name}")
  @Produces(MediaType.APPLICATION_JSON)
  public void sayHello(@Suspended AsyncResponse response,
                       @PathParam("name") String name) {
    helloService.sayHello(name)
      .thenAccept(response::resume);
  }

  @GET
  @Path("error")
  @Produces(MediaType.APPLICATION_JSON)
  public void error(@Suspended AsyncResponse response) {
    response.resume(new Exception("error message"));
  }

}

package springWebApp;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

@Path("example")
@Service("anotherService")
public class OtherServiceImpl {
 
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got!";
    }
}
package springWebApp;
 
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

@Path("example")
@Service("exampleService")
public class ExampleServiceImpl {

	public ExampleServiceImpl() {
		System.out.println("Initialized example service");
	}
	
	@POST
    @Produces(MediaType.APPLICATION_JSON)
	@Path("/{appFlowId}")
    public ClaimType getIt(@PathParam("appFlowId") String appFlowId, @QueryParam("target") String target, 
    		Map<String, Object> claimantInfo, @Context HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.getAttribute("abc");
		session.getAttributeNames();
		session.setAttribute("abc", claimantInfo);
		ClaimType ctype = new ClaimType();
		ctype.setClaimTypeId(12);
		ctype.setCopyId("abc");
		ctype.setSortOrder("1");
		return ctype;
    }
	
}
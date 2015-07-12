package com.programcreek.helloworld.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.HtmlUtils;

@Controller
public class HelloWorldController {
	String message = "Welcome to Spring MVC!";

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("index", "command", new Greeting());
	}

	@RequestMapping(value="/hello", method=RequestMethod.POST)
	public ModelAndView showMessage(@RequestBody String name) {
		try{
			System.out.println("in controller");
			name = URLDecoder.decode(name,"UTF-8").split("=")[1];
			URL url = new URL("http://localhost:8080/springWebApp/services/example/ccupload");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			
			//String input = "{\"qty\":100,\"name\":\"iPad 4\"}";
			 
			OutputStream os = conn.getOutputStream();
			os.write(name.getBytes());
			os.flush();
	 
			if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
				throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
			}
	 
			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));
	 
			String output;
			StringBuffer result=new StringBuffer("");
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
				result.append(output);
			}
	 
			conn.disconnect();

			ModelAndView mv = new ModelAndView("helloworld");
			mv.addObject("message", message);
			mv.addObject("name", result);
			return mv;
		}catch(Exception e){

		}
		return null;
	}
}
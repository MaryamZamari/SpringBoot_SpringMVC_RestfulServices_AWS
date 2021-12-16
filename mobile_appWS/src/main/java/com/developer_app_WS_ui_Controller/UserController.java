package com.developer_app_WS_ui_Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * for this class, in order to receive http requests, 
 * we need to add some ANNOTATIONS
 */



@RestController        //it will register this class as a RestController, so that it can receive http requests and match URL path
/*
 * //when http request is sent, it is sent to a certain URL, 
 * and this url , it will contain paths. so that URL, will be
 * responsible for Operations that have to do with users i.e updating
 *  user details, deleting user details, and we want our URL, to Reflect
 *   this fact . so we put User in the paranthesis 
 */
@RequestMapping("users") //http://localhost:8080/users(then method)	-> when i send http request to one of the methods in this controller class, i write this way 
public class UserController {

	/*
	 * at the moment, i leave it this way, but then i will work on this method more 
	 * it has to accept user id to use in query, and return a json with the details 
	 * it will respond to get http request so it needs its special annotation for binding with the request
	 */
	@GetMapping
	public String getUser() {
		return "get user was called" ; 
	}
	
	@PostMapping
	public String createUser() {
		return "creater user was called" ; 
	}
	
	@PutMapping
	public String updateUser() {
		return "update user was called" ; 
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "delete user was called"; 
	}
	
	
	
	
	
	
	
}

package escuelaing.TaskPlaner.TaskPlannerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import escuelaing.TaskPlaner.Services.UserService;
import escuelaing.TaskPlaner.Entities.User;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class Usercontroller {

@Autowired
private UserService userService;

@PostMapping("/user")
public ResponseEntity<Object> addUser(@RequestBody User user){
    userService.create(user);
    return new ResponseEntity<>(HttpStatus.CREATED);
}

@GetMapping("/user/{id}")
public ResponseEntity<Object> getUserById(@PathVariable String userId){
    try {
        return new ResponseEntity<>(userService.getById(userId), HttpStatus.ACCEPTED);
    } catch (Exception e) {
        Logger.getLogger(Usercontroller.class.getName()).log(Level.SEVERE, e.getMessage(),e);
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
}

@GetMapping("/users")
public ResponseEntity<Object> getAllUsers(){
    try {
        return new ResponseEntity<>(userService.getAll(), HttpStatus.ACCEPTED);
    } catch (Exception e) {
        Logger.getLogger(Usercontroller.class.getName()).log(Level.SEVERE, e.getMessage(),e);
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
}

}

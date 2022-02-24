package backend.futsal.Casa.Benfica.Portalegre.controllers;


import backend.futsal.Casa.Benfica.Portalegre.entities.AdminUser;
import backend.futsal.Casa.Benfica.Portalegre.services.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminUserController {

    @Autowired
    AdminUserService adminUserService;

    ResponseEntity<Object> response;


    @PostMapping("/adminUser")
    public ResponseEntity<Object> addAdminUser(@RequestBody AdminUser adminUser){
        AdminUser adminUserCreated = adminUserService.addAdminUser(adminUser);
        return new ResponseEntity<>(adminUserCreated, HttpStatus.CREATED);
    }

    @GetMapping("/adminUser{id}")
    public ResponseEntity<Object> getAdminUserByID(@PathVariable long id){
        AdminUser adminUser = adminUserService.getAdminUserById(id);
        if(adminUser != null){
            response = new ResponseEntity<>(adminUser, HttpStatus.OK);
        }
        else{
            response = new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return response;
    }

    @PutMapping("/adminUser")
    public ResponseEntity<Object> updateAdminUser(@RequestBody AdminUser adminUser){
        if(adminUserService.updateAdminUser(adminUser)){
            response = new ResponseEntity<>(HttpStatus.OK);
        }
        else{
            response = new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return response;
    }

    @DeleteMapping("/adminUser/{id}")
    public ResponseEntity<Object> deleteAdminUserById(@PathVariable long id){
        if(adminUserService.deleteAdminUserById(id)){
            response = new ResponseEntity<>(HttpStatus.OK);
        }
        else{
            response = new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return response;
    }
}

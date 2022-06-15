
package com.familinsurance.familinsurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("*")
@RestController
public class ServiceController {

    @Autowired
    private ServiceRepository serviceRepository;

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/")
    public @ResponseBody Iterable<Service> getServices() {
        return serviceRepository.findAll();
    }

    @PostMapping(value = "/")
    public @ResponseBody String addNewUser(@RequestBody ServiceDto serviceDto) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        Service service = new Service();

        service.Nombre = serviceDto.Nombre;
        service.Descripcion = serviceDto.Descripcion;
        service.Imagen = serviceDto.Imagen;
        service.Categoria = serviceDto.Categoria;
        serviceRepository.save(service);
        return "Saved";
    }
    
    
    @PostMapping(value = "/newsletter",
    produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ResponseEntity<responseDTO> addNewsLetter(@RequestBody UserDto userDto) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        System.out.println(userDto.email);
        System.out.println(userDto.nombre);
        
        User user = new User();

        user.id_usuario = userDto.id_usuario;
        user.nombre = userDto.nombre;
        user.email = userDto.email;
        userRepository.save(user);
        
        responseDTO responseDto_ = new responseDTO();
        responseDto_.state=true;
        responseDto_.message="Datos recibidos correctamente";
        return new ResponseEntity<responseDTO>(responseDto_,HttpStatus.ACCEPTED);
    }
}

package com.familinsurance.familinsurance;

import com.sendgrid.*;

import com.sendgrid.helpers.mail.Mail;

import com.sendgrid.helpers.mail.objects.Content;

import com.sendgrid.helpers.mail.objects.Email;


import ch.qos.logback.classic.Level;


import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;
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


    @GetMapping("/send")
    public @ResponseBody Iterable<Service> getServices() {
        return serviceRepository.findAll();
    }
    @GetMapping("/")
    public @ResponseBody String send() {
        
        sendEmail("andresmoradeveloper@gmail.com", "servicios de nuestra empresa", toEmail:"angieforero723@gmail.com", sendGridKey:"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");
          return"enviado";
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
    
    @PostMapping(value = "/newsletter")
    public @ResponseBody responseDTO addNewsLetter(@RequestBody UserDto userDto) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        if(userDto.email.contains("@")){
            System.out.println(userDto.email);
            System.out.println(userDto.nombre);
         //comentario   
            User user = new User();
    
            user.id_usuario = userDto.id_usuario;
            user.nombre = userDto.nombre;
            user.email = userDto.email;
            userRepository.save(user);
            
            responseDTO responseDto_ = new responseDTO();
            responseDto_.state=true;
            responseDto_.message="Datos recibidos correctamente";
            return responseDto_;

        }else{
            responseDTO responseDto_ = new responseDTO();
            responseDto_.state=true;
            responseDto_.message="No se recibio el email valido";
            return responseDto_;

        }
      
    }
    void sendEmail(

    String emailFrom,

    String subject,

    String toEmail,

    String sendGridKey

  ) {

    Email from = new Email(emailFrom);



    Email to = new Email(toEmail);

    Content content = new Content("text/html", getHtmlTemplate());

    Mail mail = new Mail(from, subject, to, content);



    SendGrid sg = new SendGrid(sendGridKey);

    Request request = new Request();

    try {

      request.setMethod(Method.POST);

      request.setEndpoint("mail/send");

      request.setBody(mail.build());

      Response response = sg.api(request);

      System.out.println(response.getStatusCode());

      System.out.println(response.getBody());

      System.out.println(response.getHeaders());

    } catch (IOException ex) {

      System.out.println(ex.toString());
      
    }

  }

  String getHtmlTemplate() {
    String response = "";
    try {
      InputStream is = new ClassPathResource("/plantilla.html")
        .getInputStream();
      String contents = new String(
        FileCopyUtils.copyToByteArray(is),
        StandardCharsets.UTF_8
      );
      response = contents;
    } catch (IOException ex) {
      Logger
        .getLogger(ServiceController.class.getName())
        .log(Level.SEVERE, null, ex);
        
    }
    return response;
  }

}


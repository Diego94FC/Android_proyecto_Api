package diego.api.producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@RestController
public class RealController {

    private final JavaMailSender javaMailSender;
    @Autowired
    RealController(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @RequestMapping("/mail")
    @ResponseStatus(HttpStatus.CREATED)
    SimpleMailMessage send() {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo("dieferna@alumnos.ubiobio.cl");
        mailMessage.setReplyTo("someone@localhost");
        mailMessage.setFrom("dieferna@alumnos.ubiobio.cl");
        mailMessage.setSubject("Compra realizada con éxito!");
        mailMessage.setText("Se han comprado los productos que solicitaste.  \n Se realizará la entrega a tu domicilio en menos de una hora");
        javaMailSender.send(mailMessage);
        return mailMessage;
    }

    @RequestMapping(value = "/item", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    public Item getTCloseData(@RequestParam(value="id", defaultValue="Error: you need to specify an item") String id) throws IOException {
        List<Item> lista = new ArrayList<>();
        Item item1 = new Item("606f8120891e42af86db0ae19e1f138c","Milo","Milo te hace grande", "image.com", "3500");
        Item item2 = new Item("e40700cb7839430991347763877e77c4","Leche Entera Calo","1 litro", "image.com", "1990");
        Item item3 = new Item("c249ba75e2884286a2345ad67b207b67","Cafe Gold Premium","170g ", "image.com", "3990");
        Item response = new Item("3","temp","temp", "temp", "temp");


        if(item1.getId().equals(id))
            response = item1;

        if(item2.getId().equals(id))
            response = item2;

        if(item3.getId().equals(id))
            response = item3;


        return response;
    }




}






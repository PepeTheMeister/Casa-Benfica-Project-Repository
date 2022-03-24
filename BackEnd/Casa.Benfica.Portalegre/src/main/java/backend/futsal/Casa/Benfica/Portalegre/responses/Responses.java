package backend.futsal.Casa.Benfica.Portalegre.responses;


import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import java.net.http.HttpResponse;

public class Responses {

    HttpHeaders headers;

    ResponseEntity<Object> response;



    public Responses(){
        this.headers = new HttpHeaders();

    }
}

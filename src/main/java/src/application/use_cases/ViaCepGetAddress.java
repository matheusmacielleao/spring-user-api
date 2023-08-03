package src.application.use_cases;

import org.springframework.web.client.RestTemplate;
import src.domain.entities.Address;
import src.domain.use_cases.GetAddress;

import java.util.List;

public class ViaCepGetAddress implements GetAddress {

    public class ViaCepResponse {
       String cep;
       String logradouro;
      String complemento;
      String bairro;
     String localidade;
       String uf;
       String ibge;
      String gia;
       String ddd;
      String siafi;
    }
    public  ViaCepGetAddress(){
    }
    public Address byCep(String cep, Integer streetNumber) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://viacep.com.br/ws/"+ cep +"/json/";
        ViaCepResponse response = restTemplate.getForObject(url,ViaCepResponse.class);

        Address address = new Address(response.cep,response.uf,response.localidade,response.bairro,response.logradouro,streetNumber);


        return address;
    }
}

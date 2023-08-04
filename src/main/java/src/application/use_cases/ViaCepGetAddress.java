package src.application.use_cases;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import src.domain.entities.Address;
import src.domain.use_cases.GetAddress;

import java.util.List;

public class ViaCepGetAddress implements GetAddress {

    public static class ViaCepResponse {
        public  ViaCepResponse(){}
        public ViaCepResponse(String cep, String logradouro, String complemento, String bairro, String localidade, String uf, String ibge, String gia, String ddd, String siafi) {
            this.cep = cep;
            this.logradouro = logradouro;
            this.complemento = complemento;
            this.bairro = bairro;
            this.localidade = localidade;
            this.uf = uf;
            this.ibge = ibge;
            this.gia = gia;
            this.ddd = ddd;
            this.siafi = siafi;
        }

        public String getCep() {
            return cep;
        }

        public void setCep(String cep) {
            this.cep = cep;
        }

        public String getLogradouro() {
            return logradouro;
        }

        public void setLogradouro(String logradouro) {
            this.logradouro = logradouro;
        }

        public String getComplemento() {
            return complemento;
        }

        public void setComplemento(String complemento) {
            this.complemento = complemento;
        }

        public String getBairro() {
            return bairro;
        }

        public void setBairro(String bairro) {
            this.bairro = bairro;
        }

        public String getLocalidade() {
            return localidade;
        }

        public void setLocalidade(String localidade) {
            this.localidade = localidade;
        }

        public String getUf() {
            return uf;
        }

        public void setUf(String uf) {
            this.uf = uf;
        }

        public String getIbge() {
            return ibge;
        }

        public void setIbge(String ibge) {
            this.ibge = ibge;
        }

        public String getGia() {
            return gia;
        }

        public void setGia(String gia) {
            this.gia = gia;
        }

        public String getDdd() {
            return ddd;
        }

        public void setDdd(String ddd) {
            this.ddd = ddd;
        }

        public String getSiafi() {
            return siafi;
        }

        public void setSiafi(String siafi) {
            this.siafi = siafi;
        }

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
        String url = "https://viacep.com.br/ws/"+ cep +"/json";
        System.out.println(url);
        ResponseEntity<ViaCepResponse> request = restTemplate.getForEntity(url,ViaCepResponse.class);

        ViaCepResponse response = request.getBody();
        System.out.println(response.toString());
        return new Address(response.cep,response.uf,response.localidade,response.bairro,response.logradouro,streetNumber);
    }
}

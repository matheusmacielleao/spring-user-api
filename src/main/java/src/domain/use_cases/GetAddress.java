package src.domain.use_cases;

import src.domain.entities.Address;

public interface GetAddress {
    public Address byCep(String cep,Integer streetNumber);
}

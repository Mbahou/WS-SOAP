package WS;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
@WebService(serviceName = "BanqueWS")
public class BanqueService  {
    @WebMethod(operationName = "ConversionEuToDh")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt * 11;
    }
    @WebMethod
    public Compte getCompte(int code){
        return new Compte(code,Math.random()*6000,new Date());
    }
    @WebMethod
    public List<Compte> listesCompte(){
        return List.of(
                new Compte(1,Math.random()*6000,new Date()),
                new Compte(2,Math.random()*4000,new Date()),
                new Compte(3,Math.random()*3000,new Date())
        );

    }
}

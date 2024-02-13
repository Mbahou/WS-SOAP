package net.mehdi;

import proxy.BanqueService;
import proxy.BanqueWS;

public class ClientWS {
    public static void main(String[] args) {

        BanqueService proxy =new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuToDh(800));
    }
}

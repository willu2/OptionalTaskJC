package menu;

import entity.PhoneEntity;
import java.util.ArrayList;
import java.util.Collections;

public class DisplayDataFormat {

    public static void clientVisor(ArrayList<PhoneEntity> clients){
        for(PhoneEntity client : clients){
            String str = client.getAbroadCallsTime();
            str = str.replaceAll(":","");
            int time = Integer.parseInt(str);
            if (time < 140) {
                showAllData(client);
            }
        }
    }

    public static void sortByName(ArrayList<PhoneEntity> clients){
        Collections.sort(clients);
        for(PhoneEntity client : clients){
            showAllData(client);
        }
    }

    public static void abroadCall(ArrayList<PhoneEntity> clients) {
        for (PhoneEntity client : clients) {
            if (client.isAbroad()) {
               showAllData(client);
            }
        }
    }

    public static void showAllData(PhoneEntity client) {
            System.out.println(" ");
            System.out.println("Id " + client.getId());
            System.out.println("Name " + client.getName());
            System.out.println("Sourname " + client.getSourname());
            System.out.println("Patronymic " + client.getPatronymic());
            System.out.println("Debet " + client.getDebet() + " USD");
            System.out.println("Credit " + client.getCredit() + " USD");
            System.out.println("CardNum " + client.getCreditCardNum());
            System.out.println("ContryTime " + client.getContryCallsTime() + " min");
            System.out.println("DistanceTime " + client.getAbroadCallsTime() + " min");
            System.out.println("--------------");
            System.out.println("**************");
    }
}

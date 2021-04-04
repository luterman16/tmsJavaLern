package hw_020421;

import hw_020421.hands.AppleHand;
import hw_020421.hands.OracleHand;
import hw_020421.hands.SonyHand;
import hw_020421.heads.AppleHead;
import hw_020421.heads.OracleHead;
import hw_020421.heads.SonyHead;
import hw_020421.legs.ApplyLeg;
import hw_020421.legs.OracleLeg;
import hw_020421.legs.SonyLeg;

public class Run {
    public static void main(String[] args) {

        Robot alisa = new Robot(
                new AppleHead(11000),
                new OracleHand(2700),
                new SonyLeg(50));

        Robot siri = new Robot(
                new SonyHead(7500),
                new AppleHand(4500),
                new OracleLeg(50)
        );

        Robot asimo = new Robot(
                new OracleHead(6556),
                new SonyHand(3500),
                new ApplyLeg(8000)
        );

        alisa.action();
        siri.action();
        asimo.action();

        int alisaPrice = alisa.getPrice();
        int siriPrice = siri.getPrice();
        int asimoPrice = asimo.getPrice();

        int[] robotPrices = {alisaPrice, siriPrice, asimoPrice};
        int richRobot = 0;

        for (int i = 0; i < robotPrices.length; i++) {
            if (robotPrices[i] > richRobot) {
                richRobot = robotPrices[i];
            };
        };

        if (richRobot == alisaPrice) {
            System.out.println("Alisa самый дорогой робот");
        } else if (richRobot == siriPrice) {
            System.out.println("Siri самый дорогой робот");
        } else if (richRobot == asimoPrice) {
            System.out.println("Asimo самый дорогой робот");
        } else {
            System.out.println("Не установлена цена для робота");
        }


    }
}

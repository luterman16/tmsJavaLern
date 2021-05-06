package hw_190321.Task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DebetCard {
    String numberCard;
    String typeCard;
    String owner;
    Date period;
    int cvv;

    public DebetCard(String numberCard, String typeCard, String owner, String period, int cvv) throws ParseException {
        Date datePeriod = new SimpleDateFormat("dd/MM/yyyy").parse(period);
        this.numberCard = numberCard;
        this.typeCard = typeCard;
        this.owner = owner;
        this.period = datePeriod;
        this.cvv = cvv;
    }

    public void validateCard(String numberCard, String typeCard, String owner, String period, int actualCVV, int expectedCVV) throws ParseException {

        class ValidateCard {

            //валидация количество цифр в номере карты
            public Boolean validateNumberCard(String numberCard){
                if(numberCard.length() == 16){
                    return true;
                } else {
                    return false;
                }
            };
            //валидация типа карты, карта должна быть debet иначе false
            public Boolean validatetypeCard (String typeCard){
                if(typeCard.equals("debet")){
                    return true;
                } else {
                    return false;
                }
            };

            //валидация валедельца карты, если owner не пусто, то true иначе false
            public Boolean validateOwner (String owner){
                if(!owner.isEmpty()){
                    return true;
                } else {
                    return false;
                }
            };

            //валидация срока дейсия карты. Если текущая дата <=  чем period то true
            public Boolean validatePeriod (String period) throws ParseException {
                Date datePeriod = new SimpleDateFormat("dd/MM/yyyy").parse(period);
                Date actualDate = new Date();
                if(actualDate.before(datePeriod)){
                    return true;
                } else {
                    return false;
                }
            };

            //валидация CVV. актуальный и проверяемый должны быть равны, иначе false
            public Boolean validateCvv (int actualCVV, int expectedCVV){
                if(actualCVV == expectedCVV){
                    return true;
                } else {
                    return false;
                }
            };
        }

        ValidateCard validateCard = new ValidateCard();
        System.out.println("Результат валидации номера карты: " + validateCard.validateNumberCard(numberCard));
        System.out.println("Результат валидации типа карты: " + validateCard.validatetypeCard(typeCard));
        System.out.println("Результат валидации владельца карты: " + validateCard.validateOwner(owner));
        System.out.println("Результат валидации периода карты: " + validateCard.validatePeriod(period));
        System.out.println("Результат валидации CVV карты: " + validateCard.validateCvv(actualCVV, expectedCVV));
    }
}
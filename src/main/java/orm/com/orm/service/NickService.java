package orm.com.orm.service;

import orm.com.orm.model.Users;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NickService {

    enum Status { ADMIN , MOD , USER }

    public static Users NickLength(Users newUsr){

        var flag = validateNickLen(newUsr.getusernick());
        if (flag){
            return newUsr;}
        else throw new RuntimeException();
    }

    public static boolean validateNickLen(String Nick) {
        return Nick.length()<=100 && Nick.length()>0;
    }

    public static Users EmailOk(Users newUsr) {
        String emailAddress = newUsr.getusernick();
        boolean EmailValidation = validate(emailAddress);

        if (EmailValidation){
            return newUsr;}
        else throw new RuntimeException(newUsr.getusernick());
    }

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    public static Users NickOkRole(Users newUsr){

        String role=newUsr.getRole();
        for (Status st : Status.values()) {
            if (st.toString().equals(role)){
                return newUsr;
            }
        }
        throw new RuntimeException();
    }

}



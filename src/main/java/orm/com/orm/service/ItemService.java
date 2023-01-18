package orm.com.orm.service;

import orm.com.orm.model.Items;

public class ItemService {

    public static boolean validateItemLen(String Leng,Boolean k) {
        if(k){
            return Leng.length()<=100 && Leng.length()>0;}
        else return Leng.length()<=300 && Leng.length()>0;
    }
    public static Items ItemNameLength(Items items){
        var flag = validateItemLen(items.getItemname(),Boolean.TRUE);
        if (flag){
            return items;}
        else throw new RuntimeException();
    }
    public static Items ItemDescLength(Items items){
        var flag = validateItemLen(items.getItemname(),Boolean.FALSE);
        if (flag){
            return items;}
        else throw new RuntimeException();
    }

}


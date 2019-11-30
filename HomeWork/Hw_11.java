package com.company.HomWork;

import java.util.HashMap;
import java.util.Map;

/**
/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него
 десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/
public class Hw_11 {
    public static void main(String[] args) {
        Map<String, String> map = createMap();
        map = removeTheFirstNameDuplicate(map);
        System.out.println(map);
    }

    public static Map createMap(){
        Map<String, String> map = new HashMap<>();
        map.put("Rooney", "Leo");
        map.put("Lloris", "Hugo");
        map.put("Messi", "Leo");
        map.put("Ronaldo", "Cristiano");
        map.put("Maldini", "Paolo");
        map.put("Indzaghi", "Pipo");
        map.put("Del Piero", "Alesandro");
        map.put("Balotelli", "Mario");
        map.put("Gotze", "Mario");
        map.put("Gomez", "Mario");
        return map;
    }


    public static Map<String,String> removeTheFirstNameDuplicate(Map<String, String> map){
        Map<String, String> resultMap = new HashMap<>();
//        String[] arrayValues = new String[map.size()];
//        int i = 0;
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            arrayValues[i] = entry.getValue();
//            i++;
//        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            int count = 0;
            for (String value : map.values()) {
                if(entry.getValue().equals(value)){
                    count++;
                }
            }

            if(count > 1){
            } else {
                resultMap.put(entry.getKey(), entry.getValue());
            }

        }

        return resultMap;
    }
}

package j081;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapHash {

    public static void main(String[] args) {
        /*Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        //map.get("key");
        System.out.println(map.get("key1111")); // ?
        System.out.println(map.get("key1"));
        System.out.println(map.toString());

        map.put("key1", "1111222333");
        //map.remove("key1");
        System.out.println(map.get("key1"));*/

        MapHash mapHash = new MapHash();
        mapHash.put("key1", "value1");
        mapHash.put("key2", "value2");
        mapHash.put("key3", "value3");
        System.out.println(mapHash.get("key1"));
        mapHash.put("key1", "value111");
        System.out.println(mapHash.toString());
        mapHash.remove("key1");
        System.out.println(mapHash.toString());
    }

    String[] keys;
    Object[] values;

    public MapHash() {
        keys = new String[0];
        values = new Object[0];
    }

    public void put(String key, String value) {
        boolean isExist = false;
        for (int i = 0; i < keys.length; i++) {
            if (keys[i].equals(key)) {
                values[i] = value;
                isExist = true;
            }
        }
        if(!isExist) {
            String[] newKeys = new String[keys.length + 1];
            Object[] newValues = new Object[keys.length + 1];
            for(int i = 0; i < keys.length; i++) {
                newKeys[i] = keys[i];
                newValues[i] = values[i];
            }
            newKeys[keys.length] = key;
            newValues[keys.length] = value;
            keys = newKeys;
            values = newValues;
        }
    }

    public Object get(String key) {
        for (int i = 0; i < keys.length; i++) {
            if (keys[i].equals(key)) {
                return values[i];
            }
        }
        return null;
    }

    public void remove(String key) {
        int order = -1;
        for (int i = 0; i < keys.length; i++) {
            if (keys[i].equals(key)) {
                order = i;
            }
        }
        if (order != -1) {
            String[] newKeys = new String[keys.length - 1];
            Object[] newValues = new Object[keys.length - 1];
            for(int i = 0; i < order; i++) {
                newKeys[i] = keys[i];
                newValues[i] = values[i];
            }
            for(int i = order; i < keys.length - 1; i++) {
                newKeys[i] = keys[i+1];
                newValues[i] = values[i+1];
            }
            keys = newKeys;
            values = newValues;
        }
    }

    @Override
    public String toString() {
        String result = "{";
        for (int i = 0; i < keys.length; i++) {
            result += keys[i] + "=" + values[i];
            if(i < keys.length - 1) {
                result += ", ";
            }
        }
        return result + "}";
    }

}

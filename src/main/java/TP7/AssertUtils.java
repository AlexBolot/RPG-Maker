package TP7;

import java.util.HashMap;
import java.util.List;

/*................................................................................................................................
 . Copyright (c)
 .
 . The AssertUtils	 Class was Coded by : Alexandre BOLOT
 .
 . Last Modified : 27/12/2019 18:40
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

public class AssertUtils {
    public static void assertParamsNotNull(Object... params) throws IllegalArgumentException {
        for (Object obj : params) {
            if (obj == null) throw new IllegalArgumentException("Parameter is null");
        }
    }

    public static void assertNotNull(Object object, String objectName) throws IllegalArgumentException {
        if (object == null) throw new IllegalArgumentException(objectName + " is null");
    }

    public static void assertNotEmpty(String string) throws IllegalArgumentException {
        if (string.isEmpty()) throw new IllegalArgumentException("String is empty");
    }

    public static void assertNotEmpty(String string, String stringName) throws IllegalArgumentException {
        if (string.isEmpty()) throw new IllegalArgumentException(stringName + " is empty");
    }

    public static void assertNotEmpty(List list) throws IllegalArgumentException {
        if (list.size() == 0) throw new IllegalArgumentException("List is empty");
    }

    public static void assertNotEmpty(List list, String listName) throws IllegalArgumentException {
        if (list.size() == 0) throw new IllegalArgumentException(listName + " is empty");
    }

    public static void assertNotEmpty(HashMap map) throws IllegalArgumentException {
        if (map.size() == 0) throw new IllegalArgumentException("Map is empty");
    }

    public static void assertNotEmpty(HashMap map, String mapName) throws IllegalArgumentException {
        if (map.size() == 0) throw new IllegalArgumentException(mapName + " is empty");
    }

    public static void assertStrictlyPositive(int val) throws IllegalArgumentException {
        if (val <= 0) throw new IllegalArgumentException("Value is not strictly positive");
    }

    public static void assertStrictlyPositive(int val, String valueName) throws IllegalArgumentException {
        if (val <= 0) throw new IllegalArgumentException(valueName + " is not strictly positive");
    }

    public static void assertStrictlyPositive(float val) throws IllegalArgumentException {
        if (val <= 0) throw new IllegalArgumentException("Value is not strictly positive");
    }

    public static void assertStrictlyPositive(float val, String valueName) throws IllegalArgumentException {
        if (val <= 0) throw new IllegalArgumentException(valueName + " is not strictly positive");
    }

    public static void assertNotNullOrEmpty(String string) throws IllegalArgumentException {
        assertParamsNotNull(string);
        assertNotEmpty(string);
    }

    public static void assertNotNullOrEmpty(String string, String stringName) throws IllegalArgumentException {
        assertNotNull(string, stringName);
        assertNotEmpty(string, stringName);
    }
}

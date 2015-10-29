package vcc.soha.sdk.conver;

import java.text.Normalizer;
import java.util.regex.Pattern;

/**
 * Created by Admin on 10/27/2015.
 */
public class ConverVNtoEN {
    public static String compile(String s) {
        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("");
    }
}

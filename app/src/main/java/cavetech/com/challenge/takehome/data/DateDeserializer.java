package cavetech.com.challenge.takehome.data;

import android.text.TextUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class DateDeserializer implements JsonDeserializer<Date> {

    public static final String[] DATE_FORMATS = new String[] {
        "yyyy-MM-dd HH:mm:ss", "MMM dd, yyyy HH:mm:ss a", "yyyy-MM-dd", "MM/dd/yy hh:mmaa"
    };

    @Override
    public Date deserialize(JsonElement jsonElement, Type typeOF, JsonDeserializationContext context)
        throws JsonParseException {
        final String jsonString = jsonElement.getAsString();
        //Check if json is empty
        //This would cause parsing to throw exception
        if (TextUtils.isEmpty(jsonString)) {
            return new Date();
        } else {
            for (String format : DATE_FORMATS) {
                // Try to parse date format from one of the values in DATE_FORMATS
                try {
                    return new SimpleDateFormat(format, Locale.US).parse(jsonString);
                } catch (ParseException e) {
                }
            }
        }
        throw new JsonParseException("Unparseable date: \""
                                         + jsonElement.getAsString()
                                         + "\". Supported formats: "
                                         + Arrays.toString(DATE_FORMATS));
    }
}

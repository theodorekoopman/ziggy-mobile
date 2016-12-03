package com.investec.ziggy.common;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 * Created by Theodore.Koopman on 2016/12/03.
 */

public class StringDeserializer implements JsonDeserializer<String>
{
    @Override
    public String deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        if (json.isJsonPrimitive()) return json.getAsString();
        return "";
    }
}
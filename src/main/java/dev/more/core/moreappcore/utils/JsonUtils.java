package dev.more.core.moreappcore.utils;

import com.google.gson.Gson;

public class JsonUtils {

    public static <T> String toJson(T payload) {
        Gson gson = new Gson();
        return gson.toJson(payload);
    }

}

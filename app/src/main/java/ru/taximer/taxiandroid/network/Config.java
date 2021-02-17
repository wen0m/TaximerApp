package ru.taximer.taxiandroid.network;


public class Config {
    public static String BASE_URL = "https://api.taximer.ru/webapi/";
    public static String DEV_URL = "https://dev.taximer.ru/webapi/";
    public static final int LOCATION_UPDATE_MIN_DISTANCE = 10;
    public static final long LOCATION_FASTEST_INTERVAL = 600 * 1000;
    public static final long LOCATION_INTERVAL = 1000 * 1000;
    public static final float DISPLACEMENT = 10000;
    public static String device_type = "ANDROID";
}

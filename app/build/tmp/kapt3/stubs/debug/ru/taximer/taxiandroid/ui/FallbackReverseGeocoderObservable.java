package ru.taximer.taxiandroid.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lru/taximer/taxiandroid/ui/FallbackReverseGeocoderObservable;", "Lio/reactivex/ObservableOnSubscribe;", "Lru/taximer/taxiandroid/network/models/Result;", "latitude", "", "longitude", "(DD)V", "alternativeReverseGeocodeQuery", "subscribe", "", "emitter", "Lio/reactivex/ObservableEmitter;", "app_debug"})
public final class FallbackReverseGeocoderObservable implements io.reactivex.ObservableOnSubscribe<ru.taximer.taxiandroid.network.models.Result> {
    private final double latitude = 0.0;
    private final double longitude = 0.0;
    
    @java.lang.Override()
    public void subscribe(@org.jetbrains.annotations.NotNull()
    io.reactivex.ObservableEmitter<ru.taximer.taxiandroid.network.models.Result> emitter) {
    }
    
    /**
     * * This function fetches a list of addresses for the set latitude, longitude and maxResults properties from the
     *     * Google Geocode API (http://maps.googleapis.com/maps/api/geocode).
     *     *
     *     * @return List of addresses
     *     * @throws IOException In case of network problems
     *     * @throws JSONException In case of problems while parsing the json response from google geocode API servers
     */
    private final ru.taximer.taxiandroid.network.models.Result alternativeReverseGeocodeQuery() throws java.io.IOException, org.json.JSONException {
        return null;
    }
    
    public FallbackReverseGeocoderObservable(double latitude, double longitude) {
        super();
    }
}
package com.arellomobile.mvp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoxyReflector {

	private static Map<Class<?>, Object> sViewStateProviders;
	private static Map<Class<?>, List<Object>> sPresenterBinders;
	private static Map<Class<?>, Object> sStrategies;

	static {
		sViewStateProviders = new HashMap<>();
		sViewStateProviders.put(ru.taximer.taxiandroid.presenters.AutocompletePresenter.class, new ru.taximer.taxiandroid.presenters.AutocompletePresenter$$ViewStateProvider());
		sViewStateProviders.put(ru.taximer.taxiandroid.presenters.GetBestTaxiPresenter.class, new ru.taximer.taxiandroid.presenters.GetBestTaxiPresenter$$ViewStateProvider());
		sViewStateProviders.put(ru.taximer.taxiandroid.presenters.GetTaxiPresenter.class, new ru.taximer.taxiandroid.presenters.GetTaxiPresenter$$ViewStateProvider());
		sViewStateProviders.put(ru.taximer.taxiandroid.presenters.MainTaxiPresenter.class, new ru.taximer.taxiandroid.presenters.MainTaxiPresenter$$ViewStateProvider());
		sViewStateProviders.put(ru.taximer.taxiandroid.presenters.SettingsPresenter.class, new ru.taximer.taxiandroid.presenters.SettingsPresenter$$ViewStateProvider());
		sViewStateProviders.put(ru.taximer.taxiandroid.presenters.SplashPresenter.class, new ru.taximer.taxiandroid.presenters.SplashPresenter$$ViewStateProvider());
		sViewStateProviders.put(ru.taximer.taxiandroid.presenters.TaxoparkPresenter.class, new ru.taximer.taxiandroid.presenters.TaxoparkPresenter$$ViewStateProvider());
		sViewStateProviders.put(ru.taximer.taxiandroid.presenters.UserSettingsPresenter.class, new ru.taximer.taxiandroid.presenters.UserSettingsPresenter$$ViewStateProvider());
		
		sPresenterBinders = new HashMap<>();
		sPresenterBinders.put(ru.taximer.taxiandroid.ui.MainTaxiScreen.class, Arrays.<Object>asList(new ru.taximer.taxiandroid.ui.MainTaxiScreen$$PresentersBinder()));
		sPresenterBinders.put(ru.taximer.taxiandroid.ui.SettingsActivity.class, Arrays.<Object>asList(new ru.taximer.taxiandroid.ui.SettingsActivity$$PresentersBinder()));
		sPresenterBinders.put(ru.taximer.taxiandroid.ui.SplashActivity.class, Arrays.<Object>asList(new ru.taximer.taxiandroid.ui.SplashActivity$$PresentersBinder()));
		sPresenterBinders.put(ru.taximer.taxiandroid.ui.TaxiActivity.class, Arrays.<Object>asList(new ru.taximer.taxiandroid.ui.TaxiActivity$$PresentersBinder()));
		sPresenterBinders.put(ru.taximer.taxiandroid.ui.fragments.MapFragment.class, Arrays.<Object>asList(new ru.taximer.taxiandroid.ui.fragments.MapFragment$$PresentersBinder()));
		
		sStrategies = new HashMap<>();
		sStrategies.put(com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class, new com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy());
		sStrategies.put(com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class, new com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy());
	}
	
	public static Object getViewState(Class<?> presenterClass) {
		ViewStateProvider viewStateProvider = (ViewStateProvider) sViewStateProviders.get(presenterClass);
		if (viewStateProvider == null) {
			return null;
		}
		
		return viewStateProvider.getViewState();
	}

	public static List<Object> getPresenterBinders(Class<?> delegated) {
		return sPresenterBinders.get(delegated);
	}
	public static Object getStrategy(Class<?> strategyClass) {
		return sStrategies.get(strategyClass);
	}
}

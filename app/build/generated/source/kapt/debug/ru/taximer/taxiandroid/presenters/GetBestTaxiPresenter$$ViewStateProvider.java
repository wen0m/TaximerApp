package ru.taximer.taxiandroid.presenters;

import com.arellomobile.mvp.ViewStateProvider;
import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.MvpViewState;

public class GetBestTaxiPresenter$$ViewStateProvider extends ViewStateProvider {
	
	@Override
	public MvpViewState<? extends MvpView> getViewState() {
		return new ru.taximer.taxiandroid.presenters.GetBestTaxiView$$State();
	}
}
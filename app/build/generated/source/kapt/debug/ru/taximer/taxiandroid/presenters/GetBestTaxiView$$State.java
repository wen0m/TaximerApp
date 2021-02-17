package ru.taximer.taxiandroid.presenters;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class GetBestTaxiView$$State extends MvpViewState<ru.taximer.taxiandroid.presenters.GetBestTaxiView> implements ru.taximer.taxiandroid.presenters.GetBestTaxiView {
	private ViewCommands<ru.taximer.taxiandroid.presenters.GetBestTaxiView> mViewCommands = new ViewCommands<>();

	@Override
	public void restoreState(ru.taximer.taxiandroid.presenters.GetBestTaxiView view, Set<ViewCommand<ru.taximer.taxiandroid.presenters.GetBestTaxiView>> currentState) {
		if (mViewCommands.isEmpty()) {
			return;
		}

		mViewCommands.reapply(view, currentState);
	}

	@Override
	public  void addBestTaxi(@org.jetbrains.annotations.NotNull ru.taximer.taxiandroid.network.models.SearchTaxiModel taxi) {
		AddBestTaxiCommand addBestTaxiCommand = new AddBestTaxiCommand(taxi);
		mViewCommands.beforeApply(addBestTaxiCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.GetBestTaxiView view : mViews) {
			getCurrentState(view).add(addBestTaxiCommand);
			view.addBestTaxi(taxi);
		}

		mViewCommands.afterApply(addBestTaxiCommand);
	}

	@Override
	public  void showResults() {
		ShowResultsCommand showResultsCommand = new ShowResultsCommand();
		mViewCommands.beforeApply(showResultsCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.GetBestTaxiView view : mViews) {
			getCurrentState(view).add(showResultsCommand);
			view.showResults();
		}

		mViewCommands.afterApply(showResultsCommand);
	}

	@Override
	public  void showLoading() {
		ShowLoadingCommand showLoadingCommand = new ShowLoadingCommand();
		mViewCommands.beforeApply(showLoadingCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.GetBestTaxiView view : mViews) {
			getCurrentState(view).add(showLoadingCommand);
			view.showLoading();
		}

		mViewCommands.afterApply(showLoadingCommand);
	}

	@Override
	public  void hideLoading() {
		HideLoadingCommand hideLoadingCommand = new HideLoadingCommand();
		mViewCommands.beforeApply(hideLoadingCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.GetBestTaxiView view : mViews) {
			getCurrentState(view).add(hideLoadingCommand);
			view.hideLoading();
		}

		mViewCommands.afterApply(hideLoadingCommand);
	}

	@Override
	public  void showError(@org.jetbrains.annotations.NotNull java.lang.String message) {
		ShowErrorCommand showErrorCommand = new ShowErrorCommand(message);
		mViewCommands.beforeApply(showErrorCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.GetBestTaxiView view : mViews) {
			getCurrentState(view).add(showErrorCommand);
			view.showError(message);
		}

		mViewCommands.afterApply(showErrorCommand);
	}


	public class AddBestTaxiCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.GetBestTaxiView> {
		public final ru.taximer.taxiandroid.network.models.SearchTaxiModel taxi;

		AddBestTaxiCommand(@org.jetbrains.annotations.NotNull ru.taximer.taxiandroid.network.models.SearchTaxiModel taxi) {
			super("addBestTaxi", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
			this.taxi = taxi;
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.GetBestTaxiView mvpView) {
			mvpView.addBestTaxi(taxi);
			getCurrentState(mvpView).add(this);
		}
	}

	public class ShowResultsCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.GetBestTaxiView> {
		ShowResultsCommand() {
			super("showResults", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.GetBestTaxiView mvpView) {
			mvpView.showResults();
			getCurrentState(mvpView).add(this);
		}
	}

	public class ShowLoadingCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.GetBestTaxiView> {
		ShowLoadingCommand() {
			super("showLoading", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.GetBestTaxiView mvpView) {
			mvpView.showLoading();
			getCurrentState(mvpView).add(this);
		}
	}

	public class HideLoadingCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.GetBestTaxiView> {
		HideLoadingCommand() {
			super("hideLoading", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.GetBestTaxiView mvpView) {
			mvpView.hideLoading();
			getCurrentState(mvpView).add(this);
		}
	}

	public class ShowErrorCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.GetBestTaxiView> {
		public final java.lang.String message;

		ShowErrorCommand(@org.jetbrains.annotations.NotNull java.lang.String message) {
			super("showError", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
			this.message = message;
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.GetBestTaxiView mvpView) {
			mvpView.showError(message);
			getCurrentState(mvpView).add(this);
		}
	}
}

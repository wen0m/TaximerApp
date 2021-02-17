package ru.taximer.taxiandroid.presenters;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class GetTaxiView$$State extends MvpViewState<ru.taximer.taxiandroid.presenters.GetTaxiView> implements ru.taximer.taxiandroid.presenters.GetTaxiView {
	private ViewCommands<ru.taximer.taxiandroid.presenters.GetTaxiView> mViewCommands = new ViewCommands<>();

	@Override
	public void restoreState(ru.taximer.taxiandroid.presenters.GetTaxiView view, Set<ViewCommand<ru.taximer.taxiandroid.presenters.GetTaxiView>> currentState) {
		if (mViewCommands.isEmpty()) {
			return;
		}

		mViewCommands.reapply(view, currentState);
	}

	@Override
	public  void addTaxi(@org.jetbrains.annotations.NotNull ru.taximer.taxiandroid.network.models.SearchTaxiModel taxi) {
		AddTaxiCommand addTaxiCommand = new AddTaxiCommand(taxi);
		mViewCommands.beforeApply(addTaxiCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.GetTaxiView view : mViews) {
			getCurrentState(view).add(addTaxiCommand);
			view.addTaxi(taxi);
		}

		mViewCommands.afterApply(addTaxiCommand);
	}

	@Override
	public  void lastResultAdded() {
		LastResultAddedCommand lastResultAddedCommand = new LastResultAddedCommand();
		mViewCommands.beforeApply(lastResultAddedCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.GetTaxiView view : mViews) {
			getCurrentState(view).add(lastResultAddedCommand);
			view.lastResultAdded();
		}

		mViewCommands.afterApply(lastResultAddedCommand);
	}

	@Override
	public  void showLoadingIndicator() {
		ShowLoadingIndicatorCommand showLoadingIndicatorCommand = new ShowLoadingIndicatorCommand();
		mViewCommands.beforeApply(showLoadingIndicatorCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.GetTaxiView view : mViews) {
			getCurrentState(view).add(showLoadingIndicatorCommand);
			view.showLoadingIndicator();
		}

		mViewCommands.afterApply(showLoadingIndicatorCommand);
	}

	@Override
	public  void hideLoadingIndicator() {
		HideLoadingIndicatorCommand hideLoadingIndicatorCommand = new HideLoadingIndicatorCommand();
		mViewCommands.beforeApply(hideLoadingIndicatorCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.GetTaxiView view : mViews) {
			getCurrentState(view).add(hideLoadingIndicatorCommand);
			view.hideLoadingIndicator();
		}

		mViewCommands.afterApply(hideLoadingIndicatorCommand);
	}

	@Override
	public  void showLoading() {
		ShowLoadingCommand showLoadingCommand = new ShowLoadingCommand();
		mViewCommands.beforeApply(showLoadingCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.GetTaxiView view : mViews) {
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

		for(ru.taximer.taxiandroid.presenters.GetTaxiView view : mViews) {
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

		for(ru.taximer.taxiandroid.presenters.GetTaxiView view : mViews) {
			getCurrentState(view).add(showErrorCommand);
			view.showError(message);
		}

		mViewCommands.afterApply(showErrorCommand);
	}


	public class AddTaxiCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.GetTaxiView> {
		public final ru.taximer.taxiandroid.network.models.SearchTaxiModel taxi;

		AddTaxiCommand(@org.jetbrains.annotations.NotNull ru.taximer.taxiandroid.network.models.SearchTaxiModel taxi) {
			super("addTaxi", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
			this.taxi = taxi;
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.GetTaxiView mvpView) {
			mvpView.addTaxi(taxi);
			getCurrentState(mvpView).add(this);
		}
	}

	public class LastResultAddedCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.GetTaxiView> {
		LastResultAddedCommand() {
			super("lastResultAdded", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.GetTaxiView mvpView) {
			mvpView.lastResultAdded();
			getCurrentState(mvpView).add(this);
		}
	}

	public class ShowLoadingIndicatorCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.GetTaxiView> {
		ShowLoadingIndicatorCommand() {
			super("showLoadingIndicator", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.GetTaxiView mvpView) {
			mvpView.showLoadingIndicator();
			getCurrentState(mvpView).add(this);
		}
	}

	public class HideLoadingIndicatorCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.GetTaxiView> {
		HideLoadingIndicatorCommand() {
			super("hideLoadingIndicator", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.GetTaxiView mvpView) {
			mvpView.hideLoadingIndicator();
			getCurrentState(mvpView).add(this);
		}
	}

	public class ShowLoadingCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.GetTaxiView> {
		ShowLoadingCommand() {
			super("showLoading", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.GetTaxiView mvpView) {
			mvpView.showLoading();
			getCurrentState(mvpView).add(this);
		}
	}

	public class HideLoadingCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.GetTaxiView> {
		HideLoadingCommand() {
			super("hideLoading", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.GetTaxiView mvpView) {
			mvpView.hideLoading();
			getCurrentState(mvpView).add(this);
		}
	}

	public class ShowErrorCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.GetTaxiView> {
		public final java.lang.String message;

		ShowErrorCommand(@org.jetbrains.annotations.NotNull java.lang.String message) {
			super("showError", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
			this.message = message;
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.GetTaxiView mvpView) {
			mvpView.showError(message);
			getCurrentState(mvpView).add(this);
		}
	}
}

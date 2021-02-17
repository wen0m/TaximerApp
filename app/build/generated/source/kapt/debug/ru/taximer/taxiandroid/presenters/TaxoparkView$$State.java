package ru.taximer.taxiandroid.presenters;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class TaxoparkView$$State extends MvpViewState<ru.taximer.taxiandroid.presenters.TaxoparkView> implements ru.taximer.taxiandroid.presenters.TaxoparkView {
	private ViewCommands<ru.taximer.taxiandroid.presenters.TaxoparkView> mViewCommands = new ViewCommands<>();

	@Override
	public void restoreState(ru.taximer.taxiandroid.presenters.TaxoparkView view, Set<ViewCommand<ru.taximer.taxiandroid.presenters.TaxoparkView>> currentState) {
		if (mViewCommands.isEmpty()) {
			return;
		}

		mViewCommands.reapply(view, currentState);
	}

	@Override
	public  void setTaxoparkPack(@org.jetbrains.annotations.NotNull java.util.List<java.lang.Long> taxoparl, @org.jetbrains.annotations.NotNull java.lang.String hash) {
		SetTaxoparkPackCommand setTaxoparkPackCommand = new SetTaxoparkPackCommand(taxoparl, hash);
		mViewCommands.beforeApply(setTaxoparkPackCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.TaxoparkView view : mViews) {
			getCurrentState(view).add(setTaxoparkPackCommand);
			view.setTaxoparkPack(taxoparl, hash);
		}

		mViewCommands.afterApply(setTaxoparkPackCommand);
	}

	@Override
	public  void refreshOrderStatus(@org.jetbrains.annotations.NotNull java.lang.String description,  int orderId) {
		RefreshOrderStatusCommand refreshOrderStatusCommand = new RefreshOrderStatusCommand(description, orderId);
		mViewCommands.beforeApply(refreshOrderStatusCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.TaxoparkView view : mViews) {
			getCurrentState(view).add(refreshOrderStatusCommand);
			view.refreshOrderStatus(description, orderId);
		}

		mViewCommands.afterApply(refreshOrderStatusCommand);
	}

	@Override
	public  void showLoading() {
		ShowLoadingCommand showLoadingCommand = new ShowLoadingCommand();
		mViewCommands.beforeApply(showLoadingCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.TaxoparkView view : mViews) {
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

		for(ru.taximer.taxiandroid.presenters.TaxoparkView view : mViews) {
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

		for(ru.taximer.taxiandroid.presenters.TaxoparkView view : mViews) {
			getCurrentState(view).add(showErrorCommand);
			view.showError(message);
		}

		mViewCommands.afterApply(showErrorCommand);
	}


	public class SetTaxoparkPackCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.TaxoparkView> {
		public final java.util.List<java.lang.Long> taxoparl;
		public final java.lang.String hash;

		SetTaxoparkPackCommand(@org.jetbrains.annotations.NotNull java.util.List<java.lang.Long> taxoparl, @org.jetbrains.annotations.NotNull java.lang.String hash) {
			super("setTaxoparkPack", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
			this.taxoparl = taxoparl;
			this.hash = hash;
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.TaxoparkView mvpView) {
			mvpView.setTaxoparkPack(taxoparl, hash);
			getCurrentState(mvpView).add(this);
		}
	}

	public class RefreshOrderStatusCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.TaxoparkView> {
		public final java.lang.String description;
		public final int orderId;

		RefreshOrderStatusCommand(@org.jetbrains.annotations.NotNull java.lang.String description,  int orderId) {
			super("refreshOrderStatus", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
			this.description = description;
			this.orderId = orderId;
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.TaxoparkView mvpView) {
			mvpView.refreshOrderStatus(description, orderId);
			getCurrentState(mvpView).add(this);
		}
	}

	public class ShowLoadingCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.TaxoparkView> {
		ShowLoadingCommand() {
			super("showLoading", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.TaxoparkView mvpView) {
			mvpView.showLoading();
			getCurrentState(mvpView).add(this);
		}
	}

	public class HideLoadingCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.TaxoparkView> {
		HideLoadingCommand() {
			super("hideLoading", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.TaxoparkView mvpView) {
			mvpView.hideLoading();
			getCurrentState(mvpView).add(this);
		}
	}

	public class ShowErrorCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.TaxoparkView> {
		public final java.lang.String message;

		ShowErrorCommand(@org.jetbrains.annotations.NotNull java.lang.String message) {
			super("showError", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
			this.message = message;
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.TaxoparkView mvpView) {
			mvpView.showError(message);
			getCurrentState(mvpView).add(this);
		}
	}
}

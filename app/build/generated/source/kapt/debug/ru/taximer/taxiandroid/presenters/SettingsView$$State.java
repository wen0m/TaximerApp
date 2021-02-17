package ru.taximer.taxiandroid.presenters;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class SettingsView$$State extends MvpViewState<ru.taximer.taxiandroid.presenters.SettingsView> implements ru.taximer.taxiandroid.presenters.SettingsView {
	private ViewCommands<ru.taximer.taxiandroid.presenters.SettingsView> mViewCommands = new ViewCommands<>();

	@Override
	public void restoreState(ru.taximer.taxiandroid.presenters.SettingsView view, Set<ViewCommand<ru.taximer.taxiandroid.presenters.SettingsView>> currentState) {
		if (mViewCommands.isEmpty()) {
			return;
		}

		mViewCommands.reapply(view, currentState);
	}

	@Override
	public  void setBuisnes() {
		SetBuisnesCommand setBuisnesCommand = new SetBuisnesCommand();
		mViewCommands.beforeApply(setBuisnesCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.SettingsView view : mViews) {
			getCurrentState(view).add(setBuisnesCommand);
			view.setBuisnes();
		}

		mViewCommands.afterApply(setBuisnesCommand);
	}

	@Override
	public  void setEconomy() {
		SetEconomyCommand setEconomyCommand = new SetEconomyCommand();
		mViewCommands.beforeApply(setEconomyCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.SettingsView view : mViews) {
			getCurrentState(view).add(setEconomyCommand);
			view.setEconomy();
		}

		mViewCommands.afterApply(setEconomyCommand);
	}

	@Override
	public  void setMiniven() {
		SetMinivenCommand setMinivenCommand = new SetMinivenCommand();
		mViewCommands.beforeApply(setMinivenCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.SettingsView view : mViews) {
			getCurrentState(view).add(setMinivenCommand);
			view.setMiniven();
		}

		mViewCommands.afterApply(setMinivenCommand);
	}

	@Override
	public  void setComfort() {
		SetComfortCommand setComfortCommand = new SetComfortCommand();
		mViewCommands.beforeApply(setComfortCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.SettingsView view : mViews) {
			getCurrentState(view).add(setComfortCommand);
			view.setComfort();
		}

		mViewCommands.afterApply(setComfortCommand);
	}

	@Override
	public  void setIsChild( boolean value) {
		SetIsChildCommand setIsChildCommand = new SetIsChildCommand(value);
		mViewCommands.beforeApply(setIsChildCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.SettingsView view : mViews) {
			getCurrentState(view).add(setIsChildCommand);
			view.setIsChild(value);
		}

		mViewCommands.afterApply(setIsChildCommand);
	}

	@Override
	public  void setIsCard( boolean value) {
		SetIsCardCommand setIsCardCommand = new SetIsCardCommand(value);
		mViewCommands.beforeApply(setIsCardCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.SettingsView view : mViews) {
			getCurrentState(view).add(setIsCardCommand);
			view.setIsCard(value);
		}

		mViewCommands.afterApply(setIsCardCommand);
	}

	@Override
	public  void setIsCAsh( boolean value) {
		SetIsCAshCommand setIsCAshCommand = new SetIsCAshCommand(value);
		mViewCommands.beforeApply(setIsCAshCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.SettingsView view : mViews) {
			getCurrentState(view).add(setIsCAshCommand);
			view.setIsCAsh(value);
		}

		mViewCommands.afterApply(setIsCAshCommand);
	}

	@Override
	public  void showError(@org.jetbrains.annotations.NotNull java.lang.String message) {
		ShowErrorCommand showErrorCommand = new ShowErrorCommand(message);
		mViewCommands.beforeApply(showErrorCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(ru.taximer.taxiandroid.presenters.SettingsView view : mViews) {
			getCurrentState(view).add(showErrorCommand);
			view.showError(message);
		}

		mViewCommands.afterApply(showErrorCommand);
	}


	public class SetBuisnesCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.SettingsView> {
		SetBuisnesCommand() {
			super("setBuisnes", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.SettingsView mvpView) {
			mvpView.setBuisnes();
			getCurrentState(mvpView).add(this);
		}
	}

	public class SetEconomyCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.SettingsView> {
		SetEconomyCommand() {
			super("setEconomy", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.SettingsView mvpView) {
			mvpView.setEconomy();
			getCurrentState(mvpView).add(this);
		}
	}

	public class SetMinivenCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.SettingsView> {
		SetMinivenCommand() {
			super("setMiniven", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.SettingsView mvpView) {
			mvpView.setMiniven();
			getCurrentState(mvpView).add(this);
		}
	}

	public class SetComfortCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.SettingsView> {
		SetComfortCommand() {
			super("setComfort", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.SettingsView mvpView) {
			mvpView.setComfort();
			getCurrentState(mvpView).add(this);
		}
	}

	public class SetIsChildCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.SettingsView> {
		public final boolean value;

		SetIsChildCommand( boolean value) {
			super("setIsChild", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
			this.value = value;
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.SettingsView mvpView) {
			mvpView.setIsChild(value);
			getCurrentState(mvpView).add(this);
		}
	}

	public class SetIsCardCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.SettingsView> {
		public final boolean value;

		SetIsCardCommand( boolean value) {
			super("setIsCard", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
			this.value = value;
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.SettingsView mvpView) {
			mvpView.setIsCard(value);
			getCurrentState(mvpView).add(this);
		}
	}

	public class SetIsCAshCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.SettingsView> {
		public final boolean value;

		SetIsCAshCommand( boolean value) {
			super("setIsCAsh", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
			this.value = value;
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.SettingsView mvpView) {
			mvpView.setIsCAsh(value);
			getCurrentState(mvpView).add(this);
		}
	}

	public class ShowErrorCommand extends ViewCommand<ru.taximer.taxiandroid.presenters.SettingsView> {
		public final java.lang.String message;

		ShowErrorCommand(@org.jetbrains.annotations.NotNull java.lang.String message) {
			super("showError", com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class);
			this.message = message;
		}

		@Override
		public void apply(ru.taximer.taxiandroid.presenters.SettingsView mvpView) {
			mvpView.showError(message);
			getCurrentState(mvpView).add(this);
		}
	}
}

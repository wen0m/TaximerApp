package ru.taximer.taxiandroid.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\u0003H&\u00a8\u0006\f"}, d2 = {"Lru/taximer/taxiandroid/presenters/SettingsView;", "Lru/taximer/taxiandroid/presenters/base/BaseView;", "setBuisnes", "", "setComfort", "setEconomy", "setIsCAsh", "value", "", "setIsCard", "setIsChild", "setMiniven", "app_debug"})
@com.arellomobile.mvp.viewstate.strategy.StateStrategyType(value = com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class)
public abstract interface SettingsView extends ru.taximer.taxiandroid.presenters.base.BaseView {
    
    public abstract void setBuisnes();
    
    public abstract void setEconomy();
    
    public abstract void setMiniven();
    
    public abstract void setComfort();
    
    public abstract void setIsChild(boolean value);
    
    public abstract void setIsCard(boolean value);
    
    public abstract void setIsCAsh(boolean value);
}
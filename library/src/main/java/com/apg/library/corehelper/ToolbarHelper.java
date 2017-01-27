package com.apg.library.corehelper;

import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by X-tivity on 1/27/2017 AD.
 */

public class ToolbarHelper {

    ToolbarHelper() {

    }

    public class Builder<T extends AppCompatActivity> {

        private final T mActivity;
        private boolean isDisplayUpIcon = false;
        private boolean isDisplayTitle = true;
        private boolean isHomeButtonEnable = true;
        private int upDrawableIcon = 0;
        private String title;

        private Builder(T activity) {
            this.mActivity = activity;
        }

        public Builder setDisplayUpIcon(boolean b) {
            this.isDisplayUpIcon = b;
            return this;
        }

        public Builder setDisplayTitle(boolean b) {
            this.isDisplayTitle = b;
            return this;
        }

        public Builder setHomeButtonEnable(boolean b) {
            this.isHomeButtonEnable = b;
            return this;
        }

        public Builder setUpIcon(@DrawableRes int id) {
            this.upDrawableIcon = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setTitle(@StringRes int title) {
            this.title = mActivity.getString(title);
            return this;
        }

        public void create(Toolbar toolbar) {
            mActivity.setSupportActionBar(toolbar);
            ActionBar actionBar = mActivity.getSupportActionBar();
            if (actionBar != null) {
                actionBar.setDisplayHomeAsUpEnabled(isDisplayUpIcon);
                actionBar.setDisplayShowTitleEnabled(isDisplayTitle);
                actionBar.setHomeButtonEnabled(isHomeButtonEnable);

                if (title != null && !title.isEmpty()) {
                    actionBar.setTitle(title);
                }

                if (upDrawableIcon != 0) {
                    actionBar.setHomeAsUpIndicator(upDrawableIcon);
                }
            }
        }
    }

    public <T extends AppCompatActivity> Builder builder(T activity) {
        return new Builder<>(activity);
    }
}

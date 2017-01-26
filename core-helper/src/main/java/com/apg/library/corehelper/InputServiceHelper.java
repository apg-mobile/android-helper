package com.apg.library.corehelper;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * Created by X-tivity on 1/26/2017 AD.
 */

public class InputServiceHelper {

    InputServiceHelper() {

    }

    private InputMethodManager getInputMethodManager(Context context) {
        return (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
    }

    public void hideKeyboard(Activity activity){

        //android.R.id.content ( http://stackoverflow.com/a/12887919/2077479 )
        View rootView = activity.findViewById(android.R.id.content).getRootView();
        getInputMethodManager(activity)
                .hideSoftInputFromWindow(rootView.getWindowToken(), 0);
    }

    public void showKeyboard(EditText edt) {
        getInputMethodManager(edt.getContext())
                .showSoftInput(edt, InputMethodManager.SHOW_IMPLICIT);
    }

    public void showKeyboard(Activity activity, final EditText editText){

        if (!editText.hasFocus()) {
            editText.requestFocus();
        }

        editText.post(() -> getInputMethodManager(activity)
                .showSoftInput(editText, InputMethodManager.SHOW_FORCED));
    }
}

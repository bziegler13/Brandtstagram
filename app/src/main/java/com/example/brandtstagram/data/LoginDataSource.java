package com.example.brandtstagram.data;

import android.util.Log;
import android.widget.Toast;

import com.example.brandtstagram.data.model.LoggedInUser;
import com.example.brandtstagram.ui.login.LoginActivity;
import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {
    public static final String TAG = "LoginDataSource";

    public Result<LoggedInUser> login(String username, String password) {


        Log.i(TAG, "Attempting to login user " + username);

        try {
            // TODO: handle loggedInUser authentication
            ParseUser.logIn(username, password);
            LoggedInUser loggedInUser = new LoggedInUser(
                    ParseUser.getCurrentUser().getObjectId(),
                    ParseUser.getCurrentUser().getUsername()
            );
            return new Result.Success<>(loggedInUser);
        } catch (Exception e) {
            Log.e(TAG, "Issue with login", e);
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        ParseUser.logOut();
        // TODO: revoke authentication
    }
}
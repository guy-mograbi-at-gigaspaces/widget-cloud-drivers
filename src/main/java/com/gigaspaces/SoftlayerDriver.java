package com.gigaspaces;

/**
 * User: guym
 * Date: 10/15/13
 * Time: 4:20 PM
 */
public class SoftlayerDriver extends AbstractWidgetDriver{

    String username;
    String apiKey;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public String toString() {
        return "SoftlayerDriver{" +
                "username='" + username + '\'' +
                '}';
    }
}

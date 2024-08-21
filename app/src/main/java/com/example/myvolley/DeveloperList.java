package com.example.myvolley;

public class DeveloperList {
    private String login;
    private String avatar_url;
    private String html_url;
    public DeveloperList(String login, String gitUrl, String avatar_url){
        this.login = login;
        this.avatar_url = avatar_url;
        this.html_url = gitUrl;
    }
    //Hold developer's name
    public java.lang.String getLogin() {
        return login;
    }

    //Hold developer's image url
    public String getAvatar_url(){
        return avatar_url;
    }

    //Hold developer's github url
    public String getHtml_url(){
        return html_url;
    }
}

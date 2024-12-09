package com.yevhen.GoogleOauth2Login.model;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority
{
    USER;

    @Override
    public String getAuthority()
    {
        return name();
    }
}
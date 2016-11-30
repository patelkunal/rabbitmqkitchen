package org.coderearth.rabbitmqkitchen.webservice.domain;

import com.google.common.base.MoreObjects;

/**
 * Created by kunal_patel on 11/30/16.
 */
public class AppUser {

    private int id;
    private String name;
    private String email;

    public AppUser() {
    }

    public AppUser(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("name", name)
                .add("email", email)
                .toString();
    }
}

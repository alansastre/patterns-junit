package com.patterns.behavioral.mediator;

public abstract class AbstractUser {

    protected ChatMediator mediator;
    protected String name;

    public AbstractUser(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        this.mediator.addUser(this);
    }

    public abstract void send(String message);

    public abstract void receive(String message);

    public ChatMediator getMediator() {
        return mediator;
    }

    public AbstractUser setMediator(ChatMediator mediator) {
        this.mediator = mediator;
        return this;
    }

    public String getName() {
        return name;
    }

    public AbstractUser setName(String name) {
        this.name = name;
        return this;
    }
}

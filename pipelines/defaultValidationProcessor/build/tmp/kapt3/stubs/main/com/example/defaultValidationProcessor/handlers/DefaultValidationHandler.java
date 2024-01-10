package com.example.defaultValidationProcessor.handlers;

@org.springframework.stereotype.Component
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0012J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0014\u0010\n\u001a\u00020\tX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/defaultValidationProcessor/handlers/DefaultValidationHandler;", "Lcom/example/message/subscriber/handler/AbstractChatProcessPipeBase;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "userCommand", "Lcom/example/persistence/repository/user/command/ChatUserCommand;", "publisher", "Lcom/example/message/publisher/Publisher;", "processStep", "", "lastStep", "(Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/example/persistence/repository/user/command/ChatUserCommand;Lcom/example/message/publisher/Publisher;II)V", "getLastStep", "()I", "getProcessStep", "getPublisher", "()Lcom/example/message/publisher/Publisher;", "isMuteUser", "", "sender", "Lcom/example/domain/model/ChatUser;", "process", "", "message", "", "defaultValidationProcessor"})
public class DefaultValidationHandler extends com.example.message.subscriber.handler.AbstractChatProcessPipeBase {
    @org.jetbrains.annotations.NotNull
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.persistence.repository.user.command.ChatUserCommand userCommand = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.message.publisher.Publisher publisher = null;
    private final int processStep = 0;
    private final int lastStep = 0;
    
    public DefaultValidationHandler(@org.jetbrains.annotations.NotNull
    com.fasterxml.jackson.databind.ObjectMapper objectMapper, @org.jetbrains.annotations.NotNull
    com.example.persistence.repository.user.command.ChatUserCommand userCommand, @org.jetbrains.annotations.NotNull
    com.example.message.publisher.Publisher publisher, @org.springframework.beans.factory.annotation.Value(value = "${spring.chat.processor.step}")
    int processStep, @org.springframework.beans.factory.annotation.Value(value = "${spring.chat.processor.lastStep}")
    int lastStep) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    protected com.example.message.publisher.Publisher getPublisher() {
        return null;
    }
    
    @java.lang.Override
    protected int getProcessStep() {
        return 0;
    }
    
    @java.lang.Override
    protected int getLastStep() {
        return 0;
    }
    
    @java.lang.Override
    public void process(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    private boolean isMuteUser(com.example.domain.model.ChatUser sender) {
        return false;
    }
}
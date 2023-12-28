package com.example.persistence.repository.chat.command;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/persistence/repository/chat/command/ChatMessageCommand;", "", "save", "Lreactor/core/publisher/Mono;", "Lcom/example/domain/model/ChatMessage;", "chat", "persistence"})
public abstract interface ChatMessageCommand {
    
    @org.jetbrains.annotations.NotNull
    public abstract reactor.core.publisher.Mono<com.example.domain.model.ChatMessage> save(@org.jetbrains.annotations.NotNull
    com.example.domain.model.ChatMessage chat);
}
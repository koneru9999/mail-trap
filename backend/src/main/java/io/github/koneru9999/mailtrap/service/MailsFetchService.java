package io.github.koneru9999.mailtrap.service;

import io.github.koneru9999.mailtrap.controller.Message;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MailsFetchService {

    Flux<Message> fetchEmails(Integer pageNumber, Integer pageSize);

    Mono<Void> clearMessages();

    Mono<Message> getById(String messageId);

    Mono<Integer> count();
}

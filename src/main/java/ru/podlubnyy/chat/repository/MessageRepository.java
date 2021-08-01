package ru.podlubnyy.chat.repository;

import org.springframework.data.repository.CrudRepository;
import ru.podlubnyy.chat.domain.Message;

/**
 * Created by Alexey Podlubnyy on 02.08.2021
 */
public interface MessageRepository extends CrudRepository<Message, Long> {

}

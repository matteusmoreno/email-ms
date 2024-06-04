package br.com.matteusmoreno.email_ms.consumer;

import br.com.matteusmoreno.email_ms.model.Email;
import br.com.matteusmoreno.email_ms.request.CreateEmailRequest;
import br.com.matteusmoreno.email_ms.service.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    private final EmailService emailService;

    @Autowired
    public EmailConsumer(EmailService emailService) {
        this.emailService = emailService;
    }

    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenEmailQueue(@Payload CreateEmailRequest request) {
        Email email = new Email();
        BeanUtils.copyProperties(request, email);

        emailService.sendEmail(email);
    }
}

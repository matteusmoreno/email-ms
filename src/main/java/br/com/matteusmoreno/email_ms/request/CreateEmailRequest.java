package br.com.matteusmoreno.email_ms.request;

import java.util.UUID;

public record CreateEmailRequest(
        UUID userId,
        String emailTo,
        String subject,
        String text) {
}

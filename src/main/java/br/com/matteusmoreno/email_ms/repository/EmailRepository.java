package br.com.matteusmoreno.email_ms.repository;

import br.com.matteusmoreno.email_ms.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<Email, UUID> {
}

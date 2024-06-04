package br.com.matteusmoreno.email_ms.model;

import br.com.matteusmoreno.email_ms.constant.StatusEmail;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "emails")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "email_id", columnDefinition = "BINARY(16)")
    private UUID emailId;

    @Column(name = "user_id", columnDefinition = "BINARY(16)")
    private UUID userId;

    @Column(name = "email_from")
    private String emailFrom;

    @Column(name = "email_to")
    private String emailTo;

    private String subject;

    private String text;

    @Column(name = "send_date_email")
    private LocalDateTime sendDateEmail;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_email")
    private StatusEmail statusEmail;

}

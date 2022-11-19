package com.example.weddingplanner.application.shared.repository;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@MappedSuperclass
@NoArgsConstructor
abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long id;

    @CreationTimestamp
    @Column(name = "creation_time")
    LocalDateTime creationTime;

    @UpdateTimestamp
    @Column(name = "update_time")
    LocalDateTime updateTime;
}

package org.solobyte.reactasync.repository;

import org.solobyte.reactasync.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
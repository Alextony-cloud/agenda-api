package io.github.alextonycloud.agendaapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.alextonycloud.agendaapi.model.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Integer>{

}

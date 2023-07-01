package br.com.giulianabezerra.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.giulianabezerra.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}

package br.com.devsilveira.task.model.task;

import java.time.LocalDate;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Task {

    private Long id;
    private String title;
    private String description;
    private LocalDate dateCreate;
    private LocalDate dateFinish;
    private Priority priority;
    private Status status;
}

package me.devkim.todoapp.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ToDoItem {
    @Id
    private String id;
    private String title;
    private boolean done;
}

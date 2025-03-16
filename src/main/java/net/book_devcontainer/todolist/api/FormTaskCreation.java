package net.book_devcontainer.todolist.api;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

record FormTaskCreation(
    @NotEmpty @Size(max = 64) String title,
    @Size(max = 64) String memo,
    @NotEmpty String dueDate
) {}
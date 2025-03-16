package net.book_devcontainer.todolist.api;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

record FormTaskUpdate(@NotNull Integer id, @NotEmpty @Size(max = 64) String title, @Size(max = 64) String memo,
        @NotEmpty String status, @NotEmpty String dueDate) {
}

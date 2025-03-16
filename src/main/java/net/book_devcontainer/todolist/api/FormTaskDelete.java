package net.book_devcontainer.todolist.api;

import jakarta.validation.constraints.NotNull;

record FormTaskDelete(@NotNull Integer id) {
}
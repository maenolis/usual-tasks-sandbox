package com.maenolis.uts.dtos.rest.pagination;

import java.util.Arrays;
import java.util.Optional;

public enum PageOrdering {

    ASC("asc"),
    DESC("desc");

    private final String ordering;

    PageOrdering(String ordering) {
        this.ordering = ordering;
    }

    public static PageOrdering getDefault() {
        return ASC;
    }

    public String getOrdering() {
        return ordering;
    }

    public static Optional<PageOrdering> find(String ordering) {
        return Arrays.stream(values())
            .filter(value -> value.getOrdering().equalsIgnoreCase(ordering))
            .findFirst();
    }

}
